public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {1,5,9,2,7,4,15,0};
		 
       
        for (int i=0; i<b.length-1;i++){
            int k=i;
        	for (int j=i+1;j<b.length;j++)
                if (b[j] < b[k])
                    k = j;
            int temp = b[k];
            b[k] = b[i];
            b[i] = temp;
        }
        for(int i=0;i<b.length;i++) {
        	System.out.print(b[i]+" ");
        }
	}

}