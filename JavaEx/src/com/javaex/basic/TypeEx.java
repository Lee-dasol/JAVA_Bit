package com.javaex.basic;

// 자바의 기본 자료형 연습
public class TypeEx {
	
	public static void main(String[] args) {
		// intLongTest();
		// floatDoubleTest();
		// booleanEx();
		charEx();
	}
	
	// char형 연습
	public static void charEx() {
		// 2바이트 (부호없음)
		// 유니코드 한 글자의 수치화된 코드
		// ' <- char
		// "" <- string
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("A->" + ch1);
		System.out.println("한->" + ch2);
		
		System.out.println(ch1+ch2);
	}
	
	// boolean 연습
	public static void booleanEx() {
		// 논리값 true or false
		// 비교 연산, 논리 연산의 결과를 반환
		// 흐름 제어, 반복에서 흐름을 제어할 떼 이 값을 사용한다
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		boolean result = v1 < v2;
		// 비교 연산, 논리 연산의 결과로 반환
		
		System.out.println("v1 < v2 ?" + result);
	}
	
	// 실수형 연습
	// float (4) < double (8)
	public static void floatDoubleTest() {
		// 정밀도를 포기, 표현 범위를 넓힌 자료형
}
	

}
