package day07;

import java.util.Scanner;

public class BaekJoon_10951 {
	public static void main(String[] args) {
		// 문제번호.10951
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
		sc.close();
	}

}