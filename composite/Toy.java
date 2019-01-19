package composite;

public final class Toy implements BoxContents{

	private final String name;
	private final int size;

	public Toy(String name,int size){
		this.name = name;
		this.size = size;
	}

	public final int getSize(){
		return this.size;
	}

	public final String getName(){
		return this.name;
	}

	public final void lookIn(){
		System.out.println(this.name+"があります。");
	}

}
