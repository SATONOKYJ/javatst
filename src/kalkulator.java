import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("podaj liczbe: 1");
        double Number1 = scanner.nextInt();

        System.out.println("podaj liczbe: 2");
        double Number2 = scanner.nextInt();


        double mnorzenie = Number1*Number2;
        double dodawanie = Number1+Number2;
        double dzielenie = Number1/Number2;
        double modulo = Number1%Number2;
        double odejmowanie = Number1-Number2;


        String mnorzenie_str = "Mnorzenie " + Number1 + " przez " + Number2 + " = " + mnorzenie;
        String dzielenie_str = "Dzielenie " + Number1 + " przez " + Number2 + " = " + dzielenie;
        String dodawanie_str = "Dodawanie " + Number1 + " i " + Number2 + " = " + dodawanie;
        String odejmowanie_str = "Odejmowanie " + Number2 + " od " + Number1 + " = " + odejmowanie;
        String modulo_str = Number1 + " modulo " + Number2 + " = " + modulo;


        System.out.println(mnorzenie_str);
        System.out.println(dzielenie_str);
        System.out.println(dodawanie_str);
        System.out.println(odejmowanie_str);
        System.out.println(modulo_str);
    }
}