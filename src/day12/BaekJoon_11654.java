package day12;

import java.util.Scanner;

public class BaekJoon_11654 {
	public static void main(String[] args) {
		//문제번호.11654
		//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		System.out.println((int)word.charAt(0));
	}

}
