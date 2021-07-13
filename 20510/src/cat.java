
public class cat extends Animal {

	public static void main(String[] args) {

//		cat b = new Animal();			
		
		Animal a = new cat();
		a.name = "미미";
		a.print();
		
		cat b = (cat) a;
		b.print();
		
		b.name = "주주";
		b.print();
		
		a.print();
		
	}

}
