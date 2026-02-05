public class TotalArray{
public static int findTotal(int[]arr){
    int total=0;
    for(int num:arr){total=total+num; }
    return total;
    }
    public static double findAverage(int[] arr){
        return(double) findTotal(arr)/arr.length; }
public static void main(String[] args){
int[]arr={10,20,5,8};
System.out.println("Total:" +findTotal(arr));
System.out.println("average:" +findAverage(arr));
}
}