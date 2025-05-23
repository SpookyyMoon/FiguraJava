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

    public void crearTriangulo(String color, String nombre, int X, int Y, int base, int altura, int lado, int lado1){
        trianguloLista.add(new Triangulo(color, nombre, X, Y, base, altura, lado, lado1));
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

    public void bubbleSortFigurasArea(){
        for(Cuadrado cuadrado: cuadradoLista){
            for(Cuadrado cuadrado1: cuadradoLista){
                if(cuadrado.calcularArea() > cuadrado1.calcularArea()){
                    Cuadrado cuadrado1Copia = cuadrado1;
                    cuadrado1 = cuadrado;
                    cuadrado = cuadrado1Copia;
                }
            }
        }
        System.out.println("El cuadrado con la mayor area es: \n");
        System.out.println(cuadradoLista.getLast());

        for(Rectangulo rectangulo: rectanguloLista){
            for(Rectangulo rectangulo1: rectanguloLista){
                if(rectangulo.calcularArea() > rectangulo1.calcularArea()){
                    Rectangulo rectangulo1Copia = rectangulo1;
                    rectangulo1 = rectangulo;
                    rectangulo = rectangulo1Copia;
                }
            }
        }
        System.out.println("El rectángulo con la mayor area es: \n");
        System.out.println(rectanguloLista.getLast());

        for(Circulo circulo: circuloLista){
            for(Circulo circulo1: circuloLista){
                if(circulo.calcularArea() > circulo1.calcularArea()){
                    Circulo circulo1Copia = circulo1;
                    circulo1 = circulo;
                    circulo = circulo1Copia;
                }
            }
        }
        System.out.println("El círculo con la mayor area es: \n");
        System.out.println(circuloLista.getLast());

        for(Triangulo triangulo: trianguloLista){
            for(Triangulo triangulo1: trianguloLista){
                if(triangulo.calcularArea() > triangulo1.calcularArea()){
                    Triangulo triangulo1Copia = triangulo1;
                    triangulo1 = triangulo;
                    triangulo = triangulo1Copia;
                }
            }
        }
        System.out.println("El triángulo con la mayor area es: \n");
        System.out.println(trianguloLista.getLast());
    }

    public void bubbleSortFigurasPerimetro(){
        for(Cuadrado cuadrado: cuadradoLista){
            for(Cuadrado cuadrado1: cuadradoLista){
                if(cuadrado.calcularPerimetro() > cuadrado1.calcularPerimetro()){
                    Cuadrado cuadrado1Copia = cuadrado1;
                    cuadrado1 = cuadrado;
                    cuadrado = cuadrado1Copia;
                }
            }
        }
        System.out.println("El cuadrado con el mayor perímetro es: \n");
        System.out.println(cuadradoLista.getLast());

        for(Rectangulo rectangulo: rectanguloLista){
            for(Rectangulo rectangulo1: rectanguloLista){
                if(rectangulo.calcularPerimetro() > rectangulo1.calcularPerimetro()){
                    Rectangulo rectangulo1Copia = rectangulo1;
                    rectangulo1 = rectangulo;
                    rectangulo = rectangulo1Copia;
                }
            }
        }
        System.out.println("El rectángulo con el mayor perímetro es: \n");
        System.out.println(rectanguloLista.getLast());

        for(Circulo circulo: circuloLista){
            for(Circulo circulo1: circuloLista){
                if(circulo.calcularPerimetro() > circulo1.calcularPerimetro()){
                    Circulo circulo1Copia = circulo1;
                    circulo1 = circulo;
                    circulo = circulo1Copia;
                }
            }
        }
        System.out.println("El círculo con el mayor perímetro es: \n");
        System.out.println(circuloLista.getLast());

        for(Triangulo triangulo: trianguloLista){
            for(Triangulo triangulo1: trianguloLista){
                if(triangulo.calcularPerimetro() > triangulo1.calcularPerimetro()){
                    Triangulo triangulo1Copia = triangulo1;
                    triangulo1 = triangulo;
                    triangulo = triangulo1Copia;
                }
            }
        }
        System.out.println("El triángulo con el mayor perímetro es: \n");
        System.out.println(trianguloLista.getLast());
    }

    public void moverCuadrado(int indice, int nuevaX, int nuevaY){
            Cuadrado c = cuadradoLista.get(indice);
            c.setPosX(nuevaX);
            c.setPosY(nuevaY);
            System.out.println("Cuadrado movido a nuevas coordenadas: X=" + nuevaX + ", Y=" + nuevaY);
    }

    public void moverRectangulo(int indice, int nuevaX, int nuevaY){
            Rectangulo r = rectanguloLista.get(indice);
            r.setPosX(nuevaX);
            r.setPosY(nuevaY);
            System.out.println("Rectángulo movido a nuevas coordenadas: X=" + nuevaX + ", Y=" + nuevaY);
    }

    public void moverCirculo(int indice, int nuevaX, int nuevaY){
            Circulo c = circuloLista.get(indice);
            c.setPosX(nuevaX);
            c.setPosY(nuevaY);
            System.out.println("Círculo movido a nuevas coordenadas: X=" + nuevaX + ", Y=" + nuevaY);
    }

    public void moverTriangulo(int indice, int nuevaX, int nuevaY){
            Triangulo t = trianguloLista.get(indice);
            t.setPosX(nuevaX);
            t.setPosY(nuevaY);
            System.out.println("Triángulo movido a nuevas coordenadas: X=" + nuevaX + ", Y=" + nuevaY);
    }
}
