public class DeletingSoecificLocaitonn {
    public static void main(String[] args) {
                //        METHOD 01
                System.out.println("Method 01 ");
                int[] arr = {10, 20, 30, 40, 50};
                int indexToDelete = 2; // Index of the element to delete (zero-based)

                // Check if the index is valid
                if (indexToDelete < 0 || indexToDelete >= arr.length) {
                    System.out.println("Invalid index");
                    return;
                }

                // Create a new array with one less element
                int[] newArr = new int[arr.length - 1];

                // Copy elements before the deleted index
                for (int i = 0; i < indexToDelete; i++) {
                    newArr[i] = arr[i];
                }

                // Copy elements after the deleted index
                for (int i = indexToDelete + 1; i < arr.length; i++) {
                    newArr[i - 1] = arr[i];
                }

                // Print the new array
                for (int i = 0; i < newArr.length; i++) {
                    System.out.print(newArr[i] + " ");
                }
        System.out.println();
//                METHOD 02
                System.out.println("Method 0 2");
                int arr01[]= {100,200,300,400,500,600};
                int deleteElement = 400;

                for (int i=0;i<arr01.length;i++){
                    if (deleteElement == arr01[i]){
                        for (int j=i ; j<arr01.length-1 ;j++){
                            arr01[j] = arr01[j+1];
                        }
                        break;
                    }
                }
                for (int value : arr01){
                    System.out.print(value+" ");
                }

    }
}
