public class Persona {
    // Atributos
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Setter y getter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método dormir
    public void dormir(){
        System.out.println("zzzzzzz... \uD83D\uDE34");
    }

    // Método hablar
    public void hablar(){
        System.out.println("bla bla bla...\uD83D\uDDE3\uFE0F");
    }

    // Método para printear el atributo
    public void decirNombre() {
        System.out.println("Hola \uD83D\uDC4B! Mi nombre es " + this.getNombre());
    }
}
