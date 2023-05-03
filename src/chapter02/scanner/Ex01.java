package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 1. Scanner 등록
		Scanner sc = new Scanner(System.in);
		// 2. 아버님 이름 , 어머님 이름 , 형제 이름, 자신 이름 : sc.next();
		// 아버님 나이, 어머님 나이, 형제나이, 자신의 나이 : sc.nextInt();
		// 3. 스캐너로 받은 변수의 값을 출력
		// 4. 전체 나이의 합계 , 평균을 구해서 소숫점 이하 2자리까지만 출력
		
		String name1 , name2, name3, name4 ;
		int a,b,c,d, sum;
		double avg;
		
		System.out.println("아버지의 이름을 입력하세요 ");
		name1 = sc.next();
		System.out.println("아버지의 나이를 입력하세요 ");
		a = sc.nextInt();	
		System.out.println("어머니의 이름을 입력하세요 ");
		name2 = sc.next();
		System.out.println("어머니의 나이를 입력하세요 ");
		b = sc.nextInt();	
		System.out.println("형제의 이름을 입력하세요 ");
		name3 = sc.next();
		System.out.println("형제의 나이를 입력하세요 ");
		c = sc.nextInt();	
		System.out.println("나의 이름을 입력하세요 ");
		name4 = sc.next();
		System.out.println("나의 나이를 입력하세요 ");
		d = sc.nextInt();	
		
		sum = a+b+c+d;
		avg = sum / 4.0;
		
		System.out.printf("아버지의 이름 = %s ,아버지의 나이 = %d \n어머니의 이름 = %s ,어머니의 나이 = %d\n"
				+"형제의 이름 = %s ,형제의 나이 = %d \n나의 이름 = %s ,나의 나이 = %d \n", name1,
				a,name2,b,name3,c,name4,d);
		System.out.printf("나이의 합계는 %d 이고, 평균은 %5.2f 입니다.", sum , avg);
		
	}
}
