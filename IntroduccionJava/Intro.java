public class Intro {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
        // Primitivas - Solo guardan el valor (declaradas con inicialización válida)
        int miEntero = 400; // Declaración y asignación
        double pi = 3.1416; // Declaración y asignación
        boolean bool = true; // Declaración y asignación
        char unCaracter = 'A'; // Declaración y asignación

        // Objetos -> Metodos y propiedades adicionales que permiten manipular los datos
        Integer myInteger = 5;
        Double myDouble = 3.1416;
        Character myCharacter = 'A';
        String myString = "Hola, Mundo!";

        System.out.println("Valor del entero primitivo: " + miEntero);
        System.out.println("Valor del entero objeto: " + myInteger);

        //Cadenas - Strings
        String cadena = "Esto es una cadena de texto.";
        System.out.println("cantidad de caracteres: " + cadena.length());
        System.out.println("cadena en mayusculas: " + cadena.toUpperCase());

        String x = "Hola";
        String y = "HolA";
        System.out.println(x.equals(y)); // true
        System.out.println(x == y); // true

        //CONDICIONALES
        double miDouble = 400.0;
        if(miEntero == miDouble){
            System.out.println("Numeros iguales");
        } else {
            System.out.println("Numeros diferentes");
        }

        int edadInfante = 2;

        if(edadInfante <= 2){
            System.out.println("Infante");
        } else if(edadInfante > 2 && edadInfante < 12){
            System.out.println("Niño");
        } else if(edadInfante >= 12 && edadInfante < 18){
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        boolean llueve = false;
        int temperatura = 20;

        if(!llueve && temperatura >= 20){
            System.out.println("Es un gran día para pasear");
        }else{
            System.out.println("Mejor quedarse en casa");
        }

        int edad = 16;
        boolean permisoDeLosPadres = false;

        if(edad >= 18 || permisoDeLosPadres){
            System.out.println("Puede entrar al concierto");
        } else {
            System.out.println("No puede entrar al concierto");
        }

        // Bucles
        System.out.println("Bucle for:");
        for(int i = 0; i < 5; i++){// i = i + 2 auementa de 2 en 2
            System.out.println("Iteración número: " + i);
            System.out.println("Hola");
        }

        System.out.println("Bucle while:");

        int contador = 0;
        int fin = 5;
        while(contador < fin){
            System.out.println("Iteración número: " + contador);
            contador++;
            System.out.println(contador);
            fin -= 2;
            System.out.println(fin);
        }

        int num1 = 10;
        int num2 = 9;

        do {
            System.out.println("Ejecuta al menos una vez");
        } while(num1 < num2 );

        /*Arrays No puede ser alterado, en caso dinamico usar ArrayList*/
        int[] miArray; // Declaración
        miArray = new int[5]; // Inicialización con tamaño 5

        miArray[0] = 10; // Asignación de valores
        miArray[1] = 20;
        miArray[2] = 30;
        miArray[3] = 40;
        miArray[4] = 50;    
        System.out.println("Elemento en el índice 2: " + miArray[2]);

        int[] otroArray = {5, 10, 15, 20, 25}; // Declaración e inicialización
        System.out.println("Elemento en el índice 3: " + otroArray[3]);

        // Recorrer un array
        System.out.println("Recorriendo miArray:");
        for(int i = 0; i < miArray.length; i++){
            System.out.println("Elemento en el índice " + i + ": " + miArray[i]);
        }

        System.out.println("miArray tiene una longitud de: " + miArray.length);
        System.out.println(miArray[miArray.length - 1]); // Último elemento


        saludo();
        saludo();
        saludo();
        
        saludo("Carlos");


    }

     /* Permisos funcion > public, private, protected
        TIpo de valor de retorno > void, int, String, boolean
        Nombre de la funcion > nombreFuncion
    */

    public static void saludo(){
        System.out.println("¡Hola desde la función saludo!");
    }

    public static void saludo(String nombre){
        System.out.println("¡Hola, " + nombre + " desde la función saludo!");
    }
        
    
}