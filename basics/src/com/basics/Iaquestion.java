package com.basics;
import java.util.List;
public class Iaquestion {
public static<T> int findIndexOfElement(List<T> list,T target) {
	for(int i=0;i<list.size();i++) {
		if(list.get(i).equals(target)) {
			return i;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>numbers=List.of(1,2,3,4,5);
List<String>colors=List.of("red","green","yellow","blue","pink");
System.out.println("original list elements:");
System.out.println("Nums:"+numbers);
System.out.println("colors:"+colors);
int index1=findIndexOfElement(numbers,4);
System.out.println("\nIndex of 4 in numbers:"+index1);
int index2=findIndexOfElement(numbers,7);
System.out.println("\nIndex of 7 in numbers:"+index2);
int index3=findIndexOfElement(colors,"white");
System.out.println("\nIndex of white in colors:"+index3);
int index4=findIndexOfElement(colors,"blue");
System.out.println("\nIndex of blue in colors:"+index4);
	}

}
