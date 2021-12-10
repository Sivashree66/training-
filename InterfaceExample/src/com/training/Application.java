package com.training;
 
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;
import com.training.model.Student;
import com.training.model.Professor;

public class Application {
	public static void printResult(Conditional condition) {
		System.out.println(condition.test());
	}
	public static void printvalues(Function[] objects) {
		
		for(Function eachFunction:objects) {
			System.out.println(eachFunction.apply(50));
		}
	}
	public static void main(String[] args) {
		
		
		Function usdToInr =new CurrencyConverter();
		
		Function celTofar =new TempConverter();
		
		Function[] function= {usdToInr,celTofar};
	
		printvalues(function);
		
		Student ram=new Student (100,80);
		
		printResult(ram);
		Professor Kanna=new Professor(202,"mca");
		printResult(Kanna);
		
		
	}

	
}
