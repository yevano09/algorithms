package org.hollybuddha.clock;

public class AngleBetweenClock {
	String timehhmm= null;
	int hour = 0;
	int mins = 0;
	float angleindeg = 0;
	public AngleBetweenClock(String timeinhhmm){
		timehhmm = timeinhhmm;
	}

	public AngleBetweenClock(int hh, int mm){
		
		hour = hh; mins = mm;
		angleindeg = anglebetween();
	}

	public static void main(String[] args) {

		AngleBetweenClock clk = new AngleBetweenClock(10, 30);
		System.out.println(clk);
		
		clk = new AngleBetweenClock(8, 30);
		System.out.println(clk);
		
		clk = new AngleBetweenClock(12, 00);
		System.out.println(clk);

	}
	
	public float anglebetween(){
		float val = 0;
		// checking angle of hour clock in degree..
		hour= hour%12;
		float angleofhrclock = ( 360 / 12) * hour;
		float angleofminclock = ( 360 / 60) * mins;
		float deltaangle = mins * 1/ 12;
		
		if( angleofhrclock > angleofminclock )
			{
				
				val = ( angleofhrclock - angleofminclock ) + deltaangle;
			} else {
				
				val = (  angleofminclock - angleofhrclock ) - deltaangle;
			}
		
		return val;
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(" Angle between "+ hour+":"+mins+" is = "+ angleindeg);
		return builder.toString();
	}

}
