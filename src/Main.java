import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gestor gestor = new Gestor();

        int opcion;
        while(true){
            System.out.flush();
            System.out.println(" == Gestor de Figuras == ");
            System.out.println("\n1. Añadir figuras");
            System.out.println("2. Eliminar figura");
            System.out.println("3. Calcular perímetro total");
            System.out.println("4. Figura con mayor area");
            System.out.println("5. Figura con mayor perímetro");
            System.out.println("6. Listar figuras");
            System.out.println("7. Listar tipos de figuras");
            System.out.println("8. ");
            System.out.println("\n 9. Salir");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    int opcionCreacion;
                    boolean validoCrear = false;
                    while (!validoCrear){
                        System.out.flush();
                        System.out.println(" == Creación de figuras == ");
                        System.out.println("\n1. Crear cuadrado");
                        System.out.println("2. Crear rectángulo");
                        System.out.println("3. Crear circulo");
                        System.out.println("4. Crear triángulo");
                        System.out.println("\n5. Volver");

                        opcionCreacion = sc.nextInt();

                        switch (opcionCreacion){
                            case 1:
                                System.out.flush();
                                int baseCuadrado;
                                System.out.println(" == Creación de cuadrado == ");
                                String colorCuadrado = insercionColorSuper(sc);
                                String nombreCuadrado = insercionNombreSuper(sc);
                                int posicionXCuadrado = insercionXSuper(sc);
                                int posicionYCuadrado = insercionYSuper(sc);
                                System.out.println("\nIntroduce la base del cudrado: ");
                                baseCuadrado = sc.nextInt();
                                gestor.crearCuadrado(colorCuadrado, nombreCuadrado, posicionXCuadrado, posicionYCuadrado, baseCuadrado);
                                break;
                            case 2:
                                System.out.flush();
                                int baseRectangulo;
                                int alturaRectangulo;
                                System.out.println(" == Creación de rectangulo == ");
                                String colorRectangulo = insercionColorSuper(sc);
                                String nombreRectangulo = insercionNombreSuper(sc);
                                int posicionXRectangulo = insercionXSuper(sc);
                                int posicionYRectangulo = insercionYSuper(sc);
                                System.out.println("\nIntroduce la base del rectángulo: ");
                                baseRectangulo = sc.nextInt();
                                System.out.println("\nIntroduce la altura del rectángulo: ");
                                alturaRectangulo = sc.nextInt();
                                gestor.crearRectangulo(colorRectangulo, nombreRectangulo, posicionXRectangulo, posicionYRectangulo, baseRectangulo, alturaRectangulo);
                                break;
                            case 3:
                                System.out.flush();
                                int radioCirculo;
                                System.out.println(" == Creación de circulo == ");
                                String colorCirculo = insercionColorSuper(sc);
                                String nombreCirculo = insercionNombreSuper(sc);
                                int posicionXCirculo = insercionXSuper(sc);
                                int posicionYCirculo = insercionYSuper(sc);
                                System.out.println("\nIntroduce el radio del circulo: ");
                                radioCirculo = sc.nextInt();
                                gestor.crearCirculo(colorCirculo, nombreCirculo, posicionXCirculo, posicionYCirculo, radioCirculo);
                                break;
                            case 4:
                                System.out.flush();
                                int baseTriangulo;
                                int alturaTriangulo;
                                int ladoTriangulo;
                                int lado1Triangulo;
                                System.out.println(" == Creación de triangulo == ");
                                String colorTriangulo = insercionColorSuper(sc);
                                String nombreTriangulo = insercionNombreSuper(sc);
                                int posicionXTriangulo = insercionXSuper(sc);
                                int posicionYTriangulo = insercionYSuper(sc);
                                System.out.println("\nIntroduce la base del triángulo: ");
                                baseTriangulo = sc.nextInt();
                                System.out.println("\nIntroduce la altura del triángulo: ");
                                ladoTriangulo = sc.nextInt();
                                System.out.println("\nIntroduce la longitud del lado del triángulo: ");
                                lado1Triangulo = sc.nextInt();
                                System.out.println("\nIntroduce la longitud del lado1 del triángulo: ");
                                alturaTriangulo = sc.nextInt();
                                gestor.crearTriangulo(colorTriangulo, nombreTriangulo, posicionXTriangulo, posicionYTriangulo, baseTriangulo, alturaTriangulo, ladoTriangulo, lado1Triangulo);
                                break;
                            case 5:
                                validoCrear = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    int opcionEliminar;
                    boolean validoEliminar = false;
                    while (!validoEliminar){
                        System.out.flush();
                        System.out.println(" == Eliminación de figuras == ");
                        System.out.println("\n1. Eliminar cuadrado");
                        System.out.println("2. Eliminar rectángulo");
                        System.out.println("3. Eliminar circulo");
                        System.out.println("4. Eliminar triángulo");
                        System.out.println("\n5. Volver");

                        opcionEliminar = sc.nextInt();

                        switch (opcionEliminar){
                            case 1:
                                int cuadradoEliminar;
                                System.out.println(" == Eliminar cuadrado == \n");
                                gestor.mostrarCuadrados();
                                cuadradoEliminar = sc.nextInt();
                                gestor.eliminarCuadrado(cuadradoEliminar);
                                break;
                            case 2:
                                int rectanguloEliminar;
                                System.out.println(" == Eliminar rectángulo == \n");
                                gestor.mostrarRectangulos();
                                rectanguloEliminar = sc.nextInt();
                                gestor.eliminarRectangulo(rectanguloEliminar);
                                break;
                            case 3:
                                int circuloEliminar;
                                System.out.println(" == Eliminar círculo == \n");
                                gestor.mostrarCirculos();
                                circuloEliminar = sc.nextInt();
                                gestor.eliminarCirculo(circuloEliminar);
                                break;
                            case 4:
                                int trianguloEliminar;
                                System.out.println(" == Eliminar triángulo == \n");
                                gestor.mostrarTriangulos();
                                trianguloEliminar = sc.nextInt();
                                gestor.eliminarTriangulo(trianguloEliminar);
                                break;
                            case 5:
                                validoEliminar = true;
                                break;
                        }
                    }
                    break;
                case 3:
                    int opcionPerimetro;
                    boolean validoPerimetro = false;
                    while (!validoPerimetro){
                        System.out.flush();
                        System.out.println(" == Calcular perímetro == ");
                        System.out.println("\n1. Perímetro cuadrado");
                        System.out.println("2. Perímetro rectángulo");
                        System.out.println("3. Perímetro círculo");
                        System.out.println("4. Perímetro triángulo");
                        System.out.println("\n5. Volver");

                        opcionPerimetro = sc.nextInt();

                        switch (opcionPerimetro){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                validoPerimetro = true;
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.flush();
                    System.out.println(" == Figura con mayor area == \n");
                    gestor.bubbleSortFigurasArea();
                    System.out.println("\nPulsa enter para volver...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 5:
                    System.out.flush();
                    System.out.println(" == Figura con mayor perímetro == ");
                    gestor.bubbleSortFigurasPerimetro();
                    System.out.println("\nPulsa enter para volver...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 6:
                    System.out.flush();
                    System.out.println(" == Lista de figuras == ");
                    System.out.println(" = Cuadrados = \n");
                    gestor.mostrarCuadrados();
                    System.out.println("\n = Rectángulos = \n");
                    gestor.mostrarRectangulos();
                    System.out.println("\n = Círculos = \n");
                    gestor.mostrarCirculos();
                    System.out.println("\n = Triángulos = \n");
                    gestor.mostrarTriangulos();
                    System.out.println("\nPulsa enter para volver...");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 7:
                    boolean validoListar = false;
                    int opcionListar;
                    while(!validoListar){
                        System.out.flush();
                        System.out.println(" == Lista de tipos de figuras == ");
                        System.out.println("1. Lista de cuadrados: ");
                        System.out.println("2. Lista de rectángulos: ");
                        System.out.println("3. Lista de círculos: ");
                        System.out.println("4. Lista de triángulos: ");

                        opcionListar = sc.nextInt();

                        switch (opcionListar){
                            case 1:
                                System.out.println("Lista de cuadrados: ");
                                gestor.mostrarCuadrados();
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 2:
                                System.out.println("Lista de rectángulos: ");
                                gestor.mostrarRectangulos();
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 3:
                                System.out.println("Lista de círculos: ");
                                gestor.mostrarCirculos();
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 4:
                                System.out.println("Lista de triángulos: ");
                                gestor.mostrarTriangulos();
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 5:
                                validoListar = true;
                                break;
                        }
                    }
                    break;
                case 8:
                    int opcionMover;
                    boolean validoMover = false;
                    while (!validoMover) {
                        System.out.flush();
                        System.out.println(" == Mover figura == ");
                        System.out.println("\n1. Mover cuadrado");
                        System.out.println("2. Mover rectángulo");
                        System.out.println("3. Mover círculo");
                        System.out.println("4. Mover triángulo");
                        System.out.println("\n5. Volver");

                        opcionMover = sc.nextInt();

                        switch (opcionMover) {
                            case 1:
                                System.out.flush();
                                System.out.println(" == Mover cuadrado == \n");
                                gestor.mostrarCuadrados();
                                System.out.println("Selecciona el cuadrado a mover: ");
                                int cuadradoMover = sc.nextInt();
                                System.out.println("Introduce nueva posición X: ");
                                int nuevaXCuadrado = sc.nextInt();
                                System.out.println("Introduce nueva posición Y: ");
                                int nuevaYCuadrado = sc.nextInt();
                                gestor.moverCuadrado(cuadradoMover, nuevaXCuadrado, nuevaYCuadrado);
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 2:
                                System.out.flush();
                                System.out.println(" == Mover rectángulo == \n");
                                gestor.mostrarRectangulos();
                                System.out.println("Selecciona el rectángulo a mover: ");
                                int rectanguloMover = sc.nextInt();
                                System.out.println("Introduce nueva posición X: ");
                                int nuevaXRectangulo = sc.nextInt();
                                System.out.println("Introduce nueva posición Y: ");
                                int nuevaYRectangulo = sc.nextInt();
                                gestor.moverRectangulo(rectanguloMover, nuevaXRectangulo, nuevaYRectangulo);
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 3:
                                System.out.flush();
                                System.out.println(" == Mover círculo == \n");
                                gestor.mostrarCirculos();
                                System.out.println("Selecciona el círculo a mover: ");
                                int circuloMover = sc.nextInt();
                                System.out.println("Introduce nueva posición X: ");
                                int nuevaXCirculo = sc.nextInt();
                                System.out.println("Introduce nueva posición Y: ");
                                int nuevaYCirculo = sc.nextInt();
                                gestor.moverCirculo(circuloMover, nuevaXCirculo, nuevaYCirculo);
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 4:
                                System.out.flush();
                                System.out.println(" == Mover triángulo == \n");
                                gestor.mostrarTriangulos();
                                System.out.println("Selecciona el triángulo a mover: ");
                                int trianguloMover = sc.nextInt();
                                System.out.println("Introduce nueva posición X: ");
                                int nuevaXTriangulo = sc.nextInt();
                                System.out.println("Introduce nueva posición Y: ");
                                int nuevaYTriangulo = sc.nextInt();
                                gestor.moverTriangulo(trianguloMover, nuevaXTriangulo, nuevaYTriangulo);
                                System.out.println("\nPulsa enter para volver...");
                                sc.nextLine();
                                sc.nextLine();
                                break;
                            case 5:
                                validoMover = true;
                                break;
                        }
                    }
                    break;
                case 9:
                    System.out.flush();
                    System.out.println("Saliendo...");
                    System.exit(1);
            }
        }
    }

    public static String insercionColorSuper(Scanner sc){
        String colorFigura;

        System.out.println("Introduce el color de la figura: ");
        sc.nextLine(); // Evitar recibir el texto
        colorFigura = sc.nextLine();

        return colorFigura;
    }

    public static String insercionNombreSuper(Scanner sc){
        String nombreFigura;

        System.out.println("Introduce el nombre para la figura: ");
        sc.nextLine();
        nombreFigura = sc.nextLine();

        return nombreFigura;
    }

    public static int insercionXSuper(Scanner sc){
        int posicionX;


        System.out.println("Introduce la posicion X: ");
        posicionX = sc.nextInt();

        return posicionX;
    }

    public static int insercionYSuper(Scanner sc){
        int posicionY;


        System.out.println("Introduce la posición Y: ");
        posicionY = sc.nextInt();

        return posicionY;
    }
}