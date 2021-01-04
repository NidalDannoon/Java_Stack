package com.calculator1;
public class CalculatorTest{

	public static void main(String[] args){
		Calculator testOne=new Calculator(88.5,"+",4.9);
		Calculator testTwo=new Calculator(75.9,"-",50.3);
		testOne.performOperation();
		testTwo.performOperation();
		testOne.getResults();
		testTwo.getResults();
	}
}