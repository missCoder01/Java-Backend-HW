package Odevler.odev_3;

public class Odev_3_Ornek {
        public static void main(String[] args) {

            System.out.println("Lütfen aşağıdaki bilgileri doldurunuz.");

            java.util.Scanner kb= new java.util.Scanner(System.in);

            System.out.print("Adi: ");
            String ad = kb.nextLine();

            System.out.print("Soyad: ");
            String soyad = kb.nextLine();

            System.out.print("Cinsiyetiniz: ");
            char cinsiyet = kb.nextLine().charAt(0);

            System.out.print("Telefon No: ");
            String telefonNo = kb.nextLine();

            System.out.print("E-mail: ");
            String email = kb.nextLine();

            System.out.print("Doğum Yılı: ");
            int dYili = kb.nextInt();

            System.out.print("Herhangi bir alerjiniz var mı? ");
            boolean alerji = kb.nextBoolean();

            System.out.printf("Adi: %s, Soyad: %s, Cinsiyeti: %c, Telefon No: %s, E-mail: %s, Doğum Yılı: %d, Herhangi bir alerjiniz var mı? %b", ad , soyad, cinsiyet, telefonNo, email, dYili, alerji);

        }
    }
