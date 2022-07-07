package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws IOException {
		
		String file="C:\\Users\\SAI\\eclipse-workspace\\Batch_10B_Framework\\Config\\config.properties";
		FileInputStream fis=new FileInputStream(file);
		
		pro=new Properties();
		pro.load(fis);
		
	}
	public String getQAENV_1() {
		return pro.getProperty("QAENV_1");
	}	
}
