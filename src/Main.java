import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        try{
            do {
                System.out.print("""
                        ¿Que ejercicio desea ejecutar?
                        0. Salir
                        1. Sistema de recomendación de peliculas
                        2. Calculadora de Descuentos
                        """);
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        ejercicio1(scanner);
                        break;
                    case 2:
                        ejercicio2(scanner);
                        break;
                    default:
                        System.out.println("Finalizando ejecucion");
                }
            }while (option != 0);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void ejercicio1(Scanner scanner){
        System.out.println("Ejercicio 1: Sistema de Recomendación de Películas");
        /*Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
        ciencia ficción) y luego recomiende una película basada en su elección.*/

        String[] peliculas = {
                "Mad Max: Furia en la carretera (2015)",
                "La vida de Brian (1979)",
                "El secreto de sus ojos (2009)",
                "Interstellar (2014)"
        };
        int option;
        try{
            System.out.print("""
                    ¿Cual es su genero favorito?
                    1. Accion
                    2. Comedia
                    3. Drama
                    4. Ciencia Ficcion
                    """);
            option = scanner.nextInt();
            if(option < 1 || option > 4) throw new Exception("Opcion no valida");
            else System.out.println("Le recomendamos: "+peliculas[option-1]);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void ejercicio2(Scanner scanner){
        System.out.println("Ejercicio 2: Calculadora de Descuentos");
        /*Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
        (estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
        15% para jubilados. Imprime el precio final después del descuento*/

        float[] descuentos = {0.1f, 0.05f, 0.15f};
        try{
            System.out.print("Escribe el precio del producto: ");
            float precio = scanner.nextFloat();

            System.out.print("""
                    Escribe la categoria a la pertenece:
                    1. Estudiante
                    2. Adulto
                    3. Jubilado
                    """);
            int categoria = scanner.nextInt();
            if(categoria > 3 && categoria < 1) throw new Exception("Opcion no valida");
            else System.out.println("El precio final es: "+(precio*(1-descuentos[categoria-1])));
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void ejercicio3(Scanner scanner){
        System.out.println("Ejercicio 3: Generador de Rutinas de Ejercicio");
        /*Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
        avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
        duraciones.*/

        System.out.print("""
                Seleccione su nivel de condicion fisica:
                1. Principiante
                2. Intermedio
                3. Avanzado
                """);
        String[] programas = {
                """
                Lunes - Sentadillas
                Martes - Flexiones
                Miercoles - Plancha
                """,
                """
                Lunes - Sentadillas, peso muerto
                Martes - Press de banca, flexiones
                Miercoles - Descanso o cardio
                Jueves - Remo con barra, jalón al pecho
                Viernes - Press militar, curl de biceps
                """,
                """
                Lunes - Sentadilla profunda, peso muerto, convencional, lunges bulgaros
                Martes - Press de banca inclinado, crucifijos con mancuernas, flexiones con peso
                Miercoles - Descanso o cardio
                Jueves - Remo con barra T, jalon al menton, dominadas
                Viernes - Press militar detras del cuello, elevaciones frontales, curl de biceps
                """
        };
        try{
            int option = scanner.nextInt();
            System.out.println("Su rutina: \n" + programas[option-1]);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}