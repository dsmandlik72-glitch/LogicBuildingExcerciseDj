package com.question1;

import java.util.Scanner;

public  abstract class ParentClass {
private int number1;
private int number2;
private int addition;

public ParentClass(ParentClassBuilder obj) {
	this.number1=obj.number1;
	this.number2=obj.number2;
	addition=addition();
	
}

protected  int addition() {
	return number1+number2;
}

@Override
public String toString() {
	return "ParentClass [number1=" + number1 + ", number2=" + number2 + ", addition=" + addition + "]";
}

public static abstract class ParentClassBuilder{
	
	private int number1;
	private int number2;
	private int addition;
	
	public ParentClassBuilder(int number1, int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
	protected abstract ParentClass build();
}
}