package com.time2;

public class Time2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time2 t1 = new Time2();             // 00:00:00
	    Time2 t2 = new Time2(2);            // 02:00:00
	    Time2 t3 = new Time2(22, 34);       // 21:34:00
	    Time2 t4 = new Time2(14, 20, 45);   // 12:25:42
	    Time2 t5 = new Time2(22, 58, 59);   // 22:58:59

	    //all arguments defaulted
	    System.out.println("T1 in Universal Format : \t" + t1.toUniversalString());
	    System.out.println("T1 in Standard Format  : \t" + t1.toString());
	    System.out.println("-------------------------------");

	    //minute and second defaulted
	    System.out.println("T2 in Universal Format : \t" + t2.toUniversalString());
	    System.out.println("T2 in Standard Format  : \t" + t2.toString());
	    System.out.println("-------------------------------");
	    
        //hour and minute specified: second defaulted
	    System.out.println("T3 in Universal Format : \t" + t3.toUniversalString());
	    System.out.println("T3 in Standard Format  : \t" + t3.toString());
	    System.out.println("-------------------------------");

        //hour, minute and second specified;
	    System.out.println("T4 in Universal Format : \t" + t4.toUniversalString());
	    System.out.println("T4 in Standard Format  : \t" + t4.toString());
	    System.out.println("-------------------------------");

        //hour, minute and second specified;
	    System.out.println("T5 in Universal Format : \t" + t5.toUniversalString());
	    System.out.println("T5 in Standard Format : \t" + t5.toString());

        System.out.println("\nincrement hour(1) and minute(1)");
        t5.incrementHour();
        t5.incrementMinute();
        System.out.println("T5 in Universal Format : \t" + t5.toUniversalString());
	    System.out.println("T5 in Standard Format : \t" + t5.toString());

        System.out.println("\ntick and increment second(1)");
        t5.tick();

        System.out.println("T5 in Universal Format : \t" + t5.toUniversalString());
	    System.out.println("T5 in Standard Format : \t" + t5.toString());
	    System.out.println("-------------------------------");

	}
}
