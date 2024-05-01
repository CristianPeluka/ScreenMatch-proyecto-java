# Proyecto ScreenMatch
<p>
El proposito del proyecto en Java es crear una plataforma de streaming donde cada persona podra ingresar los datos de sus peliculas, series y musicas favoritas, dandoles una calificacion final.
Y esto se hace con el fin de poder almacenar datos y poder medirlas sacando un promedio por peliculas, series o musica,  ademas de recopilar una lista de las mejores recomendadas.
</p>
<h2> Configuración del ambiente </h2>
<ul> 
  <li>JDK 17 (Java Develonment Kit)</li>
  <li>IDE Intellij Community (Integrated Development Environment)</li> 
</ul>
<h2>Paso a paso de la ejecución del proyecto</h2>
<h3>1. Declarar variables</h3>
<p>
  Lo primero que se hizo fue identificar la informacion o datos que se queria ingresar de la pelicula a nuestra plataforma de streaming, para despues asignarle un tipo de variable y declararlo.

  En esta primera imagen pueden visualizar la informacion de la primera película con sus respectivas variables.
</p>

        int fechaDeLanzamiento1 = 1999;
        double evaluacion1 = 4.5;
        boolean incluidoEnELPlanBasico1 = true;
        String nombre1 = "Matrix";
        String sinopsis1 = """
                La mejor pelicula del fin del milenio, protagonizada por muy buenos actores,
                La película plantea que en el futuro, tras una dura guerra, casi todos los seres humanos
                han sido esclavizados por las máquinas y las inteligencias artificiales creadas.
                Estas los tienen en suspensión y con sus mentes conectadas a una realidad virtual llamada
                Matrix que representa el final del siglo XX.
                """; 
<p>Y en esta segunda imagen pueden visualizar la informacion de la siguiente película con sus respectivas variables.</p>
        
        int fechaDeLanzamiento2 = 2024;
        double evaluacion2 = 3;
        boolean incluidoEnELPlanBasico2 = true;
        String nombre2 = "Madame Web";
        String sinopsis2 = """
                Una paramédica de Manhattan que se ve obligada a enfrentarse a revelaciones sobre su pasado
                forja una relación con tres jóvenes destinadas a tener un futuro poderoso, si consiguen
                sobrevivir a un presente mortal.
                """;
<h3>2. Mandamos a imprimir los valores que le asignamos a las variables</h3>
<p>En esta parte del proyecto, vamos armando la estructura de lo que queremos mostrar en pantalla, con un codigo llamado'System.out.println()' vamos a poder
  conocer los resultados de la informacion que ingresaron las personas de sus películas.</p>

        System.out.println("Pelicula: " + nombre1);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento1);
        System.out.println("Evaluacion: " + evaluacion1);
        System.out.println("Incluido en el plan: " + incluidoEnELPlanBasico1);
        System.out.println("Sinopsis: " + sinopsis1);
<h3>3. Utilizamos una condicional</h3>
<p>Aqui vamos a evaluar con una condicion si la pelicula que estamos ingresando es nueva o es retro utilizando la variable fechaDeLanzamiento1 y una fecha como rango.</p>
        
        if (fechaDeLanzamiento1 > 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale ver");
        }
<h3>4. Utilizamos los ciclos de repeticion (ciclo while)</h3>

         while (notas < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Que calificacion le das a la pelicula Matrix");
            double calificacion = teclado.nextDouble();
            MediaDeEvaluacionUsuario = MediaDeEvaluacionUsuario + calificacion;
            notas++;
        }
        System.out.println("La calificacion media que dan los usuarios a la pelicula Matrix es: " + MediaDeEvaluacionUsuario / 3);
<p>El proposito de esta parte es poder calcular el promedio de las 3 calificaciones que le pongan cada persona a una misma pelicula, esto quiere decir que por cada 
  3 calificaciones a una misma pelicula se realizara un promedio dandonos como resultado una evaluacion final de la pelicula y esto nos servira como reseña para otras personas.</p>
<ul>
  <li>Como cada persona tiene que ingresar su calificacion, e usado la clase Scanner para poder capturar la informacion que nos proporciona. </li>
  <li>Luego se creo una variable para poder guardar el objeto Scanner que nos proporciono la persona por el teclado.</li>
  <li>Se crea otra segunda variable para poder almacenar las notas que la persona esta colocando.</li>
  <li>Se crea una tercera variable para calcular el promedio de las calificaciones despues de haber pasado los 3 ciclos que indicamos en la condición.</li>
  <li>Finalmente se manda a imprimir la mediaDeEvaluacionUsuario que es la suma total de las 3 calificaciones y lo dividimos entre 3 para calcular el promedio final de la pelicula, ojo que este calculo lo hacemos afuera del ciclo while
  ya que sino estariamos en un bucle infinito calculando el promedio por cada calificacion que ingrese el usuario.</li>
</ul>
<h3>Declaración e inicialización de las variables usadas en el ciclo while</h3>
        
        int notas = 0;
        double MediaDeEvaluacionUsuario =0;
<h2>Video de demostracion</h2>

