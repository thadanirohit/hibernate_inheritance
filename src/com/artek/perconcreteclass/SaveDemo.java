package com.artek.perconcreteclass;

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

		File dirCfg = new File ("./src/perconcreteclass/perconcreteclass.cfg.xml");
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
		Developer d1 = new Developer();
		d1.setName("Rohit");
		d1.setSerialNo(1);
		d1.setDeveloperProject("Encryption");
		
		Developer d2 = new Developer();
		d2.setName("Pranjal");
		d2.setSerialNo(2);
		d2.setDeveloperProject("Stagenography");
		
		Tester t1 = new Tester();
		t1.setName("Sarvesh");
		t1.setSerialNo(1);
		t1.setTesterProject("BOA");
		
		Tester t2 = new Tester();
		t2.setName("Munjal");
		t2.setSerialNo(2);
		t2.setTesterProject("Agilent");
		
		s.save(d1);
		s.save(d2);
		s.save(t1);
		s.save(t2);
		
		t.commit();
		s.close();

	}

}
