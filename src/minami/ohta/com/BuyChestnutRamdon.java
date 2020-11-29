package minami.ohta.com;

public class BuyChestnutRamdon {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int chestnut_price = (int)(Math.random()*3 + 1)*100;
		int chestnut_num = (int)(Math.random()*100 +1);

		System.out.println("いが栗の単価：" +chestnut_price + "円");
		System.out.println("いが栗の個数：" +chestnut_num+ "個");

		int total =chestnut_price*chestnut_num;
		System.out.println("合計金額："+total+"円");

	}

}
