
public class ArraySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a[]= {1,2,3,4,5,6,7,8,9,10};
           
          /*  for(int i=a.length-1,j=0;i>=0; i--) {
            	if(j<a.length/2) {
            		a[i]=a[i]+a[j];
            		a[j]=a[i]-a[j];
            		a[i]=a[i]-a[j];
            		     j++;
            	}else break;
            	
            }*/
            /*int[] b=new int[a.length];
            for(int i=a.length-1,j=0;i>=0; i--) {
                 b[j]=a[i];
                 j++;
            }
            a=b;*/
            int i=a.length-1;
            int j=0;
            while(j<a.length/2) {
            	
            	a[i]=a[i]+a[j];
            	a[j]=a[i]-a[j];
            	 a[i]=a[i]-a[j];
            	 j++;
            	 i--;
            }
            
           
            for(int aa:a)
            	System.out.print(aa);
	}

}
