package com.corderby.myapp.hr;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements IEmpService {
	
	@Autowired
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount(int deptid) {
		if(deptid > 0) {
			return empRepository.getEmpCount(deptid);
		} else {
			return empRepository.getEmpCount();
		}
	}

	@Override
	public List<EmpVo> getEmpList() {
		return empRepository.getEmpList();
	}

	@Override
	public EmpVo getEmpInfo(int empid) {
		return empRepository.getEmpInfo(empid);
	}

	@Override
	public void updateEmp(EmpVo emp) {
		empRepository.updateEmp(emp);
		
	}

	@Override
	public void insertEmp(EmpVo emp) {
		empRepository.insertEmp(emp);
	}

	@Override
	public int deleteEmp(int empid, String email) {
		empRepository.deleteJobHistory(empid);
		return empRepository.deleteEmp(empid, email);
	}

	@Override
	public List<Map<String, Object>> getAllDetId() {
		return empRepository.getAllDetId();
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		return empRepository.getAllJobId();
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		return empRepository.getAllManagerId();
	}
	
}
