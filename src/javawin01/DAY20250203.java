package javawin01;

public class DAY20250203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		System.out.println(pang.length +"길이 배열");
		for(int i=0; i <pang.length-2; i++ ) {
			System.out.print(i+" : ");
			int cnt=1;
			for(int j=i+1; pang[i]==pang[j]; j++) {
				System.out.print(j+" ");
				cnt++;
			}
			if(cnt>=3) {
				
			}
			System.out.println("총길이 : "+cnt);
		}
			
	}

}


