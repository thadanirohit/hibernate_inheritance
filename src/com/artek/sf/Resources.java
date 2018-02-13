package com.artek.sf;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Resources {
	
	public Configuration cfg;
	public SessionFactory sf;
	
	public Resources(File cfg_source){
		cfg = new Configuration();
		cfg.configure(cfg_source);
		sf = cfg.buildSessionFactory();
	}
	
}
