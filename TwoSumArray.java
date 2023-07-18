import java.util.Scanner;

public class TwoSumArray {

    public static void main(String[] args) {


        int arr[] = {3,5,2,6,1};
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter");

        int sum = sc.nextInt();



        for (int i = 0 ;i<arr.length; i++){
            for (int j= i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println(arr[i] +" " + arr[j]);
                }
            }
        }

    }

}
