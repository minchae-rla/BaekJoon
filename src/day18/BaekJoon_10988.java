package day18;

import java.util.Scanner;

public class BaekJoon_10988 {
	public static void main(String[] args) {
		// 문제번호.10988
		// 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
		// 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
		// level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine(); // 문자입력
		String change = ""; // 빈문자열 선언 > word를 역순으로 저장

		// 입력된 문자를 한글자씩 역순으로 빈문자열에 누적저장
		for (int i = word.length() - 1; i >= 0; i--) {
			change += word.charAt(i);
		}
		
		if(word.equals(change)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
