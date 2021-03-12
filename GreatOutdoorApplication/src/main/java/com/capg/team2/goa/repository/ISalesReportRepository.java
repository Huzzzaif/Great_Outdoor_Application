package com.capg.team2.goa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.capg.team2.goa.entity.SalesReportEntity;
import com.capg.team2.goa.exception.SalesReportException;

@Repository
public interface ISalesReportRepository {
	
	
	List<SalesReportEntity> findAllSalesReport() throws SalesReportException;
	SalesReportEntity findSalesReportByProductId(String productId)throws SalesReportException;
	void updateProductReport(SalesReportEntity salesreportentity)throws SalesReportException;
	void deleteAllSalesReport()throws SalesReportException;
	void deleteSalesReportById(Long salesReportId)throws SalesReportException;
	
}