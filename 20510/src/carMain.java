
public class carMain {

	public static void main(String[] args) {
		car sonata = new car();
		sonata.carname = "�ҳ�Ÿ";
		sonata.velocity = 0;
		
		sonata.speedUp();
		sonata.speedUp();
		sonata.speedDown();
		
		Truck t1 = new Truck();
		t1.carname = "����";
		
		t1.speedUp();
		t1.speedDown();
		
		sonata.print();
		
		t1.color = "�Ķ���";
		t1.ton = 3;
		t1.print();
		
		Taxi taxi1 = new Taxi();
		taxi1.carname = "�ý�";
		taxi1.color = "�����";
		taxi1.payUp();
		taxi1.payUp();
		taxi1.print();
	}

}
