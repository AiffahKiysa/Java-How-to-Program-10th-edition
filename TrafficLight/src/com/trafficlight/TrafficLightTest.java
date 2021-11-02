package com.trafficlight;

public class TrafficLightTest {

	public static void main(String[] args){
        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.println(trafficLight + "\t" + trafficLight.getValue());
        }
    }

}
