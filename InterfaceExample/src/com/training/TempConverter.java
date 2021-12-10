package com.training;
 import com.training.ifaces.Function;
 
public class TempConverter implements Function{

	@Override
	public double apply(double args) {
		// TODO Auto-generated method stub
		return (args *9/5)+32;

	
	}

}

