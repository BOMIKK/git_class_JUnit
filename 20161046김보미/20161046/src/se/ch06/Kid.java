package se.ch06;

public class Kid {
	
	private Toy toy;
	public void setToy(Toy toy) {
		this.toy=toy;
	}
	
	public void play() {
		System.out.println(toy.toString());
		
	}

}