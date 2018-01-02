package de.cultuzz.techgig.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.cultuzz.techgig.model.DistributorHasCltzProduct;
import de.cultuzz.techgig.model.HotelDetails;
import de.cultuzz.techgig.model.Test;

@Service
public class TestDAOService {
	
	
	@Autowired
	protected SessionFactory mySessionFactory;

	 @Transactional(readOnly=true)
	    public List<HotelDetails> findAllData() throws Exception{
		 System.out.println(mySessionFactory+"mySessionFactory");
		 Criteria criteria = mySessionFactory.getCurrentSession().createCriteria(de.cultuzz.techgig.model.HotelDetails.class);
		 List<HotelDetails> list = criteria.list();
		 return list;
	 }
	
	 @Transactional(readOnly=true)
	    public List<Test> findAllData2() throws Exception{
		 System.out.println(mySessionFactory+"mySessionFactory");
		 Criteria criteria = mySessionFactory.getCurrentSession().createCriteria(de.cultuzz.techgig.model.Test.class);
		 List<Test> list = criteria.list();
		 return list;
	 }
	 
	 @Transactional(readOnly=true)
	    public List<DistributorHasCltzProduct> findAllData1() throws Exception{
		 System.out.println(mySessionFactory+"mySessionFactory");
		 Criteria criteria = mySessionFactory.getCurrentSession().createCriteria(de.cultuzz.techgig.model.DistributorHasCltzProduct.class);
		 List<DistributorHasCltzProduct> list = criteria.list();
		 return list;
	 }

}
