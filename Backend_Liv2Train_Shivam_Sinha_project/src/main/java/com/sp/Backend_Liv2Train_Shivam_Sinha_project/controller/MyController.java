package com.sp.Backend_Liv2Train_Shivam_Sinha_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.sp.Backend_Liv2Train_Shivam_Sinha_project.entities.CenterInfo;
import com.sp.Backend_Liv2Train_Shivam_Sinha_project.services.CenterInfoService;



@RestController
public class MyController {
	
	@Autowired
	private CenterInfoService CenterInfoService;
	
	
	
	//get the training centers information
	
	@GetMapping("/CenterInfo")
	
	public List<CenterInfo> getCenterInfo()
	{
		return this.CenterInfoService.getcenterInfo();
		
		
	}
	@PostMapping(path="/Centerinfo",consumes="application/json")
	public CenterInfo addCenterInfo(@RequestBody CenterInfo CenterInfo) {
		return this.CenterInfoService.addCenterInfo(CenterInfo);
		
	}
	
	

}
