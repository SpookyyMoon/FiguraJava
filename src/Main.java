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
            System.out.println("\n 8. Salir");

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
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                validoCrear = true;
                                break;
                        }
                        break;
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
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                validoEliminar = true;
                                break;
                        }
                        break;
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
                        break;
                    }
                    break;
                case 4:
                    System.out.flush();
                    System.out.println(" == Figura con mayor area == ");
                    break;
                case 5:
                    System.out.flush();
                    System.out.println(" == Figura con mayor perímetro == ");
                    break;
                case 6:
                    System.out.flush();
                    System.out.println(" == Lista de figuras == ");
                    break;
                case 7:
                    System.out.flush();
                    System.out.println(" == Lista de tipos de figuras == ");
                    break;
                case 8:
                    System.out.flush();
                    System.out.println("Saliendo...");
                    System.exit(1);
            }
        }
    }
}