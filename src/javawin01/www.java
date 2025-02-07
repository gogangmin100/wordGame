package javawin01;

public class www {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b ='a';
	//	System.out.println(b);
	//	System.out.println(b+2); //결과값 99
	//	System.out.println((char)(b+2)); //결과값 c
		int a = (int) b -97;
		System.out.println("현재값" + a); 
		a= ((a+2)%26)+97;
		//System.out.println("97에서떨어진수"+a);
		System.out.println("원하는값"+(char)a);
		

		

	}

}
