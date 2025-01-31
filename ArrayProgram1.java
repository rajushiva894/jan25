
public class ArrayProgram1 {
	static void arRR(int[]  x,int n) {
	int len=x.length;
	int arrLen=len-1;
	int t=x[arrLen];
	//num[4]=num[3]
	//num[3]=num[2]
	//num[2]=num[1]
	//num[1]=num[0]
	for(int i=arrLen;i>=1;i--) {
		x[i]=x[i-1];
	}
	x[0]=t;
	System.out.println("\n after "+n+"1 rigth rotation \n");
	for(int i=0;i<=arrLen;i++) {
		System.out.println(x[i]+" ");
	}
	}	 

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		System.out.println("before one rotation");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i] + " ");
			
		}
		arRR(num,1);
		arRR(num,2);
		arRR(num,3);
		arRR(num,4);
		
	}

}
