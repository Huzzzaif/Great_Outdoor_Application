package com.capg.team2.goa.repositoryimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.team2.goa.entity.SalesReportEntity;
import com.capg.team2.goa.exception.SalesReportException;
import com.capg.team2.goa.repository.ISalesReportRepository;
import com.capg.team2.goa.repository.SalesReportRepository;

public class ISalesReportRepositoryImp implements ISalesReportRepository {
	
	@Autowired
	private SalesReportRepository salesreportrepository;

	@Override
	public List<SalesReportEntity> findAllSalesReport() throws SalesReportException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesReportEntity findSalesReportByProductId(String productId) throws SalesReportException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProductReport(SalesReportEntity salesreportentity) throws SalesReportException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllSalesReport() throws SalesReportException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSalesReportById(Long salesReportId) throws SalesReportException {
		// TODO Auto-generated method stub
		
	}

}
