package linear;

public class Linear {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("key element found at " + i);
            }
        }
    }
}
