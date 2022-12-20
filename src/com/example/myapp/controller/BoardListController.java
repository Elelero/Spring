package com.example.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardListController implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("게시판 목록 조회!");
		
		//biz() 호출
		request.setAttribute("data", "HelloWorld");
		
		return "boardlist.jsp";
	}

}
