package com.capg.team2.goa.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.capg.team2.goa.entity.SalesReportEntity;
import com.capg.team2.goa.exception.SalesReportException;

@Service
public interface ISalesReportService {
	
	
	List<SalesReportEntity> findAllSalesReport() throws SalesReportException;
	SalesReportEntity findSalesReportByProductId(String productId)throws SalesReportException;
	void updateProductReport(SalesReportEntity salesreportentity)throws SalesReportException;
	void deleteAllSalesReport()throws SalesReportException;
	void deleteSalesReportById(Long salesReportId)throws SalesReportException;
	
}