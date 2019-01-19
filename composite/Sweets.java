package composite;

public class Sweets {

	private final String name;
	private final int size;

	public Sweets(String name,int size){
		this.name = name;
		this.size = size;
	}
	public final int getSize(){

		return this.size;
	}
	public final void lookIn(String name){
		System.out.println(this.name+"(in the"+ name+")");
	}


}
