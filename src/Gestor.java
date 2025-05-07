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

    public void mostrarCuadrados(){
        for(Cuadrado cuadrado:cuadradoLista){
            System.out.println("Cuadrado nº: " + cuadradoLista.indexOf(cuadrado) + "\n");
            System.out.println(cuadrado);
        }
    }

    public void mostrarRectangulos(){
        for(Rectangulo rectangulo:rectanguloLista){
            System.out.println("Rectángulo nº: " + rectanguloLista.indexOf(rectangulo) + "\n");
            System.out.println(rectangulo);
        }
    }

    public void mostrarCirculos(){
        for(Circulo circulo:circuloLista){
            System.out.println("Círculo nº: " + circuloLista.indexOf(circulo) + "\n");
            System.out.println(circulo);
        }
    }

    public void mostrarTriangulos(){
        for(Triangulo triangulo:trianguloLista){
            System.out.println("Triángulo nº: " + trianguloLista.indexOf(triangulo) + "\n");
            System.out.println(triangulo);
        }
    }

    public void eliminarCuadrado(int cuadrado){
        System.out.println("Se ha eliminado el cuadrado: ");
        System.out.println(cuadradoLista.get(cuadrado));
        cuadradoLista.remove(cuadrado);
    }

    public void eliminarRectangulo(int rectangulo){
        System.out.println("Se ha eliminado el rectángulo: ");
        System.out.println(rectanguloLista.get(rectangulo));
        rectanguloLista.remove(rectangulo);
    }

    public void eliminarCirculo(int circulo){
        System.out.println("Se ha eliminado el círculo: ");
        System.out.println(circuloLista.get(circulo));
        circuloLista.remove(circulo);
    }

    public void eliminarTriangulo(int triangulo){
        System.out.println("Se ha eliminado el triangulo: ");
        System.out.println(trianguloLista.get(triangulo));
        trianguloLista.remove(triangulo);
    }
}
