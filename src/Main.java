import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Jak masz na imie?");
        String name = scanner.nextLine();

        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();


        System.out.println("Witaj " + name + " Podobno masz " + age + "!");
    }
}