package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner sc = new Scanner(System.in);
		int money;
		int howMany;
		
		System.out.print("금액:");
		money = sc.nextInt();
		
		System.out.println();
		
		howMany = money / 50000;
		if(howMany != 0){
			System.out.println("오만 원권:" + howMany + "매");
			money -= (50000*howMany);
			howMany = 0;
		}
		
		howMany = money / 10000;
		if(howMany != 0){
			System.out.println("만 원권:" + howMany + "매");
			money -= (10000*howMany);
			howMany = 0;
		}
		
		howMany = money / 5000;
		if(howMany != 0){
			System.out.println("오천 원권:" + howMany + "매");
			money -= (5000*howMany);
			howMany = 0;
		}
		
		howMany = money / 1000;
		if(howMany != 0){
			System.out.println("천 원권:" + howMany + "매");
			money -= (1000*howMany);
			howMany = 0;
		}
		
		howMany = money / 500;
		if(howMany != 0){
			System.out.println("500원 동전:" + howMany + "개");
			money -= (500*howMany);
			howMany = 0;
		}
		
		howMany = money / 100;
		if(howMany != 0){
			System.out.println("100원 동전:" + howMany + "개");
			money -= (100*howMany);
			howMany = 0;
		}
		
		howMany = money / 50;
		if(howMany != 0){
			System.out.println("50원 동전:" + howMany + "개");
			money -= (50*howMany);
			howMany = 0;
		}
		
		howMany = money / 10;
		if(howMany != 0){
			System.out.println("10원 동전:" + howMany + "개");
			money -= (10*howMany);
			howMany = 0;
		}
		
		howMany = money / 1;
		if(howMany != 0){
			System.out.println("1원 동전:" + howMany + "개");
			money -= (1*howMany);
			howMany = 0;
		}
	}
}