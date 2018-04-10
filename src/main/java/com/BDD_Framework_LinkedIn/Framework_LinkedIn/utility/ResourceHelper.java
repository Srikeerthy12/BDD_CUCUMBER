package com.BDD_Framework_LinkedIn.Framework_LinkedIn.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;



public class ResourceHelper {
	

		public static String getResourcePath(String resource) {
			String path = getBaseResourcePath() + resource;
			return path;
		}
		
		public static String getBaseResourcePath() {
			String path = System.getProperty("user.dir");
			System.out.println(path);
			return path;
		}
		
		public static InputStream getResourcePathInputStream(String resource) throws FileNotFoundException{
			return new FileInputStream(ResourceHelper.getResourcePath(resource));
		}
		
		public static void main(String[] args) throws FileNotFoundException {
			//System.out.println(ResourceHelper.getResourcePath("configfile/"+ "config.properties"));	
			
			getBaseResourcePath() ;
		}
		
	}


