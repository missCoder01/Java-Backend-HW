package Odevler.odev_4;

public class Odev_4 {
    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("Bu ay kaç kWh elektrik kullanıldı? ");

        int elektrik = kb.nextInt();

        if (elektrik < 100) {
            int fatura;

            fatura = elektrik;

            System.out.printf("Elektrik faturası KDV dahil: %d TL", fatura);

        } else if (elektrik > 500) {
            int fatura = elektrik;

            fatura += (fatura * 15) / 100;

            System.out.printf("Elektrik faturası KDV dahil: %d TL" ,fatura);

        } else if (elektrik > 300) {
            int fatura = elektrik;

            fatura += (fatura * 10) / 100;

            System.out.printf("Elektrik faturası KDV dahil: %d TL", fatura);

        } else if (elektrik > 100) {
            int fatura = elektrik;

            fatura += (fatura * 5) / 100;

            System.out.printf("Elektrik faturası KDV dahil: %d TL", fatura);
        }
    }
}