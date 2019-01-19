package composite;

public final class Main {

	public static void main(String args[]){
		Box box1 = new Box("おもちゃ箱",1000);
		Box box2 = new Box("大きな箱",500);
		Box box3 = new Box("小さな箱",200);
		Box box4 = new Box("大きすぎる箱",2000);

		Toy toy1 = new Toy("トランプ",10);
		Toy toy2 = new Toy("ゲーム",100);
		Toy toy3 = new Toy("漫画",100);
		Toy toy4 = new Toy("人形",150);
		Toy toy5 = new Toy("ラケット",1200);
		Toy toy6 = new Toy("キーホルダー",5);

		CapsuleToy capsule1 = new CapsuleToy("カプセル1");
		CapsuleToy capsule2 = new CapsuleToy("カプセル2");

		//BoxクラスとToyクラスの入りきらないものを入れてみる
		box1.add(box4);
		box1.add(toy5);
		capsule1.put(toy4);

		//普通に入れる
		box1.add(toy1);
		box1.add(box2);
		box2.add(toy2);
		box2.add(box3);
		box2.add(toy3);
		box1.add(toy4);

		//中の入ったカプセルと入っていないカプセルをおもちゃ箱に入れる
		capsule1.put(toy6);
		box1.add(capsule1);
		box1.add(capsule2);






		box1.lookIn();
	}
}
