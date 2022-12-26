package com.sample.myapp.hr;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		//컨트롤러 객체 가져오기
//		EmpController controller = context.getBean(EmpController.class);
//		System.out.println("====================");
//		controller.printInfo();
//		System.out.println("====================");
//		System.out.println();
		
		//서비스 객체 가져오기 
		IEmpService empService = context.getBean(IEmpService.class);

//		System.out.println("------[Emp정보]------");
//		List<EmpVo> empList = empService.getEmpList();
//		System.out.println(empList);
//		System.out.println("--------------------");

//		System.out.println("------[사원의 수 조회]------");
//		System.out.println(empService.getEmpCount(50)); //50번 부서 사원의 수
//		System.out.println("--------------------");

//		System.out.println("------[103번 사원의 정보를 조회]------");
//		System.out.println(empService.getEmpInfo(103));
//		System.out.println("--------------------");

//		System.out.println("------[새로운 사원 정보를 입력]------");
//		EmpVo emp = new EmpVo();
//		emp.setEmployeeId(210);
//		emp.setFirstName("SongMin");
//		emp.setLastName("Han");
//		emp.setEmail("HELLOSPRING");
//		emp.setPhoneNumber("010-5555-5555");
//		emp.setJobId("IT_PROG");
//		emp.setSalary(8000);
//		emp.setCommissionPct(0.2);
//		emp.setManagerId(100);
//		emp.setDepartmentId(10);
//		try {
//			empService.insertEmp(emp);
//			System.out.println("새로운 사원의 정보 입력 성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//		System.out.println("------[새로운 사원 정보를 조회]------");
//		EmpVo emp210 = empService.getEmpInfo(210);
//		System.out.println(emp210);
//		System.out.println("--------------------");
//
//		System.out.println("------[210번 사원의 급여를 10% 인상]------");
//		emp210.setSalary(emp210.getSalary() * 1.1);
//		empService.updateEmp(emp210);
//		System.out.println("------[수정된 사원의 정보를 조회/출력]------");
//		emp210 = empService.getEmpInfo(210);
//		System.out.println(emp210);
//		System.out.println("--------------------");
		
//		System.out.println("------[210번 사원의 정보 삭제]------");
//		empService.deleteEmp(210, "HELLOSPRING");
//		System.out.println("삭제 성공");
//		System.out.println("--------------------");

//		System.out.println("------[모든 부서번호와 부서이름 정보를 출력]------");
//		System.out.println(empService.getAllDetId());
//		System.out.println("--------------------");
//		System.out.println("------[모든 직무아이디와 직무타이틀을 출력]------");
//		System.out.println(empService.getAllJobId());
//		System.out.println("--------------------");
//		System.out.println("------[모든 매니저번호와 매니저이름을  출력]------");
//		System.out.println(empService.getAllManagerId());
//		System.out.println("--------------------");
		
		//리스트에 저장된 맵 객체를 통해 SELECT 구문의 열을 찾음
		List<Map<String, Object>> deptInfo = empService.getAllDeptId();
		for(Map<String, Object> deptId : deptInfo) {
			System.out.print(deptId.get("DEPARTMENTID") + "\t");
			System.out.println(deptId.get("DEPARTMENTNAME"));
		}

		context.close();
	}

}
