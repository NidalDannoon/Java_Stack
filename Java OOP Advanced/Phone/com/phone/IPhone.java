package com.phone;
public class IPhone extends Phone implements Ringable{
    public IPhone(String versionNumber,int batteryPercentage,String carrier,String ringTone){
        super(versionNumber,batteryPercentage,carrier,ringTone);
    }
    @Override
    public String ring(){
    	String ringer=getRingTone();
		return ringer;
    }
    @Override
    public String unlock(){
		return "Unlocked with fingerprint scanner";
    }
    @Override
    public void displayInfo(){
    	System.out.println("IPhone Version "+getVersionNumber()+" from "+getCarrier() +" has a "+getBatteryPercentage()+"% of the battery");        
    }
}