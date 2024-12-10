public class LastOccOfEle {
//        To print last occurance of an element

        public static int lastOccurance(int arr[], int item){
            int lastIndex = 0;
            for (int i=0;i<arr.length;i++){
                if(item==arr[i]){
                    lastIndex = i;
                }
            }
            return lastIndex;
        }

    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,4,5,1,3,5};
        int element = 1;
        int index = lastOccurance(arr,element);
        System.out.println(index);
    }
}
