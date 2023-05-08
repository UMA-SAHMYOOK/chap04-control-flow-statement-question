package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* 두 개의 정수를 입력 받아 변수에 저장하고,
		 * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
		 * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
		 * 
		 * -- 입력 예시 --
		 * 첫 번째 정수 : 4
		 * 두 번쨰 정수 : 3
		 * 연산 기호를 입력하세요 : +
		 * 
		 * -- 출력 예시 --
		 * 4 + 3 = 7 
		 */
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하고 연산기호(+, -, *, /, %)를 입력하시오");
		int num1 = sc.nextInt();
		System.out.println("첫번째 정수 :" + num1);
		int num2 = sc.nextInt();
		System.out.println("두번째 정수 :" + num2);
		String a = sc.next();
		System.out.println("연산기호를 입력하세요 : " + a);
		if (a.equals("+")){
			System.out.println(num1 + "+" + num2 + ""+ "=" + (num1 + num2));
		}
		else if (a.equals("-")) {
			System.out.println(num1 + "-" + num2 + ""+ "=" + (num1-num2));
		}
		else if (a.equals("*")){
			System.out.println(num1 + "*" + num2 + ""+ "=" + (num1*num2));
		}
		else if (a.equals("/")){
			System.out.println(num1 + "/" + num2 + ""+ "=" + (num1/num2));
		}
		else if (a.equals("%")){
			System.out.println(num1 + "%" + num2 + ""+ "=" + (num1%num2));
		}
		else {
			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
		}

		System.out.println("프로그램을 종료합니다.");
	}
}
