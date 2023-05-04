package com.ohgiraffers.section02.looping_and_branching.level02.normal;

public class Application2 {

	public static void main(String[] args) {

		/* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
		 * 
		 * -- 출력 예시 --
		 * abcdefghijklmnopqrstuvwxyz
		 * */

		String print = "";				//누적할 String 형 변수 초기화

		for(int i = 97;i<=122;i++){
			char a = (char)i;
			print+=a;			//아스키 코드번호를 통해 print 변수에 알파벳을 차례대로 누적시킨다.
		}
		System.out.println(print);		//출력
	}

}
