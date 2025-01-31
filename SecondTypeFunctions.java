
public class SecondTypeFunctions {
	static void pattern(char ch1,int num1,char ch2,int num2) {
		for(int i=1;i<=num1;i++) {
			System.out.println(ch1);
		}
		System.out.println("\n");
		for(int i=1;i<=num2;i++) {
			System.out.println(ch2);
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		pattern('*',35,'-',45);
		System.out.println("namaskaram");
		pattern('#',60,'@',35);
		System.out.println("sunrisers");

	}

}
