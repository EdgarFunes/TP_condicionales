import java.util.Random;
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
                        3. Sistema de Recomendación de Libros
                        4. Calculadora de IMC con Recomendaciones
                        5. Juego de Piedra, Papel o Tijera
                        6. Evaluador de Hábitos Saludables
                        7. Sistema de Recomendación de Actividades
                        """);
                option = scanner.nextInt();

                switch (option){
                    case 1:
                        ejercicio1(scanner);
                        break;
                    case 2:
                        ejercicio2(scanner);
                        break;
                    case 3:
                        ejercicio3(scanner);
                        break;
                    case 4:
                        ejercicio4(scanner);
                        break;
                    case 5:
                        ejercicio5(scanner);
                        break;
                    case 6:
                        ejercicio6(scanner);
                        break;
                    case 7:
                        ejercicio7(scanner);
                        break;
                    default:
                        System.out.println("Finalizando ejecucion");
                }
            }while (option != 0);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        scanner.close();
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
        System.out.println("Ejercicio 3: Sistema de Recomendación de Libros");
        /*Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.*/

        System.out.print("""
                Seleccione su nivel de condicion fisica:
                1. Fantasia
                2. Misterio
                3. Romance
                4. Ciencia ficcion
                """);
        String[] libros = {
                """
                El señor de los anillos
                Juego de Tronos
                La biblioteca de la media noche de Katherine
                """,
                """
                Crimen y castigo de Fiodor Dostoievski
                El Nombre de la Rosa de Umberto Eco
                Perdida de Gilliam Flynn
                """,
                """
                Orgullo y Prejuicio ed Jane Austen
                Normal People de Sally Rooney
                El Cuaderno de noah de Nicholas Sparks
                """,
                """
                Dune de Frank Herbert
                Neuromante de William Gibson
                El Marciano de Andy Weir
                """
        };
        try{
            int option = scanner.nextInt();
            System.out.println("Su recomendacion: \n" + libros[option-1]);
            if(option < 1 || option > 4) throw new Exception("Esa opcion no existe");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void ejercicio4(Scanner scanner){
        System.out.println("Ejercicio 4: Calculadora de IMC con Recomendaciones");
        /*Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
        calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
        peso, peso normal, sobrepeso, obesidad).
        */

        String[] recomendaciones = {
                "Aumentar la ingesta calorica, especialmente de proteinas y grasas",
                "Mantener una dieta equilibrada y variada",
                "Reducir la ingesta calorica y aumentar el gastp energico a traves de la actividad fisica",
                "Consultar a un nutricionista"
        };
        String[] estados = {"Bajo peso", "Peso normal", "Sobrepeso", "Obesidad"};

        try{
            System.out.print("Escriba su altura en metros: ");
            float altura = scanner.nextFloat();
            System.out.print("Escriba su peso en Kg: ");
            float peso = scanner.nextFloat();
            if(altura < 0 || peso < 0) throw new Exception("Entrada incorrecta");
            float IMC = peso / (float)(Math.pow(altura, 2));
            if(IMC < 18.5f){
                System.out.println("Su estado es: "+estados[0]+"\nRecomendacion: " + recomendaciones[0]);
            }else if(IMC >= 18.5f && IMC <= 24.9f){
                System.out.println("Su estado es: "+estados[1]+"\nRecomendacion: " + recomendaciones[1]);
            }else if(IMC > 24.9f && IMC <= 29.9f){
                System.out.println("Su estado es: "+estados[2]+"\nRecomendacion: " + recomendaciones[2]);
            }else if(IMC > 29.9f){
                System.out.println("Su estado es: "+estados[3]+"\nRecomendacion: " + recomendaciones[3]);
            }else{
                System.out.println("No corresponde a ninguna");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void ejercicio5(Scanner scanner){
        System.out.println("Ejercicio 5: Juego de Piedra, Papel o Tijera");
        /*Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
        elige una opción al azar y determina quién gana. Imprime el resultado del juego.
        */

        Random randomNum = new Random();
        try{
            int option = 0;
            do {
                System.out.println("""
                    Escoja una opcion:
                    1. Piedra
                    2. Papel
                    3. Tijera
                    0. Salir
                    """);
                String[] opciones = {"Piedra", "Papel", "Tijeras"};
                option = scanner.nextInt();
                if(option < 0 || option > 3) throw new Exception("Opcion no valida");
                if(option == 0) break;
                int choose = randomNum.nextInt(3)+1;
                System.out.println("Tu: "+opciones[option-1]+"\nMaquina: "+opciones[choose-1]);
                //Si es igual
                if(option == choose) System.out.println("Empate");
                //Piedra - Papel
                else if(option == 1 && choose == 2) System.out.println("Perdiste");
                //Piedra - Tijera
                else if(option == 1 && choose == 3) System.out.println("Ganaste");
                //Papel - Piedra
                else if(option == 2 && choose == 1) System.out.println("Ganaste");
                //Papel - tijeras
                else if(option == 2 && choose == 3) System.out.println("Perdiste");
                //Tijeras - Piedra
                else if(option == 3 && choose == 1) System.out.println("Perdiste");
                //Tijeras - Papel
                else if(option == 3 && choose == 2) System.out.println("Ganaste");
            }while(option != 0);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void ejercicio6(Scanner scanner){
        System.out.println("Ejercicio 6: Evaluador de Hábitos Saludables");
        /*Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
        ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
        hábitos saludables basada en estos datos.*/

        try{
            System.out.print("Cuantas horas duerme?: ");
            int dormir = scanner.nextInt();
            if(dormir <= 0 || dormir > 24) throw new Exception("Entrada invalida");
            System.out.print("Cuantas horas hace ejercicio?: ");
            int ejercicio = scanner.nextInt();
            if(ejercicio <= 0 || ejercicio > 24) throw new Exception("Entrada invalida");
            System.out.print("Cuantas comidas saludables come?: ");
            int comidas = scanner.nextInt();
            if(comidas <= 0) throw new Exception("Entrada invalida");

            if(dormir < 7) System.out.println("Te faltan horas de sueño");
            else if (dormir >= 7 && dormir <= 9) System.out.println("Horas de sueño correctas");
            else System.out.println("Duermes mucho");

            if(ejercicio < 2) System.out.println("Deberias realizar mas ejercicio");
            else System.out.println("Tienes buena actividad fisica");

            if(comidas < 3) System.out.println("Deberias mejorar tu dieta");
            else System.out.println("Tienes una buena alimentacion");

        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void ejercicio7(Scanner scanner){
        System.out.println("Ejercicio 7: Sistema de Recomendación de Actividades");
        /*Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        recomiende una actividad basada en su estado de ánimo.*/

        String[] actividad = {
                "Feliz: Organiza una reunión con amigos o familiares para disfrutar de una comida o una tarde de juegos. Compartir momentos alegres con seres queridos puede aumentar tu felicidad.",
                "Triste: Escribe en un diario sobre tus sentimientos. Expresar lo que sientes puede ayudarte a procesar la tristeza y encontrar claridad.",
                "Enérgico: Realiza una sesión de ejercicio, como correr, bailar o practicar un deporte. La actividad física no solo canaliza tu energía, sino que también libera endorfinas que mejoran tu estado de ánimo.",
                "Relajado: Dedica tiempo a meditar o practicar yoga. Estas actividades te ayudarán a mantener la calma y a disfrutar de un momento de paz interior."
        };
        try{
            System.out.print("""
                    Ingrese su estado de animo:
                    1. Feliz
                    2. Triste
                    3. Energico
                    4. Relajado
                    """);
            int option = scanner.nextInt();
            if(option < 1 || option > 4) throw new Exception("Opcion no valida");
            System.out.println(actividad[option-1]);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}