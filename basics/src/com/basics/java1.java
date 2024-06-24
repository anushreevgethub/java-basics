package com.basics;

public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p1=new parent();
		System.out.println("parent namee is:"+p1.parent_name);
		System.out.println("parent age is:"+p1.parent_age);
		System.out.println("parent money is:"+p1.parent_money);
child c1=new child();
System.out.println("child name is :"+c1.name);
System.out.println("child age is:"+c1.age);
System.out.println("parent money before:"+c1.parent_money);
c1.income(200000);
System.out.println("parent money after:"+c1.parent_money);
c1.expences(3000);
System.out.println("parent money after all expencese:"+c1.parent_money);



		

	}

}
class parent{
	static String parent_name="vijay";
	static int parent_age=50;
	static int parent_money=300000;
}
class child extends parent{
	static String name="anu"+" "+parent_name;
	static int age=parent_age-30;
	static int pocketmoney= parent_money/2;
	
	static int income(int salary) {
		parent_money+=salary;
		return 0;
	}
	static int expences(int spend) {
		parent_money-=spend;
		return 0;
	}
	
}
