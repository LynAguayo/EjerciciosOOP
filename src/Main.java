import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bienvenido!!\uD83D\uDE04");

        // Ejercicio 1
        System.out.println("\n----Ejercicio 1----");
        Quotation firstQuotation = new Quotation("Welcome to Oracle, the new home of Java!","Oracle Corporation");
        firstQuotation.display(); // imprimir el atributo
        firstQuotation.setAuthor("Evelyn Aguayo"); // cambiar el nombre del autor
        firstQuotation.display();

        // Ejercicio 2
        System.out.println("\n----Ejercicio 2----");
        Persona hermana = new Persona("Arlet");
        hermana.decirNombre();
        hermana.hablar();
        hermana.dormir();

        // Ejercicio 3
        System.out.println("\n----Ejercicio 3----");
        Shirt camisetaVerano = new Shirt(223388,"Camiseta manga corta mujer Perkins", 'M', 19.90, 100);
        camisetaVerano.displayInformation();
        camisetaVerano.addStock(5); // incrementar el stock de la camiseta
        camisetaVerano.setPrice(15); // cambiar el precio
        camisetaVerano.displayInformation();

        // Ejercicio 4

        /**
        System.out.println("\n----Ejercicio 4----");
        Coche coche = new Coche();
        int opcion;

        do {
            System.out.println("\n[1] Accelerar" +
                               "\n[2] Frenar" +
                               "\n[3] Imprimir Velocidad" +
                               "\n[4] Salir" +
                               "\nIntroduce una opción: ");

            while  (!scanner.hasNextInt()){
                System.out.println("Error! Introduce un integer.");
                scanner.next();
            }

            opcion = scanner.nextInt(); // leer el número
            scanner.nextLine();

            switch (opcion){
                case 1:
                    double incremento = introducirVelocidad("Has seleccionado accelerar. Introduce el incremento de velocidad: ");
                    coche.acelerar(incremento);
                    break;
                case 2:
                    double disminucion = introducirVelocidad("Has seleccionado frenar. Introduce la reducción de velocidad: ");
                    coche.frenar(disminucion);
                    break;
                case 3:
                    System.out.println("Has seleccionado imprimir.");
                    coche.display();
                    break;
                case 4:
                    System.out.println("Saliendo del programa... Bye!!\uD83D\uDEAA");
                    break;
                default:
                    System.out.println("Error! Introduce una opción entre 1-4.");
            }
        } while (opcion != 4);
         **/

        // Ejercicio 5
        System.out.println("\n----Ejercicio 5----");
        StringBuilder frase = new StringBuilder("Dot saw I was Tod"); // instanciar clase StringBuilder
        System.out.println("La frase es: " + frase +
                           "\nEl palíndrome es: " + frase.reverse());


    }

    public static double introducirVelocidad (String mensaje) {
        System.out.println(mensaje);

        while (!scanner.hasNextDouble()) {
            System.out.println("Error! Introduce un numero, por favor.");
            scanner.next();
        }

        double velocidad = scanner.nextDouble();
        scanner.nextLine();

        return velocidad;
    }
}