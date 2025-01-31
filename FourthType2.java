import java.util.Scanner;

public class FourthType2 {
	static float anyCountryToIndianRupees(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")){
     		res=amt*78.67f;
			}
		else if(country.equalsIgnoreCase("UK")) {
			res=amt*120.56f;
			}
		else if(country.equalsIgnoreCase("UAE")) {
			res=amt*20.56f;
		}
		return res;

	}
	static int getAmt() {
		return 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter country...");
		string country = sc.next();
		string cC=getAmtDetails(country);
		System.out.println("please enter"+cC);
		if(cC.equalsIgnoresCase("country not found")) {
			System.out.println("not able to process");
		}
		else {
			int amt =sc.nextInt();
			System.out.println("for this"+country"for this amt=");
		}

	

	}

}
