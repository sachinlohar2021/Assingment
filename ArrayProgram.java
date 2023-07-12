import java.util.Scanner;

public class ArrayProgram {

    public static int[] sortArray(int arr[]){
        //sort array
        int temp =0;
        for(int i=0; i< arr.length;i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]){

        int arr[] =new int[10];

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter 10 elements: ");
        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // display array
        System.out.println("Display array: ");
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int arr2[] = sortArray(arr);

        System.out.println("Sorted array: ");
        for(int i=0; i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

}
