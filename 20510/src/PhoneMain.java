
public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.model = "S21";
		phone1.price = 2000000;
		phone1.toPrint();
		
		Phone phone2 = new Phone();
		phone2.model = "V50";
		phone2.price = 850000;
		phone2.toPrint();
		
		Phone phone3 = new Phone("iPhone",2400000);
		phone3.toPrint();
		
		phone3.printTotal();
	}

}
