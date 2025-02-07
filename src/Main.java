public class Main {
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

    }
}