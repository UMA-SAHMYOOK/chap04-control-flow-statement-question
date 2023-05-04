package com.ohgiraffers.section02.looping_and_branching.level01.basic;
import java.util.Scanner;
public class Application3 {

	public static void main(String[] args) {

		/* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
		 * 
		 * -- 입력 예시 --
		 * 정수를 입력하세요 : 10
		 * 
		 * -- 출력 예시 --
		 * 1부터 10까지 짝수의 합 : 30
		 * */
		int sum = 0;                                    //누적할 변수 초기화
		Scanner sc = new Scanner(System.in);            //스캐너 객체 선언
		System.out.print("정수를 입력하세요 : ");
		int getNum = sc.nextInt();                        //사용자 정수 입력받기

		for(int i = 1;i<=getNum;i++){
			if(i%2==1) continue;
			sum+=i;
		}

		System.out.println("1부터 " + getNum + "까지의 짝수의 합 : " + sum);

	}

}
