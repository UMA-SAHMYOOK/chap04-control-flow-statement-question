package com.ohgiraffers.section01.conditional.level02.normal;
import java.util.Scanner;
public class Application1 {

	public static void main(String[] args) {

		/* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
		 * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
		 * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요. 
		 * */
		System.out.print("1부터10사이의 정수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);		//스캐너 객체 선언
		int a = sc.nextInt();						//입력받은값을 변수 a에 저장

		if(a<1 || a>10) System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");	//a에 1~10사이를 벗어나는 값인 경우 출력
		else if(a%2==0) System.out.println("짝수다");								//a의 값이 짝수일 때 출력
		else System.out.println("홀수다");											//a의 값이 홀수일 때 출력
	}

}
