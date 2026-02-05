public class LinearSearch{
    public static int search(int[]arr, int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return-1;
    }
    public static void main(String[] args){
        int[] arr={7,14,21,28};
        System.out.println(search(arr,21));
        System.out.println(search(arr,30));
    }
}