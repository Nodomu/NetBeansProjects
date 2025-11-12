/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpilas;

/**
 *
 * @author Macla
 */
public class nodo {
    
     private int id;
     private String nom;
     private float dur;
     private int edad;
     private int valor;
     private String cate;
    
   public nodo()
   {
       id = 0;
       nom = "";
       dur = 0;
       edad = 0;
       valor = 0;
       cate = "";
       
    }

      public nodo(int id, String nom, float dur) {
        this.id = id;
        this.nom = nom;
        this.dur = dur;
        do {
            this.edad= (int) (Math.random() * 60);
        } while (this.edad < 5);
        if (edad>=5 && edad<=10) {
            this.valor=3000;
            this.cate="Niños";
        }else if (edad>=11 && edad<=17) {
            this.valor=7000;
            this.cate="Adolescentes";
        }else if (edad>=18) {
            this.valor=9000;
            this.cate="Adultos";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getDur() {
        return dur;
    }

    public void setDur(float dur) {
        this.dur = dur;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }
   
   
}
