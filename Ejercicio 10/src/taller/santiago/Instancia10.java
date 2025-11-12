/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.santiago;

import java.util.Scanner;
public class Instancia10 {
    
    public static void main(String[]args)
    {
        int a;
        Ejercicio10 arista;
        Scanner Lec;
        arista = new Ejercicio10();
        Lec=new Scanner(System.in);
        System.out.println("Ingrese el valor de la arista");
        a=Lec.nextInt();
        arista.setArista(a);
        System.out.println("LOS DATOS OBTENIDOS SON:");
        System.out.println("La diagonal del cubo es: " +arista.caclDiagonal());
        System.out.println("El area latelar del cubo es: " +arista.calcAreaLateral());
        System.out.println("El area total del cubo es: " +arista.calcAreaTotal());
        System.out.println("El volumen del cubo es: " +arista.calcVolumen());
    }
}
