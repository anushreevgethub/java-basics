package com.basics;
enum color{red,blue,green,yellow,orange
}

public class EnumColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
color co,co1,co2;
System.out.println("here are all the color constants");
color[] allcolors=color.values();//method1
for(color c:color.values())
	System.out.println(c+" "+c.ordinal());//method2
System.out.println();
co=color.valueOf("red");//method3
System.out.println("co contains:"+co);
co=color.red;
co1=color.blue;
co2=color.red;
if(co.compareTo(co1)<0)//method4
	System.out.println(co+" "+"comes before"+" "+co1);
if(co.compareTo(co1)>0)
	System.out.println(co1+" "+"comes before"+" "+co);
if(co.compareTo(co2)==0)
	System.out.println(co+" "+"equals"+" "+co1);
System.out.println();
if(co.equals(co1))//method5
	System.out.println("error!");
if(co.equals(co2))
	System.out.println(co+" "+"equals"+" "+co2);	
if(co==co2)
	System.out.println(co+" "+"=="+" "+co2);

	
	}

}
