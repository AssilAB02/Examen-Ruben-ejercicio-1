import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        Elementosimple silla = new Elementosimple(1, 50.0);
        Elementosimple mesa = new Elementosimple(2, 100.0);

        Kit kit = new Kit(1);
        kit.agregar(silla);
        kit.agregar(mesa);

        do {
            System.out.println("1. Mostrar precio del kit");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Precio del kit: " + kit.getPrecio());
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
            }
        } while (opcion != 2);

        scanner.close();
    }
}
