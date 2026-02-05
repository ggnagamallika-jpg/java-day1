import java.util.*;
public class ReverseArray{
    public static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j]; arr[j]=temp;
            i++; j--;
        }
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter comma sapereted integers:");
            String input=sc.nextLine();
            String[]strArr=input.split(",");
            reverse(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
