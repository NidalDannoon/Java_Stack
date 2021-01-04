package com.calculator1;
public class Calculator{
	private double operandOne = 0.0;
	private String operation = "";
	private double operandTwo = 0.0;
	private double mathResult = 0.0;
	public Calculator(){
	}
	public Calculator(double operandOne, String operation, double operandTwo){
		this.operandOne=operandOne;
		this.operation=operation;
		this.operandTwo=operandTwo;
	}
	public double getOperandOne(){
		return operandOne;
	}
	public String getOperation(){
		return operation;
	}
	public double getOperandTwo(){
		return operandTwo;
	}
	public double getMathResult(){
		return mathResult;
	}
	public void setOperandOne(double operandOne){
		this.operandOne=operandOne;
	}
	public void setOperation(String operation){
		this.operation=operation;
	}
	public void setOperandTwo(double operandTwo){
		this.operandTwo=operandTwo;
	}
	public void setMathResult(double mathResult){
		this.mathResult=mathResult;
	}
	public void performOperation(){
		if(getOperation().equals("+")){
			double result=getOperandOne()+getOperandTwo();
			setMathResult(result);
		}
		else if(getOperation().equals("-")){
			double result=getOperandOne()-getOperandTwo();
			setMathResult(result);
		}
	}
	public void getResults(){
		System.out.println(getMathResult());
	}	
}
