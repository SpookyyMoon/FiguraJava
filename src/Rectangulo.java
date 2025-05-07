public class Rectangulo extends Figura{
    public int base;
    public int altura;

    public Rectangulo(String color, String nombre, int posX, int posY, int base, int altura) {
        super(color, nombre, posX, posY);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
