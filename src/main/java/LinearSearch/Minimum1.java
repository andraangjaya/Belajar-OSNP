package LinearSearch;

public class Minimum1 {
    public static void main(String[] args) {
        int[] arr = {2, 10, 15, 17, 19, 24, 38};
        int result = min(arr);
        System.out.println(result);
    }

    //Untuk mencari angka terkecil pada sebuah array
    public static int min(int[] arr) {
        //Variabel bantuan untuk mempermudah perbandingan
        int temp = arr[0];

        //Perulangan untuk membandingkan isi dari setiap indeks pada sebuah array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
