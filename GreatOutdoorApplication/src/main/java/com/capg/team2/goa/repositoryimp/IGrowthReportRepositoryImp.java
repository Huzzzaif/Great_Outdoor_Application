package com.capg.team2.goa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.GrowthReportEntity;
import com.capg.team2.goa.exception.GrowthReportException;
import com.capg.team2.goa.repository.GrowthReportRepository;
import com.capg.team2.goa.repository.IGrowthReportRepository;

public class IGrowthReportRepositoryImp implements IGrowthReportRepository {
	
	@Autowired
	public GrowthReportRepository growthReportRepository;

	@Override
	public List<GrowthReportEntity> findAllGrowthReport() throws GrowthReportException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addGrowthReport() throws GrowthReportException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllGrowthReport() throws GrowthReportException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGrowthReportById(Long growthReportId) throws GrowthReportException {
		// TODO Auto-generated method stub
		
	}
	
	
	


	
	
}