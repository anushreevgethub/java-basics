package com.basics;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface myMarker{ }
public class Marker {
@myMarker
public static void myMeth() {
	 Marker ob=new  Marker();
	 try {
		 Method m=ob.getClass().getMethod("myMeth");
		 if(m.isAnnotationPresent(myMarker.class))
			 System.out.println("MyMarker is present");

	}
	 catch(NoSuchMethodException exc) {
		 System.out.println("Method not found");
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
myMeth();
	}

}
