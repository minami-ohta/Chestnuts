package minami.ohta.com;

import java.util.Scanner;

public class CounterChestnuts {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("いらっしゃいませ、何個にしますか？");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print("*");
		}

		sc.close();
	}

}
