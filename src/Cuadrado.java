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
    public float calcularArea(){
        return (float) (base *  base);
    }

    @Override
    public float calcularPerimetro(){
        return (float) (base * 4);
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Base: " + base + "\n" +
                "Area: " + calcularArea() + "\n" +
                "Perímetro: " + calcularPerimetro() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}
