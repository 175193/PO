import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zestaw1 {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
        zad11();
        zad12();
        zad13();
    }

    public static void zad1 () {
        System.out.println("Szymon Suduł");
    }

    public static void zad2 () {
        System.out.println("Szymon Suduł".length());
    }

    public static void zad3 () {
        String str1 = "Ala ";
        String str2 = "ma ";
        String str3 = "kota";
        System.out.println(str1 + str2 + str3);
    }

    public static void zad4 () {
        System.out.println("                        *");
        System.out.println("                        * *");
        System.out.println("                        * * *");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println("                        * * *");
        System.out.println("                        * *");
        System.out.println("                        *");
    }

    public static void zad5 () {
        String str = "Ala ma kota";
        String newStr = str.replace('a', 'e');
        System.out.println(newStr);
    }

    public static void zad6 () {
        String str = "Ala ma kota";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    public static void zad7 () {
        char[] arr = {'A', '!', '@', '>', '~', '\n', '\b'};
        for (char c : arr) {
            System.out.println(c + ": " + (int)c);
        }
    }

    public static void zad8 () {
        int mmin = 'a';
        int mmax = 'z';
        int dmin = 'A';
        int dmax = 'Z';
        int cmin = '0';
        int cmax = '9';
        System.out.println("Małe: <" + mmin + ", " + mmax + ">");
        System.out.println("Duże: <" + dmin + ", " + dmax + ">");
        System.out.println("Cyfry: <" + cmin + ", " + cmax + ">");

    }

    public static void zad9 () {
        System.out.println("Grzesiek nie wiedział dlaczego królik jest tak drapieżnym skurczybykiem mimo, że jego aparycja na to nie wskazuje");
    }

    public static void zad10 () {
        System.out.println("Chłopki to najlepsza książka napisana przez Joannę Kuciel-Frydryszak");
    }

    public static void zad11 () {
        String word = "wodrze";

        for (int i = 0; i < 5; i++) {
            System.out.print(word);
        }
        System.out.println();
    }

    // https://www.w3schools.com/java/java_date.asp
    public static void zad12 () {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Dziś jest " + date.format(dateFormatter) + " godzina " + time.format(timeFormatter));
    }

    public static void zad13 () {
        int[] arr = {54, 103, 241, 67, 9999, "Szymon Suduł".length(), 175193};

        for (int i : arr) {
            System.out.println(i + ": " + (char)i);

        }
    }
}
