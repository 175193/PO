import java.util.Arrays;
import java.util.Random;

public class Zestaw4 {
    public static void main(String[] args) {
        int[] arr = generujTablice(10, -20, 30);
//        System.out.println(Arrays.toString(arr));

        ileDodatnich(arr);
        ileUjemnych(arr);
        ileParzystych(arr);
        ileNieparzystych(arr);
        ileMaksymalnych(arr);
        ileMinimalnych(arr);

        sumaDodatnich(arr);
        sumaUjemnych(arr);
        sumaOdwrotnosci(arr);

        sredniaArytmetyczna(arr);
        sredniaGeometryczna(arr);
        sredniaHarmonijna(arr);

        funkcjaLiniowa(arr, 5, 3);
        funkcjaKwadratowa(arr, 3, 4, 5);
        funkcjaWykladnicza(arr, 2);
        funkcjaSignum(arr);

//        System.out.println(Arrays.toString(odwrocTablice(arr)));
//        System.out.println(Arrays.toString(odwrocTablice(arr, 3, 6)));

        double[] arr2 = generujTablice2(7, 5, 20);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] arr = new int[n];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((maxWartosc - minWartosc) + 1) + minWartosc;
        }

        return arr;
    }

    public static void wypiszTablice(int[][] arr, int n, int m) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                System.out.print(arr[j]);
            }
        }

    }

    public static int ileNieparzystych(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileParzystych(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileDodatnich(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileUjemnych(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileMaksymalnych(int[] arr) {
        int count = 1;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else {
                count++;
            }
        }
        return count;
    }

    public static int ileMinimalnych(int[] arr) {
        int count = 1;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                count = 1;
            } else {
                count++;
            }
        }
        return count;
    }

    public static int sumaDodatnich(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static int sumaUjemnych(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static int sumaOdwrotnosci(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += (1 / arr[i]);
            }
        }

        return sum;
    }

    public static double sredniaArytmetyczna(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static double sredniaGeometryczna(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum *= arr[i];
        }

        return Math.pow(sum, 1 / arr.length);
    }

    public static double sredniaHarmonijna(int[] arr) {
        return sumaOdwrotnosci(arr) == 0 ? arr.length / 1 : arr.length / sumaOdwrotnosci(arr);
    }

    public static int[] funkcjaLiniowa(int[] arr, int a, int b) {
        // ax+b
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = (a * arr[i]) + b;
        }

        return res;
    }

    public static int[] funkcjaKwadratowa(int[] arr, int a, int b, int c) {
        // ax+b
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = (a * a * arr[i]) + (b * arr[i]) + c;
        }

        return res;
    }

    public static int[] funkcjaWykladnicza(int[] arr, int a) {
        // ax+b
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = (int) Math.pow(a, arr[i]);
        }

        return res;
    }

    public static int[] funkcjaSignum(int[] arr) {
        // ax+b
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                res[i] = -1;
            } else if (arr[i] > 0) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }

        return res;
    }

//    public static void najdluzszyCiagDodatnich(int[] arr) {
//        int idx = 0;
//        int count = 0;
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                count++;
//                temp++;
//            } else {
//                if (temp > count) {
//                    count = temp;
//                    idx = i;
//                }
//            }
//        }
//
//        for (int i = 0; i < count; i++) {
//            System.out.print(arr[idx + i] + ", ");
//        }
//    }

    public static int[] odwrocTablice(int[] arr) {
        int[] res = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            res[i] = arr[j];
        }

        return res;
    }

    public static int[] odwrocTablice(int[] arr, int indexStart, int indexStop) {
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        for (int i = indexStart, j = indexStop; i <= indexStop; i++, j--) {
            res[i] = arr[j];
        }

        return res;
    }

    public static double[] generujTablice2(int n, int minWartosc, int maxWartosc) {
        double[] res = new double[n];
        double step = (maxWartosc - minWartosc) / (n - 1.0);
        System.out.println(step);

       for (int i = 0; i < n; i++) {
           res[i] = (minWartosc + i * step);
       }

       return res;
    }
}
