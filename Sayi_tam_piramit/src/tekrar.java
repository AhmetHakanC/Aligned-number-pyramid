import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {
        System.out.print("Satır sayısı--> ");
        Scanner input = new Scanner(System.in);
        int satir = input.nextInt();
        int bosluk, temp = 0;


        for (int i = satir + 1; i > 1; i--) {
            bosluk = fonk(us_hesapla(satir)) * i;
            for (int j = bosluk; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print(1);

            if (i < satir + 1) {
                for (int j = 1; j < satir + 1 - (i - 1); j++) {
                    bosluk = fonk(us_hesapla(satir)) - fonk(us_hesapla(j));
                    for (int k = 0; k < bosluk; k++) {
                        System.out.print(" ");
                    }
                    System.out.print(us_hesapla(j));
                    if (temp == 0) {
                        for (int k = 0; k < bosluk; k++) {
                            System.out.print(" ");
                        }
                        System.out.print(1);
                        temp++;
                    }
                }

                if (i < satir) {
                    for (int j = satir - (i - 1); j > 1; j--) {
                        bosluk = fonk(us_hesapla(satir)) - fonk(us_hesapla(j + 1));
                        for (int k = 0; k < bosluk + 1; k++) {
                            System.out.print(" ");
                        }
                        System.out.print(us_hesapla(j - 1));
                    }
                    for (int j = 0; j < bosluk + 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(1);
                }
            }

            System.out.println("");
        }
    }
    public static int fonk(int sayi) {
        int basamak = 0, temp = sayi;
        while (sayi > 0) {
            temp = sayi % 10;
            sayi -= temp;
            sayi /= 10;
            basamak++;
        }
        return basamak;
    }

    public static int us_hesapla(int ust) {
        int sayi = 1;
        for (int i = 0; i < ust; i++) {
            sayi *= 3;
        }
        return sayi;
    }
}