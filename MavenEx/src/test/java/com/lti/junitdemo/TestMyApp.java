package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.MyApp;

class TestMyApp {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	void testShow()
	{
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello maven",s);
	}
	
	@Test
	void testAssertFalse()
	{
		Assertions.assertFalse("shikha".length()==10);
		Assertions.assertFalse(10>20,"comparing two values");
		
	}
	@Test
	void testAssertNull()
	{
		String s1=null;
		String s2=null;
		Assertions.assertNull(s2);
		Assertions.assertNotNull(s2);
	}
	
	@Test
	void testAssertAll()
	{
		String str1="abc";
		String str2="pqr";
		String str3="xyz";
		Assertions.assertAll("data",
		       ()->Assertions.assertEquals(str1,"abc"),
		       ()->Assertions.assertEquals(str2,"pqr"),
		       ()->Assertions.assertEquals(str3,"xyz")
		       );
	}
	
	@Test
	void testCollections()
	{
		ArrayList<String> myList=new ArrayList<>();
		myList.add("Hello");
		Assertions.assertFalse(myList.isEmpty());
		
		ArrayList<Integer> myList1=new ArrayList<>();
		Assertions.assertEquals(true,myList1.isEmpty());
		
		
		
		
	}
		       
	

}
