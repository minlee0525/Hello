
public class cat extends Animal {

	public static void main(String[] args) {

//		cat b = new Animal();			
		
		Animal a = new cat();
		a.name = "�̹�";
		a.print();
		
		cat b = (cat) a;
		b.print();
		
		b.name = "����";
		b.print();
		
		a.print();
		
	}

}
