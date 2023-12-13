package practiceCode;

public class PracticeArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
	     
		 for (int i=0;i<a.length-1;i++) {
			 
			 for (int j=0;j<a.length-1;j++) {
				 
				 for (int k=0;k<a.length-1;k++) {
				 
				 
				 if ((a[i]+a[j])==3) {
					 System.out.println(a[i]+","+a[j]);

				 }
				 }
			 }
		 }

	}

}
