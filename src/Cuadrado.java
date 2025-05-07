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

    public float areaCuadrado(){
        return (float) (base *  base);
    }

    public float perimetroCuadrado(){
        return (float) (base * 4);
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Base: " + base + "\n" +
                "Area: " + areaCuadrado() + "\n" +
                "Perímetro: " + perimetroCuadrado() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}
