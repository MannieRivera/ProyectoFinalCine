/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalgui;

/**
 *
 * @author LENOVO
 */
public class Genero {
    
    
    int idgenero;
    String genero;
    
    
    public Genero(){
        this.idgenero = 0;
        this.genero = "";
        
    }
    
    public Genero(int idgenero, String genero) {
        this.idgenero = idgenero;
        this.genero = genero;
    }

    public int getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(int idgenero) {
        this.idgenero = idgenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
