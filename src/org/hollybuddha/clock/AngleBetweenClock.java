package org.hollybuddha.clock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AngleBetweenClock {
	Logger logger = LoggerFactory.getLogger(AngleBetweenClock.class);
	
	String timehhmm= null;
	int hour = 0;
	int mins = 0;
	double angleindeg = 0;
	public AngleBetweenClock(String timeinhhmm){
		timehhmm = timeinhhmm;
	}

	public AngleBetweenClock(int hh, int mm){
		
		hour = hh; mins = mm;
		angleindeg = anglebetween();
	}

	
	
	public double anglebetween(){
		double val = 0;
		// checking angle of hour clock in degree..
		hour= hour%12;
		double angleofhrclock = ( 360 / 12.0) * hour;
		double angleofminclock = ( 360 / 60.0) * mins;
		double deltaangle = mins * 1/ 12.0;
		
		logger.debug("");
		if( (angleofhrclock+ deltaangle )>= angleofminclock )
			{
				
				val = ( angleofhrclock - angleofminclock ) + deltaangle;
			} else {
				
				val = (  angleofminclock - angleofhrclock ) - deltaangle;
			}
		
		String logentry = "angleofhrclock = "+ angleofhrclock +
				  " angleofminclock = " +angleofminclock + 
				  " deltaangle = "+ deltaangle;
		logger.debug(logentry);
		val = Math.min(val, 360 - val);
		return val;
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(" Angle between "+ hour+":"+mins+" is = "+ angleindeg);
		return builder.toString();
	}

	// h = 1..12, m = 0..59
	static double angle(int h, int m) {
	    double hAngle = 0.5D * (h * 60 + m);
	    double mAngle = 6 * m;
	    double angle = Math.abs(hAngle - mAngle);
	    angle = Math.min(angle, 360 - angle);
	    return angle;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello !!");
	}
}
