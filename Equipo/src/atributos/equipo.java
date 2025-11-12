/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos;

/**
 *
 * @author HP-FLIABC
 */
public class equipo {
    String nombreequipo;
    int partidosGanados;
    String categoria;
    
    public equipo(String nombre, int ganados, String cat)
    {
        nombreequipo = nombre;
        partidosGanados = ganados;
        categoria = cat;
    }
}
