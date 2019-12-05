package se.ch06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로봇
		Toy t; //부모타입
		
		t=new Robot();
		System.out.println(t.toString());
		
		
		//레고
		t=new Lego();
		System.out.println(t.toString());
		
		//클라이언트가 Kid객체를 가지고 놀 장난감을 결정한다.
		//사용할(의존하는)객체를 Kid본인이 결정하지 않고,
		//클라이언트가 결정함=> Dependency Injection
		//눈 물 줄줄...
        Kid k = new Kid();
        k.setToy(new Lego());
        
        k.play();//레고라고 출력
        

	}

}
