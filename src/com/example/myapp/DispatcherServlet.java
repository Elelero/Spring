package com.example.myapp;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.myapp.controller.CommandHandler;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		//서블릿 초기화 파라미터를 읽음, 설정파일의 위치
		String configFile = getInitParameter("configFile");
		//프로퍼티 객체 생성
		Properties prop = new Properties();
		String configFilePath = getServletContext().getRealPath(configFile);
		
		try(FileReader inStream = new FileReader(configFilePath)) {
			prop.load(inStream);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		// 프로퍼티에 있는 키와 값으로, 
		// 키는 그대로 맵의 키에 저장하고 
		// 프로퍼티의 값은 인스턴스를 만들어 맵의 값에 저장
		Iterator<?> keys = prop.keySet().iterator();
		while(keys.hasNext()) {
			String command = (String) keys.next();
			String handlerClassName = prop.getProperty(command);
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				CommandHandler handlerInstance = (CommandHandler) handlerClass.newInstance();
				commandHandlerMap.put(command, handlerInstance);
			} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException();
			}
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processServlet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processServlet(request, response);
	}

	protected void processServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String command = request.getRequestURI();
		if(command.indexOf(request.getContextPath())==0) {
			command = command.substring(request.getContextPath().length());
		}
		
		CommandHandler handler = commandHandlerMap.get(command);
		String viewPage = handler.process(request, response);
		if((viewPage!=null) && (viewPage.indexOf("redirect:")==0)) {
			viewPage = viewPage.substring(9); //컨트롤러(커맨드핸들러) URL
			response.sendRedirect(viewPage);
			return;
		}
		
		viewPage = "/WEB-INF/views/" + viewPage;
		
		RequestDispatcher disp = request.getRequestDispatcher(viewPage);
		disp.forward(request, response);
	}
	
	
}
