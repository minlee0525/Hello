
public class PizzaMain {

	public static void main(String[] args) {
		
		Pizza a = new Pizza();
		a.setType("���۽�����");
		a.setSize(12);
		
		Pizza b = new Pizza("��������");
		b.setSize(24);
		
		Pizza c = new Pizza("�Ұ��",12);
		
		a.toPrint();
		b.toPrint();
		c.toPrint();
		
	}

}
