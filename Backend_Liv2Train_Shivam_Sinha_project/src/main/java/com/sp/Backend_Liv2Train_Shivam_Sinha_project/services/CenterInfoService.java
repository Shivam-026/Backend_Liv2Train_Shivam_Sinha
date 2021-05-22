package com.sp.Backend_Liv2Train_Shivam_Sinha_project.services;

import java.util.List;

import com.sp.Backend_Liv2Train_Shivam_Sinha_project.entities.CenterInfo;

public interface CenterInfoService {

	public List<CenterInfo> getcenterInfo();
	
	public CenterInfo addCenterInfo(CenterInfo CenterInfo);
}

