package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		/* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
		 * 
		 * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
		 * 지폐외 동전을 구분하여 단위를 표기하세요
		 * 
		 * -- 입력 예시 --
		 * 받으신 금액을 입력하세요 : 100000
		 * 상품 가격을 입력하세요 : 22340
		 * 
		 * -- 출력 예시 --
		 * ============================
		 * 50000원권 지폐 1장
		 * 10000원권 지폐 2장
		 * 5000원권 지폐 1장
		 * 1000원권 지폐 2장
		 * 500원권 동전 1개
		 * 100원권 동전 1개
		 * 50원권 동전 1개
		 * 10원권 동전 1개
		 * ============================
		 * 거스름돈 : 77660원
		 * */

		Scanner sc = new Scanner(System.in);
		int pay = 0;
		int price = 0;
		int exchange = 0;
		int tmp = 0;

		int fiftyT = 0;
		int tenT = 0;
		int fiveT = 0;
		int oneT = 0;
		int fiveH = 0;
		int oneH = 0;
		int fifty = 0;
		int ten = 0;

		System.out.print("받으신 금액을 입력하세요 : ");
		pay = sc.nextInt();

		System.out.print("상품 가격을 입력하세요 : ");
		price = sc.nextInt();

		tmp = pay - price;

		while (tmp > 0){
			if (tmp >= 50000){
				fiftyT++;
				tmp -= 50000;
			} else if (tmp < 50000 && tmp >= 10000) {
				tenT++;
				tmp -= 10000;
			} else if (tmp < 10000 && tmp >= 5000) {
				fiveT++;
				tmp -= 5000;
			} else if (tmp < 5000 && tmp >= 1000) {
				oneT++;
				tmp -= 1000;
			} else if (tmp < 1000 && tmp >= 500) {
				fiveH++;
				tmp -= 500;
			} else if (tmp < 500 && tmp >= 100) {
				oneH++;
				tmp -= 100;
			} else if (tmp < 100 && tmp >= 50) {
				fifty++;
				tmp -= 50;
			} else if (tmp < 50 && tmp >= 10) {
				ten++;
				tmp -= 10;
			} else tmp = 0;
		}
		exchange = (fiftyT * 50000) + (tenT * 10000) + (fiveT * 5000) + (oneT * 1000) + (fiveH * 500) + (oneH * 100) + (fifty * 50) + (ten * 10);
		System.out.println("============================");
		System.out.println("50000원권 지폐 " + fiftyT + "장");
		System.out.println("10000원권 지폐 " + tenT + "장");
		System.out.println("5000원권 지폐 " + fiveT + "장");
		System.out.println("1000원권 지폐 " + oneT + "장");
		System.out.println("500원권 동전 " + fiveH + "개");
		System.out.println("100원권 동전 " + oneH + "개");
		System.out.println("50원권 동전 " + fifty + "개");
		System.out.println("10원권 동전 " + ten + "개");
		System.out.println("============================");
		System.out.println("거스름돈 : " + exchange);
	}

}
