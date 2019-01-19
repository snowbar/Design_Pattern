package composite;

public final class CapsuleToy implements BoxContents{

	private Toy toy= null;
	private final String name;
	private final int size = 10;

	public CapsuleToy(String name){

		this.name = name;

	}
	public final void put(Toy toy){
		if(toy.getSize()<size)
			this.toy=toy;
		else
			System.out.println(toy.getName()+"がカプセルに入りません。");
	}
	public final String getName(){
		return this.name;
	}
	public final int getSize(){
		return this.size;
	}
	public final void lookIn(){
		if(this.toy==null)
			System.out.println("何も入ってない"+this.name+"があります。");
		else
			System.out.println(this.toy.getName()+"の入った"+this.name+"があります。");
	}
}
