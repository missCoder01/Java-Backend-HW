package Odevler.odev_3;

public class Odev_3_2 {
    public static void main(String[] args) {
        /*System.out.println("Tanesi 4 tl olan kitaplardan 5 tane aldım. Satıcıya 50 tl uzattım. Satıcıdan alacağım para üstü ne kadar olmalı?");

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.printf("Kitap Adedi: ");
        int a = kb.nextInt();


        System.out.printf("1 adet kitabın fiyatı: ");
        int b = kb.nextInt();

        System.out.printf("Verilen Para: ");
        int c = kb.nextInt();

        System.out.printf("Verilecek Para Üstü: "+(c-(a*b)));*/

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.printf(" İlki ikincisinden büyük olmak üzere iki tam sayının toplamı ile farkını çarparak yazınız. ");

        int d,e;

        d = kb.nextInt();
        e = kb.nextInt();

        System.out.printf("İki sayının toplamı: %d + %d = %d olur ", d, e, d+e );

        System.out.println("ve");

        System.out.printf("İki Sayının Farkı: %d - %d = %d olur ", d, e, d-e);

        int f = d+e;
        int g = d-e;

        System.out.println("ve");
        System.out.printf("Çarpım: %d*%d=%d olur.", f, g, f*g);
    }
}
