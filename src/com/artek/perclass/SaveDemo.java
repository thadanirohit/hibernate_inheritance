package com.artek.perclass;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.artek.sf.Resources;

public class SaveDemo {

	public static void main(String[] args) {

		File dirCfg = new File ("./src/perclass/perclass.cfg.xml");
		try {
			System.out.println(dirCfg.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Resources r = new Resources(dirCfg);		
		SessionFactory sf = r.sf;

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		// save code
		Car c1 = new Car();
		c1.setWeight(300.00);
		c1.setCarCompany("Hyundai");
		
		Car c2 = new Car();
		c2.setWeight(250.50);
		c2.setCarCompany("Maruti");
		
		Bike b1 = new Bike();
		b1.setWeight(110.25);
		b1.setBikeCompany("Honda");
		
		s.save(c1);
		s.save(c2);
		s.save(b1);
		
		t.commit();
		s.close();

	}

}
