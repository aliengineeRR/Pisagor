import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    //değişkenler oluşturulur
        int a,b;
        double c;
        //scanner sınıf ile verileri alalım
        Scanner girdi = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        a= girdi.nextInt();
        System.out.println("2. kenarı giriniz: ");
        b= girdi.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("hipotenus : " + c);
    }
}
