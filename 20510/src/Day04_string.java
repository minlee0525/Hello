
public class Day04_string {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		if(str1==str2)
			System.out.println("동일");
		else
			System.out.println("동일하지 않음");
		
		if(str1.equals(str2))
			System.out.println("값이 같음");
		else
			System.out.println("값이 다르다.");
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str3==str4)
			System.out.println("동일");
		else
			System.out.println("동일하지 않음");
		
		if(str3.equals(str4))
			System.out.println("값이 같음");
		else
			System.out.println("값이 다르다.");
	}

}
