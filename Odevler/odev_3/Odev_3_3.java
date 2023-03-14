package Odevler.odev_3;

public class Odev_3_3 {
    public static void main(String[] args) {
        System.out.println("İyi günler. Fazla vaktinizi almayacağız. Rica etsek bizimle üniversitemiz hakkında bir röportaj yapabilir misiniz?");

        System.out.println("Elbette. Buyurun.");

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("İlk olarak isminizi öğrenebilir miyiz?");
        System.out.print("İsmim: ");
        String isim = kb.nextLine();


        System.out.print("Tanıştığımıza memnun oldum. Bu üniversitenin öğrencisi misiniz?");
        boolean ogrenci = kb.nextBoolean();

        kb.nextLine();
        System.out.print("Hangi bölümde okuyorsunuz?");
        String bolum = kb.nextLine();
        System.out.printf("Bölümüm: %s  ", bolum);



        System.out.print("Kaçıncı sınıf öğrencisisiniz?");
        System.out.print("Sınıfım: ");
        int sinif = kb.nextInt();


        System.out.print("Bölümünüzden memnun musunuz?");
        boolean memnun = kb.nextBoolean();

        float agno;
        System.out.print("Agnonuzun kaç olduğunu öğrenebilir miyiz?");
        agno = kb.nextFloat();
        System.out.printf("Agnom %.2f'dir.", agno);

        kb.nextLine();
        System.out.print("En sevdiğiniz ders nedir?");
        String ders =kb.nextLine();
        System.out.printf("En sevdiğim ders: %s   ", ders);


        System.out.print("Peki dersin harf notu ne düştü?");
        char harf = kb.nextLine().charAt(0);
        System.out.printf("Harf notum %c ", harf);

        System.out.print("Süper. Peki üniversitenizi ve bölümünüzü 1 ve 5 arasında puanlandırmanızı istesek?");
        int Unipuan =kb.nextInt();
        int Bolpuan = kb.nextInt();
        System.out.printf("Tabii. Üniversitem için %d puan veriyorum. Ve bölümüme de %d puan veriyorum.", Unipuan, Bolpuan);

        System.out.printf("Peki, röportajımıza katıldığın için teşekkürler %s. Derslerinde başarılar dileriz.", isim);
        System.out.print("Teşekkür ederim. İyi günler dilerim.");



    }
}
