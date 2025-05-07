public class Cuadrado extends Figura{
    public int base;

    public Cuadrado(String color, String nombre, int posX, int posY, int base) {
        super(color, nombre, posX, posY);
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return  "Nombre" + posX + "\n" +
                "Base: " + posX + "\n" +
                "Color: " + posX + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}
