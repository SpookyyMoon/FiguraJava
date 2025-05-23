public class Circulo extends Figura{
    public int radio;
    double pi = 3.141592;

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

    @Override
    public float calcularArea(){
        return (float) (pi * Math.pow(radio, 2));
    }

    @Override
    public float calcularPerimetro(){
        return (float) (2 * pi * radio);
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Radio: " + radio + "\n" +
                "Area: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}
