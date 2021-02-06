package com.lambdaexpression;

public class TestNew {
public static void main(String[] args) {
	NewLamb n= (a,b) -> {
		System.out.println(a.concat(b));
	};
	n.conc("Carlo", "Singh");
}
}
