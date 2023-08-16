import java.util.Scanner;
class Demo{
	public static void main(String[] args) {

		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j<=(6-i) || j>=(i+4) ){
					System.out.print("*");
					
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
  }
  
	public static int findGCD(int a, int b){
		int gcd = 1;
		for(int i=1;i<=a && i<=b;i++){
			if(a%i==0 && b%i==0){
				gcd = i;
			}
		}
		return gcd;
	}

	
}