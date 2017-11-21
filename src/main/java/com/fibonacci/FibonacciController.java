package com.fibonacci;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v1/")
public class FibonacciController {
	
	@RequestMapping("/getFib")
	public String returnFibonnaci(@RequestParam String number) {
		Integer numberInt = null ;
		if(number == null || number.length() == 0) {
			return "Number not present";
		}
		try {
			 numberInt = Integer.parseInt(number);
		} catch (Exception ex) {
			return "Enter a valid number";
		}
		if(numberInt<0) {
			return "Enter a positive number";
		}
		if(numberInt > 100) {
			return "Enter a number between 0 and 100";
		}
		List<Long> numberList = getFibList(numberInt);
		String fibString = numberList.stream().map(Object::toString).collect(Collectors.joining(","));
		return fibString;
	}

	public List<Long> getFibList(Integer numberInt) {
		List<Long> numList = new ArrayList<Long>();
		numList.add(0l);
		numList.add(1l);
		int n1=0,n2=1,n3,i,count=numberInt;
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  numList.add(Long.valueOf(n3));    
		  n1=n2;    
		  n2=n3;    
		 }    
		 
		 return numList;
		 //Integer.MAX_VALUE =  2147483647
		 //Integer.MIN_VALUE = -2147483648
		  
		 //Long.MAX_VALUE =  9223372036854775807
		 //Long.MIN_VALUE = -9223372036854775808
	}

}
