package se.ch06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�κ�
		Toy t; //�θ�Ÿ��
		
		t=new Robot();
		System.out.println(t.toString());
		
		
		//����
		t=new Lego();
		System.out.println(t.toString());
		
		//Ŭ���̾�Ʈ�� Kid��ü�� ������ �� �峭���� �����Ѵ�.
		//�����(�����ϴ�)��ü�� Kid������ �������� �ʰ�,
		//Ŭ���̾�Ʈ�� ������=> Dependency Injection
		//�� �� ����...
        Kid k = new Kid();
        k.setToy(new Lego());
        
        k.play();//������ ���
        

	}

}
