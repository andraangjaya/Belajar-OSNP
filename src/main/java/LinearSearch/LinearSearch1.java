package LinearSearch;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {10, 13, 20, 28, 40, 58, 87};
        int key = 87;
        int result = linearSearch(arr, key);
        System.out.println(result);
    }

    //Untuk mencari suatu angka terletak di indeks berapa pada sebuah array
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
