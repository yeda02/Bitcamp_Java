package jp03.part01;

import java.io.*;

public class WriterTest{

	public static void main(String[] args){

		InputStream inputStream=System.in;
		Reader reader=new InputStreamReader(System.in); //System.in�� dt: printstream=>inputstream ���� ����ȯ=>InputStreamReader(printstream)
		OutputStream outputStream=System.out; //�̷��Ծ�����
		Writer writer=new OutputStreamWriter(outputStream);

		System.out.println("�Է��� ��ٸ��ϴ�");
		try{
			while(true){

				int i=reader.read();
				writer.write(i);
				writer.flush();

				if((char)i=='x'){
					break;
				}
			}
//			writer.flush(); //�Ƚᵵ �Ȱ��� �ۿ���! �ֳĸ�~close����~

			reader.close(); //close�ϴ� ���� buffer����
			writer.close();

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}