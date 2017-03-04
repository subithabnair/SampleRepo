package com.cts.yahoosearch.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	public static String getPropertyValue(String bn) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\Config\\config.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(bn);
	}
	public static String getPropertyValue(String bn,String filename) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\Config\\"+filename+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(bn);
	}
}
