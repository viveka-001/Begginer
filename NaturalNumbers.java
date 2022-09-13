
import java.util.*;

public class NaturalNumbers {
    int find(int n)
    {
        if(n==1)return 1;
        else return n+(find(n-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NaturalNumbers s=new NaturalNumbers();
        int sum=s.find(n);
        System.out.println(sum);
    }
    
}