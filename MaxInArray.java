import java .util.*;
public class MaxInArray{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter comma separeted integers:");
     String input=sc.nextLine();
     String[]strArr=input.split(",");
   int[]arr=new int[strArr.length];
   for (int i=0; i< strArr.length; i++)
   {arr[i]=Integer.parseInt(strArr[i].trim());}
   System.out.println("Maxmiun element:" +findMax(arr));
}
 public static int findMax(int[]arr){
    int max=arr[0];
    for(int num:arr){ if(num>max)max=num;}
    return max;
   }
} 
