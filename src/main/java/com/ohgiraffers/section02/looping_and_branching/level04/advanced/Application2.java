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
		int ohmanwon;
		int manwon;
		int ohcheonwon;
		int cheonwon;
		int ohbaekwon;
		int baekwon;
		int ohsipwon;
		int sipwon;
		int restMoney = 0;

		System.out.print("받으신 금액을 입력하세요 : ");
		int giveMoney = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int valuePrice = sc.nextInt();

		int rest = giveMoney-valuePrice;
		restMoney = giveMoney-valuePrice;

		ohmanwon = restMoney/50000;
		restMoney = restMoney%50000;

		manwon = restMoney/10000;
		restMoney = restMoney % 10000;

		ohcheonwon = restMoney/5000;
		restMoney = restMoney % 5000;

		cheonwon = restMoney / 1000;
		restMoney = restMoney % 1000;

		ohbaekwon = restMoney / 500;
		restMoney = restMoney % 500;

		baekwon = restMoney / 100;
		restMoney = restMoney % 100;

		ohsipwon = restMoney / 50;
		restMoney = restMoney % 50;

		sipwon = restMoney / 10;
		restMoney = restMoney % 10;

		System.out.println("========================================");
		System.out.println("50000원권 지폐 " + ohmanwon + "장");
		System.out.println("10000원권 지폐 " + manwon + "장");
		System.out.println("5000원권 지폐 " + ohcheonwon + "장");
		System.out.println("1000원권 지폐 " + cheonwon + "장");
		System.out.println("500원권 동전 " + ohbaekwon + "개");
		System.out.println("100원권 동전 " + baekwon + "개");
		System.out.println("50원권 동전 " + ohsipwon + "개");
		System.out.println("10원권 동전 " + sipwon + "개");
		System.out.println("거스름돈 : " + rest + "원");


	}

}
