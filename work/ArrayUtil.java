public class ArrayUtil{

	public char[] reverseString(char[] s, int start, int end){ 
		//int index=start;
		char[] newChar = new char[s.length];
		char temp=' ';
			//		for(i=end; i>=start; i--){
			//			newChar[index]=s[i];
			//				index++;
			//	}

			newChar=s;
			for(int i=start; i<=(start+end)/2; i++){
				int k=start+end-i;

				temp=newChar[i];
				newChar[i]=newChar[k];
				newChar[k]=temp;
			}
		return newChar;

	}

	public static void main(String[] args){
		ArrayUtil au=new ArrayUtil();
		char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
	//	System.out.println(au.reverseString(s,0,3));
	//	System.out.println(au.reverseString(s,4,7));
	//	System.out.println(au.reverseString(s,8,10));
		System.out.println(au.reverseString(s,0,10));
	}
}
