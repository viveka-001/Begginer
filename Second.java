
import java.util.*;

public class Second{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int firstMax=Integer.MIN_VALUE;
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>firstMax)
            {
                
                SecondMax=firstMax;
                firstMax=arr[i];
            }
            else if(arr[i]>=SecondMax&&arr[i]<firstMax) 
            {
                SecondMax=arr[i];
            }

        }
        System.out.print(SecondMax);
    }
    
}