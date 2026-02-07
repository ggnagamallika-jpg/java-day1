import java.util.*;
public class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a1 value");
        short a1=sc.nextShort();
        System.out.println("enter a2 value");
        short a2=sc.nextShort();
        System.out.println("enter a3 value");
        short a3=sc.nextShort();
        int average=a1+a2+a3/3;
        System.out.println(average);
    }
}