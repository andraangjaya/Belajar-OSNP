package LinearSearch;

public class Maximal1 {
    public static void main(String[] args) {
        int[] arr = {2, 10, 15, 17, 20, 19, 38};
        int result = max(arr);
        System.out.println(result);
    }

    //Untuk mencari angka terbesar pada sebuah array
    public static int max(int[] arr) {
        //Variabel bantuan untuk mempermudah perbandingan
        int temp = arr[0];

        //Perulangan untuk membandingkan isi dari setiap indeks pada sebuah array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
