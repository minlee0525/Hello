
public class carMain {

	public static void main(String[] args) {
		car sonata = new car();
		sonata.carname = "소나타";
		sonata.velocity = 0;
		
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedDown();
		
		Truck t1 = new Truck();
		t1.carname = "포터";
		
		t1.speedUp();
		t1.speedDown();
		
		sonata.print();
		
		t1.color = "파란색";
		t1.ton = 3;
		t1.print();
		
		Taxi taxi1 = new Taxi();
		taxi1.carname = "택시";
		taxi1.color = "노란색";
		taxi1.payUp();
		taxi1.payUp();
		taxi1.print();
	}

}
