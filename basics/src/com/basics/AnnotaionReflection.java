package com.basics;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str();
	int val();
}
public class AnnotaionReflection {
@MyAnno(str="Annotation example",val=100)
public static void myMeth() {
	AnnotaionReflection ob=new AnnotaionReflection();
	try {
		Class<?> c=ob.getClass();
		Method m=c.getMethod("myMeth");
		MyAnno anno=m.getAnnotation(MyAnno.class);
		System.out.println(anno.str()+" "+anno.val());
	}
	catch(NoSuchMethodException exc) {
		System.out.println(" method not found.");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
myMeth();
	}

}
