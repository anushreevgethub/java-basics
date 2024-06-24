package com.basics;
class TwoGen<T ,v>{
	T ob1;
	v ob2;
TwoGen(T o1,v o2){
	ob1=o1;
	ob2=o2;
}
T getob1() {
	return ob1;
}
v getob2() {
	return ob2;
}
void showTypes() {
	System.out.println("type of T is"+ob1.getClass().getName());
	System.out.println("type of v is"+ob2.getClass().getName());
}
}
public class Gendemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TwoGen<Integer,String> iob=new TwoGen<Integer,String>(88,"generics");
iob.showTypes();
int v=iob.getob1();
System.out.println("value:"+v);
String str=iob.getob2();
System.out.println("value:"+str);

	}

}
