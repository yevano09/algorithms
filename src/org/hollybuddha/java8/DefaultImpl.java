package org.hollybuddha.java8;

public class DefaultImpl implements  extInterfacefromDefault, DefaultinInterface {

	@Override
	public String addStr(String a, String b) {
		// TODO Auto-generated method stub
		return extInterfacefromDefault.super.addStr(a, b);
	}
	public static void main(String[] args) {
		
		DefaultImpl imp = new DefaultImpl();
		System.out.println(imp.addStr(" hi " , "Jawahar --"));


	}

}
