import java.util.Scanner;

public class QuickSort2
{
     public static void main(String[] args)
     {
         Quicksort qsort = new Quicksort();
         Scanner br = new Scanner(System.in);
 		int n = br.nextInt();
 		int[] ar = new int[n];
 		for(int i=0;i<n;i++)
 		{
 			ar[i] = br.nextInt();
 		}
         System.out.print("Original  Array : ");
         for(int i=0; i<ar.length;i++)
         {
             System.out.print(ar[i] + " ");
         }

         int length = ar.length;

         qsort.qSort(ar, 0, length-1);
     }
}

class Quicksort
{
    public void qSort(int[] a, int p, int r)
    {
        if(p<r)
        {
            int q = Partition(a, p,r);
            qSort(a, p, q-1);
            printArray(a,p,r);

            qSort(a, q+1, r);
            printArray(a,p,r);
        }
     }

     private int Partition(int[] a, int p, int r)
     {
         int x = a[p];

         int i = r+1;
         for(int j=r;j>=0;j--)
 		{
 			if(a[j]>x)
 			{
 			i=i-1;
 			int q=a[i];
 			a[i]=a[j];
 			a[j]=q;
 			}
 		}
 		int q=a[i-1];
 		//System.out.println(ar[i]);
 		a[i-1]=a[0];
 		a[0]=q;
         return (i-1);
     }
     private static void printArray(int[] array, int start, int end) {
         if (start < end) {
             for (int i = start; i <= end; i++) {
                 System.out.print(array[i] + " ");
             }
             System.out.println();
         }
}
     }
