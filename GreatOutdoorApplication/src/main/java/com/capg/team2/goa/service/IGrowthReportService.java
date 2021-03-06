package com.capg.team2.goa.service;
import java.util.List;


import org.springframework.stereotype.Service;

import com.capg.team2.goa.entity.GrowthReportEntity;
import com.capg.team2.goa.exception.GrowthReportException;

@Service
public interface IGrowthReportService {
	
	
	List<GrowthReportEntity> findAllGrowthReport() throws GrowthReportException;

	void addGrowthReport() throws GrowthReportException;

	void deleteAllGrowthReport() throws GrowthReportException;

	void deleteGrowthReportById(Long growthReportId)throws GrowthReportException;
}