package com.sample.myapp.hr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	//field
	@Autowired
	IEmpService empService;
	
	//method: 사원의 수 확인
	@RequestMapping("/hr/count")
	public String empCount(@RequestParam(value="deptid", required=false, defaultValue="0") int deptid, Model model) {
		// http://localhost:8080/hr/count?deptid=50 요청옴
		if(deptid==0) {
			model.addAttribute("count", empService.getEmpCount());
		} else {
			model.addAttribute("count", empService.getEmpCount(deptid));
		}
		return "hr/count";
	}
	
	//method: 사원 정보목록 조회
	@RequestMapping(value= {"/hr/list"})
	public String getAllEmps(Model model) {
		List<EmpVO> empList = empService.getEmpList();
		model.addAttribute("empList", empList);
		return "hr/list";
	}
	
	//method: 사원 상세정보 조회
	@RequestMapping(value="/hr/{employeeId}")
	public String getEmpInfo(@PathVariable int employeeId, Model model) {
		EmpVO emp = empService.getEmpInfo(employeeId);
		model.addAttribute("emp", emp);
		return "hr/view";
	}
	
	//method: 사원 등록창
	@RequestMapping(value="/hr/insert", method=RequestMethod.GET)
	public String insertEmp(Model model) {
		model.addAttribute("deptList", empService.getAllDeptId());
		model.addAttribute("jobList", empService.getAllJobId());
		model.addAttribute("managerList", empService.getAllManagerId());
		return "hr/insertform";
	}
	
	//method: 사원 등록한 후, 목록 이동
	@RequestMapping(value="/hr/insert", method=RequestMethod.POST)
	public String insertEmp(EmpVO emp) {
		empService.insertEmp(emp);
		return "redirect:/hr/list";
	}
	
	//method: 사원정보 수정창
	@RequestMapping(value="/hr/update", method=RequestMethod.GET)
	public String updateEmp(int empid, Model model) {
		model.addAttribute("emp", empService.getEmpInfo(empid));
		model.addAttribute("deptList", empService.getAllDeptId());
		model.addAttribute("jobList", empService.getAllJobId());
		model.addAttribute("managerList", empService.getAllManagerId());
		return "hr/updateform";
	}

	//method: 사원정보 수정한 후, 목록 이동
	@RequestMapping(value="/hr/update", method=RequestMethod.POST)
	public String updateEmp(EmpVO emp) {
		empService.updateEmp(emp);
		return "redirect:/hr/list";
	}
	
	//method: 사원정보 삭제창
	@RequestMapping(value="/hr/delete", method=RequestMethod.GET)
	public String deleteEmp(int empid, Model model) {
		model.addAttribute("emp", empService.getEmpInfo(empid));
		return "hr/deleteform";
	}

	//method: 사원정보 삭제한 후, 목록 이동
	@RequestMapping(value="/hr/delete", method=RequestMethod.POST)
	public String deleteEmp(int empid, String email) {
		empService.deleteEmp(empid, email);
		return "redirect:/hr/list";
	}
	
	//method: 에러처리
	@ExceptionHandler({RuntimeException.class})
	public ModelAndView runtimeException(HttpServletRequest req, Exception e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("url", req.getRequestURI());
		mav.addObject("exception", e);
		mav.setViewName("error/runtime");
		return mav;
	}
	
	//method
	public void printInfo() {
		int count = empService.getEmpCount(50);
		System.out.println("사원의 수: " + count);
	}
	
}
