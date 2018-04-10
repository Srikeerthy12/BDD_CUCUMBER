package com.BDD_Framework_LinkedIn.Framework_LinkedIn.configreader;

import java.util.Properties;

import org.apache.log4j.Level;

import com.BDD_Framework_LinkedIn.Framework_LinkedIn.utility.ResourceHelper;



public class PropertyFileReader implements ConfigReader {
	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper.getResourcePathInputStream("configfile/" + "config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getUserName(){
		return prop.getProperty("Username");
		}
	public String getPassword(){
		return prop.getProperty("Password");
		}
	public String getWebsite(){
		return prop.getProperty("Website");
		}
	public int getPageLoadTimeOut(){
		return Integer.parseInt(prop.getProperty("pageloadTimeout"));
		}
	public int getImplictWait(){
		return Integer.parseInt(prop.getProperty("ImplictWait"));
		}
	public int getExplictWait(){
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
		}
	public BrowserType getBrowser(){
		return BrowserType.valueOf(prop.getProperty("Browser"));
				}
	public Level getLoggerLevel(){
		
		switch (prop.getProperty("Logger.Level")){
		case "DEBUG":
				return Level.DEBUG;
		case "INFO":
		        return Level.INFO;
		case "WARN":
				return Level.WARN;
		case "FATAL":
				return Level.FATAL;
		}
		return Level.ALL;
	}
				
						
	}

