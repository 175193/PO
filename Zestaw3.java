import java.util.Scanner;

public class Zestaw3 {
    public static void main(String[] args) {
//        trojkiPitagorejskie(10);
//        funKwaRozwiazania(50);
//        funKwaDelta(10);
//        liczbyPierwsze(100);
//        liczbyPodzielne(2, 5);
//        piramida(5, 1);
//        piramida(6, 2);
//        dwumianNewtona(3, 8);
//        trojkatPaskala(9);
//        czyPalindrom(1221);
        podzbiory(new int[]{1, 2, 3, 4});
    }

    public static void trojkiPitagorejskie(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int square = i * i + j * j;
                int c = (int) Math.sqrt(square);

                if (c <= n && (square) == c * c) {
                    System.out.printf("Trójkąt pitagorejski: (%d, %d, %d) \n", i, j, c);
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = j; k <= n; k++) {
                    int delta = (j * j) - (4 * (i * i) * k);
                    if (delta >= 0) {
                        System.out.printf("%dx^2 + %dx + %d \n", i, j, k);
                    }
                }
            }
        }
    }

    public static void funKwaDelta(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                for (int k = j; k <= n; k++) {
                    int delta = (j * j) - (4 * (i * i) * k);
                    double sqr = Math.sqrt(delta);
                    if ((sqr - (int) sqr) == 0) {
                        System.out.printf("%dx^2 + %dx + %d \n", i, j, k);
                    }
                }
            }
        }
    }

    public static void liczbyPierwsze(int n) {
        for (int i = 1; i <= n; i++) {
            if (czyPierwsza(i)) {
                System.out.print(n + ", ");
            }
        }
    }

    public static void liczbyPodzielne(int m, int n) {
        int len = (int) Math.pow(10, m);
        for (int i = 1; i <= len; i++) {
            if (i % n == 0) {
                System.out.printf("%d jest podzielne przez %d \n", i, n);
            }
        }
    }

    public static void piramida(int n, int wariant) {
        char c;
        if (wariant == 1) {
            c = '*';
        } else if (wariant == 2) {
            c = '#';
        } else {
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static int silniaPodwojna(int n) {
        return silnia(n) * 2;
    }

    // Zad 9
    public static int silnia(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    public static int silnia(int m, int n) {
        return silnia(n) * m;
    }

    public static int dwumianNewtona(int n, int k) {
        return (silnia(n) / (silnia(k) * (silnia(n - k))));
    }

    public static void ciagFibonacciego(int n) {
        int count = 0;
        if (n == 0 && n == 1) {

        }
    }

    public static int sumaNaturalnych(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }

        return res;
    }

    public static int sumaParzystych(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }

        return res;
    }

    public static int sumaNieparzystych(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                res += i;
            }
        }

        return res;
    }

    public static int sumaKwaNaturalnych(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i*i;
        }

        return res;
    }

    public static int sumaSzeNaturalnych(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i*i*i;
        }

        return res;
    }

    public static double sumaOdwNaturalnych(int n) {
        double res = 0.0;
        for (int i = 1; i <= n; i++) {
            res += 1/i;
        }

        return res;
    }

    public static void trojkatPaskala(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print("1 ");
                } else {
                    int res = silnia(i) / (silnia(j) * silnia(i - j));
                    System.out.print(res + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean czyPalindrom(int num) {
        if (num < 0) {
            return false;
        }
        
        int div = 1;
        while (num / div >= 10) {
            div *= 10;
        }
        while (num != 0) {
            int l = num / div;
            int r = num % 10;
            if (l != r)
                return false;
            num = (num % div) / 10;
            div /= 100;
        }

        System.out.println("Numer jest palindromem");
        return true;
    }

    // zad 17
    public static boolean czyPierwsza(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] wczytajTablice(int n) {
        int[] res = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d: ", i + 1);
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void podzbiory(int[] arr) {
//        [1, 2, 3] => [1] [1 2] [1 3] [2] [2 1] [2 3] [3]
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d],", arr[i]);
        }
    }
}
