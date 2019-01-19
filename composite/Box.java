package composite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Box implements BoxContents{

	private final List<BoxContents> list;
	private final String name;
	private final int size;
	private int capacity;

	public Box(String name,int size){
		this.name = name;
		this.size = size;
		this.capacity = size;
		this.list = new ArrayList<BoxContents>();
	}

	public final void add(BoxContents con){

		if(con.getSize() < this.capacity){
			list.add(con);
			this.capacity -= con.getSize();
		}else{
			System.out.println(con.getName()+"が大きくて"+this.name+"に入りません(サイズ："+con.getSize()+"  "+"容量："+this.capacity+")");
		}
	}

	public final int getSize(){
		return this.size;
	}

	public final String getName(){
		return this.name;
	}


	public final void lookIn(){
		Iterator<BoxContents> i = list.iterator();
		System.out.println(name + "を開けました。");
		while(i.hasNext()){
			BoxContents con = i.next();
			con.lookIn();

		}
		System.out.println(name + "を閉じました。");
	}
}

/*適用前
public final class Box {

	private final List<Object> list;
	private final String name;
	private final int size;
	private int capacity;

	public Box(String name,int size){
		this.name = name;
		this.size = size;
		this.capacity = size;
		this.list = new ArrayList<Object>();
	}

	public final void add(Box box){

		if(box.getSize() < this.capacity){
			list.add(box);
			this.capacity -= box.getSize();
		}else{
			System.out.println(box.getName()+"が大きくて"+this.name+"に入りません(サイズ："+box.getSize()+"  "+"容量："+this.capacity+")");
		}
	}

	public final void add(Toy toy){

		if(toy.getSize() < this.capacity){
			list.add(toy);
			this.capacity -= toy.getSize();
		}else{
			System.out.println(toy.getName()+"が大きくて"+this.name+"に入りません(サイズ："+toy.getSize()+"  "+"容量："+this.capacity+")");
		}
	}

	public final int getSize(){
		return this.size;
	}

	public final String getName(){
		return this.name;
	}


	public final void lookIn(){
		Iterator<Object> i = list.iterator();
		System.out.println(name + "を開けました。");
		while(i.hasNext()){
			Object obj = i.next();
			if(obj instanceof Box){
				((Box)obj).lookIn();
			}else if(obj instanceof Toy){
				((Toy)obj).lookIn(name);
			}else{
				System.out.println("おかしなものが入ってます：" + obj);
			}
		}
		System.out.println(name + "を閉じました。");
	}
}
*/
