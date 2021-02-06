package com.lambdaexpression;

public class TestLambda {
public static void main(String[] args) {
	Lambda l = (a,b) -> {
		System.out.println(a+b);
	};
	l.add(15,17);
}
}
