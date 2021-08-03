package com.dirmod;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Traductor traductor = new Traductor();
        System.out.println("Este sistema obtiene y muestra la secuencia de teclas que hay que pulsar para escribir un cierto mensaje. \n");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el mensaje a codificar: ");

        String mensaje = teclado.nextLine();
        
        System.out.println("La secuencia es:\n"+traductor.translate(mensaje));
    }
}
