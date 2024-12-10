public class InsertinAtSepectcPlace {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int newElement = 100;
        int newPosition = 3;

        //        METHOD 01
        System.out.println("Method 01 ");

        //Creating new array
        int newArr[] = new int[arr.length + 1];

        //Coping the previous elements
        for (int i=0;i<newPosition;i++){
            newArr[i] = arr[i];
        }

        //Inserting the element
        newArr[newPosition]= newElement;

        //Coping the rest of the elements
        for (int i=newPosition;i<arr.length;i++){
            newArr[i + 1] = arr[i];
        }

        // Printing the new array by For each Loop
        for (int values : newArr){
            System.out.print(values+" ");
        }
        System.out.println();


        //        METHOD 02
        System.out.println("Method 02");
        int arr2[]={10,20,30,40,50};
        int newElement2 = 100;
        int newPosition2 = 3;
        int size = 4;
//        int size = arr2.length - 1;

        for (int i= size; i>newPosition2 ; i--){
            arr2[i]=arr2[i-1];
        }
        arr2[newPosition2] = newElement2;

        // Printing the new array by For each Loop
        for (int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }


    }
}
