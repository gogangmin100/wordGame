package javawin01;

public class Dday20250121 {

	public static void main(String[] args) {
	


		int sum = 0;
		int a =0;
		for (int i = 0; i <=100; i++) {
			sum+=i;
			if(sum>44 && a==0)
			{
				a=i;
			}
			
		}
		System.out.println("¹üÀÎ:" + a);
		
	}

}

