package com.capgemini.junit;

import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.*;

import com.capgemini.bin.*;
import com.capgemini.collection.*;
import com.capgemini.exception.*;
import com.capgemini.validator.*;
import org.junit.runners.MethodSorters;

//Running test cases in order of method names in ascending order
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_Collector {
	Collector val=new Collector();

	
	@Test
	
	public void firstID() throws ItemException {

		Assert.assertEquals("fails due to wrong count value",3,val.count_records());
		
	}
	
	
	@Test
	public void second_add() throws ItemException {

		ItemSchema object=new ItemSchema(123,"Krishna",1234.55,9877);
		Collector.adddetails(object);
		Assert.assertEquals("fails due to wrong count value",4,val.count_records());
		
	}
	
	@Test
	public void test_remove() throws ItemException {
		Collector.remove_by_id(15);
		Assert.assertEquals("fails due to wrong count value",3,val.count_records());
		
	}
	
	
}
