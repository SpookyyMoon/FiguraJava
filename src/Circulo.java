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
}
