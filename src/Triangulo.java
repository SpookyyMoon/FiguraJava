public class Triangulo extends Figura{
    public int base;
    public int altura;

    public Triangulo(String color, String nombre, int posX, int posY, int base, int altura) {
        super(color, nombre, posX, posY);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float areaTriangulo(){

        return (float) (base *  altura);
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Base: " + base + "\n" +
                "Altura: " + altura + "\n" +
                "Area: " + areaTriangulo() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}
