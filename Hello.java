import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int a = sc.nextInt();
        System.out.println("Escribe tu segundo numero:");
        int b = sc.nextInt();
        int opcion;
        do {
            formato();
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("El resultado de tu suma es:");
                System.out.println(suma(a, b));
            } else if (opcion == 2) {
                System.out.println("El resultado de tu resta es:");
                System.out.println(resta(a, b));
            } else if (opcion == 3) {
                System.out.println("El resultado de tu multiplicacion:");
                System.out.println(multiplicacion(a, b));
            } else if (opcion == 4) {
                System.out.println("El resultado de tu division es:");
                System.out.println(division(a, b));
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Escoje una opcion valida");
            }
        } while (opcion != 5);

    }

    public static void formato() {
        System.out.println("Eliga una opcion:");
        System.out.println("1.Suma:");
        System.out.println("2.Resta:");
        System.out.println("3.Multiplicacion:");
        System.out.println("4.Division:");
        System.out.println("5.Salir del programa.");
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;

    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static float division(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            System.out.println("No se puede dividir para cero");
        }
        return 0;
    }
}