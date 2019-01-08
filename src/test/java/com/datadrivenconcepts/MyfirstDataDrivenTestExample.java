package com.datadrivenconcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyfirstDataDrivenTestExample {

	@Test(dataProvider="datasupplier")
	public void testSearchFlipkart(String searchtxt,String res)
	{
		System.out.println(searchtxt);
		System.out.println(res);
	}
	@DataProvider(name="datasupplier")
	public Object[][]testData(){
		Object[][]testdta= {{"iphone","6s"},
	                    	{"television","sony"},
	                    	{"shoe","puma"}};
		return testdta;
		}                   
	}

