/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalgui;

/**
 *
 * @author LENOVO
 */
public class Pelicula {
    
    int idpelicula;
    String pelicula;
    String generop;
    String clasificacionp;
    String estreno;
    
    
    
    public Pelicula(){
        this.idpelicula = 0;
        this.pelicula = "";
        this.generop = "";
        this.clasificacionp = "";
        this.estreno ="";
        
    }

    public Pelicula(int idpelicula, String pelicula, String generop, String clasificacionp, String estreno) {
        this.idpelicula = idpelicula;
        this.pelicula = pelicula;
        this.generop = generop;
        this.clasificacionp = clasificacionp;
        this.estreno = estreno;
    }

    public int getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getGenerop() {
        return generop;
    }

    public void setGenerop(String generop) {
        this.generop = generop;
    }

    public String getClasificacionp() {
        return clasificacionp;
    }

    public void setClasificacionp(String clasificacionp) {
        this.clasificacionp = clasificacionp;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }
    
    
}
