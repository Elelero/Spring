package com.corderby.myapp.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmpController {
	//field
	@Autowired
	IEmpService empService;
	
	/*//Setter
	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}*/
	
	//method
	public void printInfo() {
		int count = empService.getEmpCount(50);
		System.out.println("사원의 수: " + count);
	}
	
}
