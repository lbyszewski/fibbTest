import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fibb fibb =  new Fibb();
        System.out.println("podaj n: ");
        Scanner scanner = new Scanner(System.in);
        double n =  scanner.nextDouble();

        System.out.println(fibb.fibb(n));

    }
}