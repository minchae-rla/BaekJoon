package day07;

import java.util.Scanner;

public class BaekJoon_10952 {
	public static void main(String[] args) {
		//문제번호.10952
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			System.out.println(num1 + num2);
		}
	}

}
