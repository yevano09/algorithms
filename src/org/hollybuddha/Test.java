package org.hollybuddha;


public class Test {


//webui attributes
	public final static String Name = "Name";
	public final static String ID = "ID";
	public final static String TranslationType = "Translation type";
	public static String EscapeCode = "Escape code";
	public static String ActionName = "Action name";
	public static String GTIndicator = "Global title indicator";
	public static String Direction = "Direction";
	public static String EncodingScheme = "Encoding scheme";
	public static String NatureOfAI = "Nature of address indicator";
	public static String NumberingPlan = "Numbering plan";
	

 public static void main(String[] args) {

	System.out.println("Hello World")	;

	Test test = new Test();
	String str =  "name";
	
	switch ( str) {
		case Test.Name:
				System.out.println(" Name has come ");
				break;

		 case Test.TranslationType:
		 		System.out.println(" Name has come ");
		 		break;
		default: 
				System.out.println("Nothing has come " + str);

				break;
	}
	
	
	



	}


}