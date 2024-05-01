import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersion de java");
        System.out.println("PRIMERA PELICULA A EVALUAR");
        // Declaracion de variables
        int fechaDeLanzamiento1 = 1999;
        int fechaDeLanzamiento2 = 2024;
        double evaluacion1 = 4.5;
        double evaluacion2 = 3;
        boolean incluidoEnELPlanBasico1 = true;
        boolean incluidoEnELPlanBasico2 = true;
        String nombre1 = "Matrix";
        String nombre2 = "Madame Web";
        String sinopsis1 = """
                La mejor pelicula del fin del milenio, protagonizada por muy buenos actores,
                La película plantea que en el futuro, tras una dura guerra, casi todos los seres humanos
                han sido esclavizados por las máquinas y las inteligencias artificiales creadas.
                Estas los tienen en suspensión y con sus mentes conectadas a una realidad virtual llamada
                Matrix que representa el final del siglo XX.
                """;
        String sinopsis2 = """
                Una paramédica de Manhattan que se ve obligada a enfrentarse a revelaciones sobre su pasado
                forja una relación con tres jóvenes destinadas a tener un futuro poderoso, si consiguen
                sobrevivir a un presente mortal.
                """;
        int notas = 0;
        int notas1 = 0;
        double MediaDeEvaluacionUsuario =0;
        double MediaDeEvaluacionUsuario1 = 0;

        System.out.println("Pelicula: " + nombre1);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento1);
        System.out.println("Evaluacion: " + evaluacion1);
        System.out.println("Incluido en el plan: " + incluidoEnELPlanBasico1);
        System.out.println("Sinopsis: " + sinopsis1);

        if (fechaDeLanzamiento1 > 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale ver");
        }
        while (notas < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Que calificacion le das a la pelicula Matrix");
            double calificacion = teclado.nextDouble();
            MediaDeEvaluacionUsuario = MediaDeEvaluacionUsuario + calificacion;
            notas++;
        }
        System.out.println("La calificacion media que dan los usuarios a la pelicula Matrix es: " + MediaDeEvaluacionUsuario / 3);

        System.out.println("SEGUNDA PELICULA A EVALUAR");
        System.out.println("Pelicula: " + nombre2);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento2);
        System.out.println("Evaluacion: " + evaluacion2);
        System.out.println("Incluido en el plan: " + incluidoEnELPlanBasico2);
        System.out.println("Sinopsis: " + sinopsis2);

        if (fechaDeLanzamiento2 > 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale ver");
        }

        while (notas1 < 3) {
            Scanner teclado1 = new Scanner(System.in);
            System.out.println("Que calificacion le das a la pelicula Madame Web");
            double calificacion1 = teclado1.nextDouble();
            MediaDeEvaluacionUsuario1 = MediaDeEvaluacionUsuario1 + calificacion1;
            notas1++;
        }
        System.out.println("La calificacion media que dan los usuarios a la pelicula  es: " + MediaDeEvaluacionUsuario1 / 3);

        }

        }