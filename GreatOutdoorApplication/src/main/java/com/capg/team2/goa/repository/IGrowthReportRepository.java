package com.capg.team2.goa.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;
import com.capg.team2.goa.entity.GrowthReportEntity;
import com.capg.team2.goa.exception.GrowthReportException;

@Repository
public interface IGrowthReportRepository {
	
	
	List<GrowthReportEntity> findAllGrowthReport() throws GrowthReportException;

	void addGrowthReport() throws GrowthReportException;

	void deleteAllGrowthReport() throws GrowthReportException;

	void deleteGrowthReportById(Long growthReportId)throws GrowthReportException;
}