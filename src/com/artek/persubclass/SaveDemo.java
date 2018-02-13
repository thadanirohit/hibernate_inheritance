package com.artek.persubclass;

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

		File dirCfg = new File ("./src/persubclass/persubclass.cfg.xml");
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
		Circle c1 = new Circle();		
		c1.setCircleId(1);
		c1.setRadius(4.2);
		c1.setArea((22/7)*4.2*4.2);
		c1.setParimeter(2*(22/7)*4.2);
		c1.setShapeId(5);
		
		Square s1 = new Square();
		s1.setSquareId(2);
		s1.setSide(2.5);
		s1.setArea(2.5*2.5);
		s1.setParimeter(4*2.5);
		s1.setShapeId(2);
		
		Triangle t1 = new Triangle();
		t1.setTraingleId(1);
		t1.setBase(1.5);
		t1.setAltitude(2.0);
		t1.setArea(0.5*1.5*2.0);
		t1.setParimeter(5.2);
		
		s.save(c1);
		s.save(s1);
		s.save(t1);
		
		t.commit();
		s.close();

	}

}
