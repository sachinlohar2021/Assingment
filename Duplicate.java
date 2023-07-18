public class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 14, 2, 22, 3, 4, 7, 2, 11, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
    }
