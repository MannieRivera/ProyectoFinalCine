/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalgui;

/**
 *
 * @author manuelfuentes
 */
public class Sala {
    
    int idsala;
    String tipo; 

    public Sala(int idsala, String tipo) {
        this.idsala = idsala;
        this.tipo = tipo;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public String getSalas() {
        return tipo;
    }

    public void setSalas(String salas) {
        this.tipo = salas;
    }
    
}
