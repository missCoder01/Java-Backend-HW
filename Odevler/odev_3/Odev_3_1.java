package Odevler.odev_3;

public class Odev_3_1 {
        public static void main(String[] args) {

            java.util.Scanner kb = new java.util.Scanner (System.in);


            System.out.print("Aklınızdan bir tam sayı tutun: ");
            int a = kb.nextInt();


            System.out.print("Tuttuğunuz sayıyı 2 ile çarpıp yazın: ");
            int b = kb.nextInt();


            System.out.print("Elinizdeki sayıya 10 ekleyin: ");
            int c = kb.nextInt();


            System.out.print("Çıkan sayıyı ikiye bölün: ");
            int d = kb.nextInt();


            System.out.println("Son olarak elinizdeki en son sayıdan ilk tuttuğunuz sayıyı  çıkarın.");

            int sonuc = d-a;
            System.out.printf("Çıkan sonuç %d'tir.", sonuc);

            System.out.println("İşlemleri bir kaç kez farklı tam sayılarla tekrarlayın. Sonucun hep aynı çıktığını göreceksiniz:)");
        }
    }
