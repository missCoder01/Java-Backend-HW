package Odevler.odev_2;

public class Odev_2 {
        public static void main(String[] args) {

            char a= '_';
            System.out.println(a);

            int b= a;
            System.out.println(b);

            b+= 20;
            System.out.println(b);

            char c = (char) b;
            System.out.println(c);


            //decrypt
            int d = c;
            System.out.println(d);

            d-= 20;
            System.out.println(d);

            char e = (char) d;
            System.out.println(e);

        }
    }