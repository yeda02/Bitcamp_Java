import java.util.Scanner;

public class Prob1{

	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. : ");
		int inputInt = keyboard.nextInt();

		if(inputInt>=2 && inputInt<=9){

			for(int i=1; i<10; i++){
				System.out.println(inputInt+" * "+i+" = "+inputInt*i);
				}

		}else{
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			System.exit(0);
		}
	
	
	}
}