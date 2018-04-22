package com.lkydig.calculator;
import org.springframework.stereotype.Service;

/** This is public class */

@Service
public class Calculator {
	int sum(int a, int b){
		return a + b;
	}
}
