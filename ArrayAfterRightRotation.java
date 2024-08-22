public class ArrayAfterRightrotation
{
    public static void rotation(long arr[],int K)
    {
        int n=arr.length;
        int m=n-K;
        for(int i=m;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
       
    }
	public static void main(String[] args) {
	     long Array[] = {1, 2, 3, 4, 5};
	     int K = 4;
	     rotation(Array,K);
	}
}
/*
Output : 2 3 4 5 1
*/
