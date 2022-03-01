package prob_0228;

import java.io.*;

public class FileController {

	public void reverseLine(String oldf, String newf) throws Exception{
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		br=new BufferedReader(new InputStreamReader(System.in));
		bw=new BufferedWriter(new FileWriter(newf));
		int count=0;
		String oneline="";
		
		for(int i=0; i<br.readLine().length();i++) {
		count++;
		oneline=br.readLine();
		
		}
		System.out.println(count+" " + oneline);
		
	}
	
	public static void main(String[] args) throws Exception{
		FileController c= new FileController();
		String oldf="newnew.txt";
		String newf="files/newf.txt";
		c.reverseLine(oldf, newf);
	}
}