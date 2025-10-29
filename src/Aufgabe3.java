import java.util.Arrays;

public class Aufgabe3 {

    // adunare (a și b asame lenght)
    static int[] adunare(int[] a, int[] b) {
        int n = a.length;
        int[] rez = new int[n + 1];
        int t = 0;
        for (int i = n - 1; i >= 0; i--) {
            int s = a[i] + b[i] + t;
            rez[i + 1] = s % 10;
            t = s / 10;
        }
        rez[0] = t;
        return rez;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6};
        int[] b = {1, 2, 3};

        System.out.println(" a = " + Arrays.toString(a));
        System.out.println(" b = " + Arrays.toString(b));

        int[] suma = adunare(a, b);      // 236 + 123 = 359
        System.out.println("Adunare:    " + Arrays.toString(suma));
    }
}