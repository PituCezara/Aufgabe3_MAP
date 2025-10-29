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
    // scădere (a ≥ b)
    static int[] scadere(int[] a, int[] b) {
        int n = a.length;
        int[] rez = new int[n];
        int imprumut = 0;
        for (int i = n - 1; i >= 0; i--) {
            int x = a[i] - imprumut - b[i];
            if (x < 0) {
                x += 10;
                imprumut = 1;
            } else imprumut = 0;
            rez[i] = x;
        }
        return rez;
    }

    // innmulțire cu o cif
    static int[] inmultire(int[] a, int cifra) {
        int n = a.length;
        int[] rez = new int[n + 1];
        int t = 0;
        for (int i = n - 1; i >= 0; i--) {
            int p = a[i] * cifra + t;
            rez[i + 1] = p % 10;
            t = p / 10;
        }
        rez[0] = t;
        return rez;
    }
    // imparțire la o cif
    static int[] impartire(int[] a, int cifra) {
        int n = a.length;
        int[] rez = new int[n];
        int rest = 0;
        for (int i = 0; i < n; i++) {
            int val = rest * 10 + a[i];
            rez[i] = val / cifra;
            rest = val % cifra;
        }
        return rez;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6};
        int[] b = {1, 2, 3};

        System.out.println(" a = " + Arrays.toString(a));
        System.out.println(" b = " + Arrays.toString(b));


        int[] suma = adunare(a, b);      // 236 + 123 = 359
        System.out.println("Adunare:    " + Arrays.toString(suma));
        int[] diferenta = scadere(a, b); // 236 - 123 = 113
        System.out.println("Scădere:    " + Arrays.toString(diferenta));
        int[] produs = inmultire(a, 2);  // 236 × 2 = 472
        System.out.println("Înmulțire:  " + Arrays.toString(produs));
        int[] cat = impartire(a, 2);     // 236 ÷ 2 = 118
        System.out.println("Împărțire:  " + Arrays.toString(cat));
    }
}