package com.time2;

public class Time2 {
    private int hour;
    private int minute; 
    private int second;
    
	public Time2() {
		// TODO Auto-generated constructor stub
		this(0, 0, 0);
	}
	
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
	}
    
	public Time2(int hour, int minute, int second){
        setTime(hour, minute, second);
    }
	
	public void setTime(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
    }
	
	public void setHour(int hour){
		if(hour < 0 || hour > 23) {
  		  throw new IllegalArgumentException("hour must be 0-23");
        }
		this.hour = hour;
    }

	public void setMinute(int minute){
        if(minute < 0 || minute > 59) {
  		  throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }
	
    public void setSecond(int second){
    	if(second < 0 || second > 59)
  		  throw new IllegalArgumentException("seconds must be 0-59");
    }
    
    public int getHour() {
    	return hour;
    }
    public int getMinute() {
    	return minute;
    }
    public int getSecond() {
    	return second;
    }
    
    public void tick() {
    	if (second < 59) {
    		second += 1;
    	}
    	else {
    		second = 0;
    		incrementMinute();  
    	}
    }
    
    public void incrementMinute() {
    	if (minute < 59) {
    		minute += 1;
    	}
    	else {
    		minute = 0;
    		incrementHour();
    	}
    }
    
    public void incrementHour() {
    	if (hour < 23) {
    		hour += 1;
    	}
    	else {
    		hour = 0;
    	}
    }
    
    public String toUniversalString(){
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
