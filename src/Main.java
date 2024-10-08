import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        try{
            do {
                System.out.println("""
                        ¿Que elercicio desea ejecutar?
                        0. Salir
                        1. Sistema de recomendación de peliculas
                        """);
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        ejercicio1(scanner);
                        break;
                    case 2:
                        ejercicio2(scanner);
                        break;
                }
            }while (option != 0);
        }catch(Exception e){

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
                    Ingrese su respuesta:
                    """);
            option = scanner.nextInt();
            if(option < 1 || option > 4) throw new Exception("Opcion no valida");
            else System.out.println("Le recomendamos: "+peliculas[option-1]);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    public static void ejercicio2(Scanner scanner){}
}