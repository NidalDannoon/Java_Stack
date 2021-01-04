package com.phone;
public interface Ringable {

	public default String ring(){
		return "Ringing ...";
	}
	public default String unlock(){
		return "Phone Unlocked";
	}	
}