package Odevler.odev_3;

public class Odev_3_4 {
    public static void main(String[] args) {
        System.out.println("Hoşgeldin Cansu. Bugün seninle bir ay içerisinde hangi dersten ne kadar soru çözdüğünü kontrol edeceğiz. Biliyorsun bu sene senin sınav senen ve çalışmalarını planlamamız gerek. ");

        System.out.println("Evet hocam. Planlama yapmam derslerimi kontrol etmem benim için çok önemli");

        System.out.println("Başlayalım o zaman.");

        java.util.Scanner kb = new java.util.Scanner(System.in);

        /*System.out.print("Söyle bakalım Türkçe dersinden hangi konudan kaç soru çözdün?");

        int a = kb.nextInt();

        int b= kb.nextInt();

        System.out.printf("Türkçe dersinden Sözcükte Anlam kousundan %d ve Cümlede Anlam konusundan %d toplam %d soru çözdüm.", a, b, a+b);

        System.out.print("Peki matematikte polinomlarda kaç soru çözdün?");

        int c = kb.nextInt();

        System.out.printf("Matematikte %d soru çözdüm", c);*/

        System.out.print("Fizik dersine çalıştın mı?");
        boolean d = kb.nextBoolean();

        if (d == true) {

            System.out.println("Evet Çalıştım.");

        } else {

            System.out.println("Hayır çalışmadım.");

        }

        /*System.out.printf("Başka hengi derslere çalıştın?");
        String e = kb.nextLine();
        System.out.printf("Dün %s dersine çalıştım.", e);

        System.out.print("Peki bu hafta içinde toplam ne kadar soru çözdün?");
        int f = kb.nextInt();
        System.out.printf("Bu hafta toplam %d soru çözdüm.", f);

        System.out.println("Aferin sana.O zaman diğer ay görüşmek üzere.");
        System.out.println("Görüşmek üzere hocam. Teşekkür ederim.");*/


    }
}
