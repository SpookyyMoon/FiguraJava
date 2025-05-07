public class Triangulo extends Figura{
    public int base;
    public int altura;
    public int lado;
    public int lado1;

    public Triangulo(String color, String nombre, int posX, int posY, int base, int altura, int lado, int lado1) {
        super(color, nombre, posX, posY);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
        this.lado1 = lado1;
    }

    public int getBase() {
        return base;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
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

    public float perimetroTriangulo(){
        return (float) (base + lado + lado1);
    }

    @Override
    public String toString() {
        return  "Nombre" + nombre + "\n" +
                "Base: " + base + "\n" +
                "Altura: " + altura + "\n" +
                "Lado: " + lado + "\n" +
                "Lado1: " + lado1 + "\n" +
                "Area: " + areaTriangulo() + "\n" +
                "Perímetro: " + perimetroTriangulo() + "\n" +
                "Color: " + color + "\n" +
                "Posición X: " + posX + "\n" +
                "Posición Y: " + posY + "\n";
    }
}
