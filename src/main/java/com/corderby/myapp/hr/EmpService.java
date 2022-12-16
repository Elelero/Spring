package com.corderby.myapp.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements IEmpService {
	
	@Autowired
	IEmpRepositroy empRepository;
	
	@Override
	public int getEmpCount(int deptid) {
		if(deptid > 0) {
			return empRepository.getEmpCount(deptid);
		} else {
			return empRepository.getEmpCount();
		}
	}
	
}
