package com.capgemini.validator;

import java.util.regex.*;

import com.capgemini.exception.*;

public class Validator {

	
	public static boolean validate_id(String id) throws ItemException
	{
		//String sid=Integer.toString(id);
		String pattern = "(\\d+)";
		if(Pattern.matches(pattern,id))
			//Pattern.matches(patternString, content);
		{
			return true;
		}
		else
		{
			int a=1;
			//System.out.println(a);
			throw new ItemException(a);
			//return false;
		}
	}
	
	public static boolean validate_name(String name)  throws ItemException
	{
		String pattern = "[A-Za-z]{3,10}";
		if(Pattern.matches(pattern,name))
		{
			return true;
		}
		else
		{
			throw new ItemException(name);
			//return false;
		}
	}
	
	public static boolean validate_price(double price) throws ItemException
	{
		String sid=Double.toString(price);
		String pattern = "[0-9]{1,6}.[0-9]{1,2}";
		if(Pattern.matches(pattern,sid))
		{
			return true;
		}
		else
		{
			throw new ItemException(price);
			//return false;
		}
	}
	
}
