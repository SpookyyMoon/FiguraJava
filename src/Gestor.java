import java.awt.*;
import java.util.ArrayList;

public class Gestor {

    // Lista de cuadrados
    ArrayList<Cuadrado> cuadradoLista = new ArrayList<>();
    // Lista de rectángulos
    ArrayList<Rectangulo> rectanguloLista = new ArrayList<>();
    // Lista de círculos
    ArrayList<Circulo> circuloLista = new ArrayList<>();
    // Lista de triángulos
    ArrayList<Triangulo> trianguloLista = new ArrayList<>();

    public void crearCuadrado(String color, String nombre, int X, int Y, int base){
        cuadradoLista.add(new Cuadrado(color, nombre, X, Y, base));
        System.out.println("Se ha creado el cuadrado: ");
        System.out.println(cuadradoLista.getLast());
    }

    public void crearRectangulo(String color, String nombre, int X, int Y, int base, int altura){
        rectanguloLista.add(new Rectangulo(color, nombre, X, Y, base, altura));
        System.out.println("Se ha creado el rectángulo: ");
        System.out.println(rectanguloLista.getLast());
    }

    public void crearCirculo(String color, String nombre, int X, int Y, int radio){
        circuloLista.add(new Circulo(color, nombre, X, Y, radio));
        System.out.println("Se ha creado el círculo: ");
        System.out.println(circuloLista.getLast());
    }

    public void crearTriangulo(String color, String nombre, int X, int Y, int base, int altura){
        trianguloLista.add(new Triangulo(color, nombre, X, Y, base, altura));
        System.out.println("Se ha creado el triángulo: ");
        System.out.println(trianguloLista.getLast());
    }
}
