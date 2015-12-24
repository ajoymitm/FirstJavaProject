package TestData;

import org.testng.annotations.DataProvider;

public class FirstDP {

		 @DataProvider(name="SearchProvider")
		 	        public static Object[][] getDataFromDataprovider(){
	 
			 Object[][] names = new Object[][]{
					 new Object[]{"name1"},
//					 new Object[]{"name2"},
//					 new Object[]{"name3"}
			 };
			 			 
			 return names;
	 
		 }
	}


