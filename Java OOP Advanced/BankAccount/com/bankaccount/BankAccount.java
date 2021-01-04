package com.bankaccount;
import java.util.Random;

public class BankAccount{
    private String accountNumber="";
    private double checkingBalance=0.0;
    private double savingsBalance=0.0;
    private static int accountsCreated=0;
    private static double totalMoney = 0.0;
    public BankAccount(){
        double checkingBalance=0.0;
        double savingsBalance=0.0;
        accountsCreated +=1;
        String accountNumber=newAccountNumber();
        System.out.println("New Bank account created # of:"+accountNumber);
        System.out.println("Total number of accounts created:"+accountsCreated);     
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    private String newAccountNumber(){
        String groupOfNumbers = "0123456789";
        String randomNumber = "";
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            char number=groupOfNumbers.charAt(rand.nextInt(10));
            randomNumber+=number;
        }
        accountNumber = randomNumber;
        return randomNumber;  
    }
    public void accountDeposit(String type, double depositAmount){
        if(type == "checking"){
            setCheckingBalance(getCheckingBalance()+depositAmount);
            totalMoney+=depositAmount;
        }
        if(type == "savings"){
            setSavingsBalance(getSavingsBalance()+depositAmount);
            totalMoney+=depositAmount;
        }
        else{
            System.out.println("Please determine account type clearly");
        } 
    }
    public void accountWithdrawal(String type, double withdrawalAmount){
        if(type == "checking"){
            if(withdrawalAmount>getCheckingBalance()){
                System.out.println("Insufficient balance");
            }
            else{
            setCheckingBalance(getCheckingBalance()-withdrawalAmount);
            totalMoney-=withdrawalAmount;
            }
        }
        if(type == "savings"){
            if(withdrawalAmount>getSavingsBalance()){
                System.out.println("Insufficient balance");
            }
            else{
            setSavingsBalance(getSavingsBalance()-withdrawalAmount);
            totalMoney-=withdrawalAmount;
            }
        }
    }
    public double totalBalance(){
        double totalBalance=checkingBalance+savingsBalance;
        System.out.println(totalBalance);
        return totalBalance;
    }
}
