public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido!!");

        // Ejercicio 1
        System.out.println("\nEjercicio 1");
        Quotation firstQuotation = new Quotation("Welcome to Oracle, the new home of Java!","Oracle Corporation");
        firstQuotation.display(); // imprimir el atributo
        firstQuotation.setAuthor("Evelyn Aguayo"); // cambiar el nombre del autor
        firstQuotation.display();

        // Ejercicio 2
        System.out.println("\nEjercicio 2");
        Persona hermana = new Persona("Arlet");
        hermana.decirNombre();
        hermana.hablar();
        hermana.dormir();

        // Ejercicio 3
        System.out.println("\nEjercicio 3");
        Shirt camisetaVerano = new Shirt(1,"Camiseta blanca de tirantes", 'S', 19.99, 20);
        camisetaVerano.setPrice(15.99); // cambiar el precio
        camisetaVerano.addStock(10); // incrementar el stock de la camiseta
        camisetaVerano.displayInformation();

    }
}