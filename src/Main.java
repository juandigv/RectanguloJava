import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("   AREA Y PERIMETRO DE RECTANGULOS  \n\nIngrese Base del Rectangulo: ");
            String valorb = scanner.nextLine();
            int b = Integer.parseInt(valorb);
            System.out.print("Ingrese Altura del Rectangulo: ");
            String valorh = scanner.nextLine();
            int h = Integer.parseInt(valorh);
            Rectangulo a = new Rectangulo(b, h);
            System.out.print("     MENU \n 1. Perimetro \n 2. Area \n 3. Salir \n Que deseas hacer? :  ");
            String valorm = scanner.nextLine();
            int m = Integer.parseInt(valorm);
            switch (m) {
                case 1:
                    System.out.println("El perimetro del rectangulo es: " + a.Perimetro());

                    break;
                case 2:
                    System.out.println("El area del rectangulo es: " + a.Area());

                    break;
                case 3:
                    System.exit(0);
            }
            System.out.println("\n\n\n");
        } while (true);
    }
}