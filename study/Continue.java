package study;

//continue���� Ȱ���� ¦���� ���ϱ�

public class Continue {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int sum = 0;

		for (int j = 0; j <= i; j++) {
			if (j % 2 == 1) {
				continue;
			} // ¦���� if�� �������ͼ� sum�� �ջ�
			sum += j;
			
		} 
		System.out.println(i + "���� ¦���� ���� " + sum);
	}
}