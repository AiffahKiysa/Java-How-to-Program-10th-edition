package com.trafficlight;

public enum TrafficLight {
	Red(20), Green(20), Yellow(5);
	
	private int value;
	
	TrafficLight(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
