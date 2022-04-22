package week1.day2;

import week1.day2.Calculator;

public class MyCalculator {
	public static void main(String[] args) {
		int a,b;
		double c;
		float d;
		Calculator obj=new Calculator();
		a=obj.add(3, 4, 5);
		System.out.println("add: "+a);
		b=obj.sub(8, 5);
		System.out.println("sub: "+b);
		c=obj.mul(11,55);
		System.out.println("mul: "+c);
		d=obj.div(85,34);
		System.out.println("div: "+d);
	}

}
