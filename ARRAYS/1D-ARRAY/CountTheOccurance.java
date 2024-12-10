public class CountTheOccurance {
    public static  int countOcc(int[] arr, int ele){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (ele==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={10,20,10,10,40,60};
        int ele=10;
        System.out.println(countOcc(arr,ele));
    }
}
