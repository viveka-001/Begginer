
import java.util.*;
import java.math.*;

public class perfectSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double square=Math.sqrt(n);
        double FLOOR=Math.floor(square);
        if((square-FLOOR)==0.0)
        {
            System.out.print("PREFECT SQUARE");
        }
        else
        {
            System.out.print("NOT A PERFECT SQUARE");
        }
    }
    
}