public class TraversingArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};

//For Loop
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//For each Loop
        for (int values : arr){
            System.out.print(values+" ");
        }
    }
}
