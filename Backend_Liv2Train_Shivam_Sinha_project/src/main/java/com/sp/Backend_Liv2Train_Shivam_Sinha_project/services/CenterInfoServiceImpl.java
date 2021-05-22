package com.sp.Backend_Liv2Train_Shivam_Sinha_project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sp.Backend_Liv2Train_Shivam_Sinha_project.entities.CenterInfo;

@Service
public class CenterInfoServiceImpl implements CenterInfoService {
	
	List<CenterInfo> list;
	
	public CenterInfoServiceImpl() {
		list=new ArrayList<>();
		
	}


	@Override
	public List<CenterInfo> getcenterInfo() {
		
		return list;
	}


	@Override
	public CenterInfo addCenterInfo(CenterInfo CenterInfo) {
		list.add(CenterInfo);
		return CenterInfo;
	}

	
}
