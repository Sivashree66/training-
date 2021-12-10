package com.training.model;
import com.training.ifaces.Conditional;

public class Student implements Conditional{
	
	private int id;
	private double mark;
	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.mark>70;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, double mark) {
		super();
		this.id = id;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}

	
	
