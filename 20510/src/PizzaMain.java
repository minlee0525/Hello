
public class PizzaMain {

	public static void main(String[] args) {
		
		Pizza a = new Pizza();
		a.setType("슈퍼스프림");
		a.setSize(12);
		
		Pizza b = new Pizza("포테이토");
		b.setSize(24);
		
		Pizza c = new Pizza("불고기",12);
		
		a.toPrint();
		b.toPrint();
		c.toPrint();
		
	}

}
