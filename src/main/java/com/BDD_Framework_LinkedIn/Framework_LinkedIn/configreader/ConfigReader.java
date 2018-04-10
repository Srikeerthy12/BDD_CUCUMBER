package com.BDD_Framework_LinkedIn.Framework_LinkedIn.configreader;



public interface ConfigReader {
	
		public String getUserName();
		public String getPassword();
		public String getWebsite();
		public int getPageLoadTimeOut();
		public int getImplicitWait();
		public int getExplicitWait();
		public BrowserType getBrowser();
	}

}
