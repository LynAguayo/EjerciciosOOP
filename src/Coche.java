public class Coche {
    // Atributo
    private double velocidad = 0;

    // Setter y getter
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    // Método para accelerar
    public void acelerar(double incremento){
        double velocidadAumentada = getVelocidad() + incremento;
        setVelocidad(velocidadAumentada);
    }

    // Método para frenar
    public void frenar(double disminucion) {
        double velocidadReducida = getVelocidad() - disminucion;
        setVelocidad(velocidadReducida);
    }

    public void display (){
        System.out.println("Coche {velocidad: " + getVelocidad() + "km/h }");
    }
}
