package com.sample.myapp.hr;

import java.util.List;
import java.util.Map;

public interface IEmpService {
	public String getEmpCount();
	public int getEmpCount(int deptid);
	public List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empid);
	void updateEmp(EmpVO emp);
	void insertEmp(EmpVO emp);
	int deleteEmp(int empid, String email);
	List<Map<String, Object>> getAllDeptId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
}
