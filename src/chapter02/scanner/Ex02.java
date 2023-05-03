package chapter02.scanner;

import java.util.Scanner;

public class Ex02 {
		//Ex02
		//1. 스캐너 등록
		//2. 우리 가족의 이름 (String) 및 몸무게 (double) 를 인풋 받고, 몸무게의 합과, 평균을 구해서
		// 출력하는 프로그램을 작성
		// 스캐너 sc.nextDouble
	public static void main(String[] args) {
		

	
	Scanner sc = new Scanner(System.in);
	String name1 , name2, name3, name4 ;
	double a,b,c,d, avg, sum;
	
	System.out.println("아버지의 이름을 입력하세요 ");
	name1 = sc.next();
	System.out.println("아버지의 몸무게를 입력하세요 ");
	a = sc.nextDouble();	
	System.out.println("어머니의 이름을 입력하세요 ");
	name2 = sc.next();
	System.out.println("어머니의 몸무게를 입력하세요 ");
	b = sc.nextDouble();
	System.out.println("형제의 이름을 입력하세요 ");
	name3 = sc.next();
	System.out.println("형제의 몸무게를 입력하세요 ");
	c = sc.nextDouble();
	System.out.println("나의 이름을 입력하세요 ");
	name4 = sc.next();
	System.out.println("나의 몸무게를 입력하세요 ");
	d = sc.nextDouble();
	
	sum = a+b+c+d;
	avg = sum / 4.0;
	
	System.out.printf("아버지의 이름 = %s ,아버지의 몸무게 = %.2f\n어머니의 이름 = %s ,어머니의 몸무게 = %.2f\n"
			+"형제의 이름 = %s ,형제의 몸무게 = %.2f\n나의 이름 = %s ,나의 몸무게 = %.2f\n", name1,
			a,name2,b,name3,c,name4,d);
	System.out.printf("몸무게의 합계는 %.2f 이고, 평균은 %.2f 입니다.", sum , avg);
	
	}
}