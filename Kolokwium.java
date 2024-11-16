public class Kolokwium {
    public static void main(String[] args) {
        System.out.println(dokladnosc(3.14, 3.10, 1));
        System.out.println(najblizszySasiad(20));
        System.out.println(pierwiastek(27, 3, 10));

        int[] tab = {1, 2, 0, 3, 5, 4, 3, 2, 1, 4, 5, 4, 3};
        System.out.println(podciag(tab));

        int[] tab2 = {6, 4, 2, 0, 1, 2, 3, 4, 2, 0};
        System.out.println(podciag(tab2, 2));

        System.out.println(czyPalindrom(121));
        palindromLiczbowy(2);
    }

    public static boolean dokladnosc(double x, double y, int k) {
        return Math.abs(x - y) <= Math.pow(10, -k);
    }

    public static double pierwiastek(double S, int n, int k) {
        double x = S / 2;
        double x1 = 0;
        do {
            if (x1 != 0) {
                x = x1;
            }
            x1 = ((x * (n - 1)) + (S / Math.pow(x, n - 1))) /
                    n;
        } while (!dokladnosc(x, x1, k));


        return x1;
    }

    public static int najblizszySasiad(int S) {
        double cel = pierwiastek(S, 2, 10);

        return (int) Math.round(cel);
    }

    public static int podciag(int[] tab) {
        int count = 1;
        int maxCount = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < tab[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            }
        }

        return maxCount > count ? maxCount : count;
    }

    public static int podciag(int[] tab, int r) {
        int count = 1;
        int maxCount = 0;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i - 1] - tab[i] == r) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 1;
            }
        }

        return maxCount > count ? maxCount : count;
    }

    public static boolean czyPalindrom(int n) {
        if (n < 0) {
            return false;
        }

        int div = 1;
        while (n / div >= 10) {
            div *= 10;
        }
        while (n != 0) {
            int l = n / div;
            int r = n % 10;
            if (l != r)
                return false;
            n = (n % div) / 10;
            div /= 100;
        }

        return true;
    }

    public static void palindromLiczbowy(int m) {
        if (m == 1) {
            for (int i = 1; i < 10; i++) {
                System.out.println("1 x " + i + " = " + i);
            }
            return;
        }

        double max = 0;

        for (int i = 1; i <= m; i++) {
            max += (9 * Math.pow(10, i - 1));
        }

        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
                if (ileCyfr(i) == m && ileCyfr(j) == m) {
                    if (czyPalindrom(i * j)) {
                        System.out.println(i + " x " + j + " = " + i * j);
                    }
                }
            }
        }
    }

    private static int ileCyfr(int num) {
        int count = 1;
        int temp = num;

        while (temp > 10) {
            temp = temp / 10;
            count++;
        }

        return count;
    }
}