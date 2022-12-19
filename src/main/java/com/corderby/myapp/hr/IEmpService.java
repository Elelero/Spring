package com.corderby.myapp.hr;

import java.util.List;
import java.util.Map;

public interface IEmpService {
	public int getEmpCount(int deptid);
	public List<EmpVo> getEmpList();
	EmpVo getEmpInfo(int empid);
	void updateEmp(EmpVo emp);
	void insertEmp(EmpVo emp);
	int deleteEmp(int empid, String email);
	List<Map<String, Object>> getAllDetId();
	List<Map<String, Object>> getAllJobId();
	List<Map<String, Object>> getAllManagerId();
}