public class Prob8 {

	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);

		if (i <= 0 || i % 2 == 0) {
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�.");
			return;
		}

		for (int a=i; a>=1; a-=2) {
		
			for(int b=0; b<(i-a)/2;b++){
				System.out.print(" ");
			}

			for(int c=0; c<=a-1;c++){
				System.out.print("*");

			}

			System.out.println();

		
		}	//end of for

	} // end of main
} // end of class