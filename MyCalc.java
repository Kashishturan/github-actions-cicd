package com.example;
import java.util.Scanner;
public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}

	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) {

		MyCalc calc = new MyCalc();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Sum is: "+calc.sum(20, 10));
		// System.out.println("Diff is: "+calc.diff(20, 10));
		// System.out.println("Mul is: "+calc.mul(20, 10));
		// System.out.println("Div is: "+calc.div(20, 10));
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Sum is: "+calc.sum(a, b));
		System.out.println("Diff is: "+calc.diff(a, b));
		System.out.println("Mul is: "+calc.mul(a, b));
		System.out.println("Div is: "+calc.div(a, b));
	}
}