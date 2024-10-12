import java.util.Scanner;

public class Zestaw2 {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
    }

    public static void zad1 () {
        Object wynik1 = 23.0 + 76;
        System.out.println(wynik1.getClass());
        Object wynik2 = 41*2.0 + 3;
        System.out.println(wynik2.getClass());
        Object wynik3 = 5-33;
        System.out.println(wynik3.getClass());
        Object wynik4 = 109/3;
        System.out.println(wynik4.getClass());
        Object wynik5 = 50/2;
        System.out.println(wynik5.getClass());
        Object wynik6 = 4|2;
        System.out.println(wynik6.getClass());
        Object wynik7 = 3^5;
        System.out.println(wynik7.getClass());
        Object wynik8 = 7&9;
        System.out.println(wynik8.getClass());
    }

    public static void zad2 () {
        int wynik = (int) (((Math.sqrt(7) - 1) / 2) + (Math.pow(3, 2) % 2));
        System.out.println(wynik);

        int wynik2 = (int) (2002 * (15 * 3));
        System.out.println(wynik2);

        int wynik3 = (int) ( (3 + Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3) + 1);
        System.out.println(wynik3);

        int wynik4 = (int) (1 % 2 % 3);
        System.out.println(wynik4);

        int wynik5 = (int) (("Suduł".length() % "Szymon".length() + 1) / Math.pow(2, -4));
        System.out.println(wynik5);
    }

    public static void zad3 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo 1: ");
        String word1 = scanner.next();
        System.out.println("Podaj słowo 2: ");
        String word2 = scanner.next();
        System.out.println("Słowo 1: " + word1);
        System.out.println("Słowo 2: " + word2);
    }

    public static void zad4 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe 1: ");
        int x = scanner.nextInt();
        System.out.println("Podaj liczbe 2: ");
        int y = scanner.nextInt();
        System.out.println((x+y) + " " + (x-y) + " " + (x*y) + " " + (x/y));
    }

    public static void zad5 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj x: ");
        double x = scanner.nextInt();

        System.out.println(x-140);
        System.out.println(x+31);
        System.out.println(x*7);
        System.out.println(x/13);
        System.out.println(x%7);
        System.out.println((int)x%4);
        System.out.println(Math.pow(x, 45));
        System.out.println((int)x & 67);
        System.out.println((int)x | 59);
        System.out.println((int)x ^ 23);
        System.out.println((int)x << 5);
        System.out.println((int)x >> 6);
    }

}
