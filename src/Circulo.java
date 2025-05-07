public class Circulo extends Figura{
    public int radio;

    public Circulo(String color, String nombre, int posX, int posY, int radio) {
        super(color, nombre, posX, posY);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float areaCirculo(){
        double pi = 3.141592;
        return (float) (pi * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Radio: " + radio + "\n" +
                "Area: " + areaCirculo() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}
