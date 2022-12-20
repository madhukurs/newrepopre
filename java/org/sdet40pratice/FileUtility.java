package org.sdet40pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public   class FileUtility {
	public  String getDataFromPropertyFile(String PropertyFilePath,String Key)
	{
		FileInputStream fis = null;
		//mmsdjcsdnjnljn
		try {
			fis=new FileInputStream(PropertyFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String v = pro.getProperty(Key).trim();
		return v;
		
	}

}

	


