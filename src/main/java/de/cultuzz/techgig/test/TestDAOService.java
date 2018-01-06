package de.cultuzz.techgig.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.cultuzz.techgig.model.DistributorHasCltzProduct;
import de.cultuzz.techgig.model.HotelDetails;
import de.cultuzz.techgig.model.Packages;
import de.cultuzz.techgig.model.Room;
import de.cultuzz.techgig.model.Validity;

@Service
public class TestDAOService {
	
	
	@Autowired
	protected SessionFactory mySessionFactory;

	 @Transactional(readOnly=true)
	    public List<Room> findAllData() throws Exception{
		 System.out.println(mySessionFactory+"mySessionFactory");
		 Criteria criteria = mySessionFactory.getCurrentSession().createCriteria(de.cultuzz.techgig.model.Room.class);
		 List<Room> list = criteria.list();
		 System.out.println(list.size());
		 for(Iterator<Room> it = list.iterator();it.hasNext();){
			 Room hotelDetails = it.next();
			 System.out.println("hotelDetails.getGeoCodes()"+hotelDetails.getPackages());
			 for(Iterator<Packages> itx = hotelDetails.getPackages().iterator();itx.hasNext();){
				 Packages packages = itx.next();
				 System.out.println("packages.getName()"+packages.getName());
			 }
		 }
		 return list;
	 }
	
	 @Transactional(readOnly=true)
	 public void fetchDataByJoin(){
		 Criteria criteria = mySessionFactory.getCurrentSession().createCriteria(de.cultuzz.techgig.model.Room.class);
		 Criteria criteria2 = criteria.createCriteria("packages");
		 List<Room> list = criteria.list();
		 for(Iterator<Room> itx = list.iterator();itx.hasNext();){
			 Room packages = itx.next();
			 System.out.println("packages.getName()"+packages.getName());
		 }
	 }

	 
	 @Transactional(readOnly=true)
	    public List<Packages> findAllData4() throws Exception{
		 System.out.println(mySessionFactory+"mySessionFactory");
		 Criteria criteria = mySessionFactory.getCurrentSession().createCriteria(de.cultuzz.techgig.model.Packages.class);
		 List<Packages> list = criteria.list();
		 System.out.println(list.size());
		 for(Iterator<Packages> it = list.iterator();it.hasNext();){
			 Packages hotelDetails = it.next();
			 System.out.println("hotelDetails.getGeoCodes()"+hotelDetails.getName());
			 for(Iterator<Validity> itx = hotelDetails.getValidity().iterator();itx.hasNext();){
				 Validity packages = itx.next();
				 System.out.println("packages.getName()"+packages.getStart());
			 }
		 }
		 return list;
	 }
	 
	 @Transactional(readOnly=true)
	    public List<HotelDetails> findAllData3() throws Exception{
		 System.out.println(mySessionFactory+"mySessionFactory");
		 Criteria criteria = mySessionFactory.getCurrentSession().createCriteria(de.cultuzz.techgig.model.HotelDetails.class);
		 List<HotelDetails> list = criteria.list();
		 System.out.println(list.size());
		 for(Iterator<HotelDetails> it = list.iterator();it.hasNext();){
			 HotelDetails hotelDetails = it.next();
			 System.out.println("hotelDetails.getGeoCodes()");
			
		 }
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
