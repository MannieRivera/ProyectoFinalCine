/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalgui;

/**
 *
 * @author LENOVO
 */
public class Clasificacion {
    
    int idclasificacion;
    String clasificacion;
    
    
    public Clasificacion(){
        this.idclasificacion = 0;
        this.clasificacion= "";
        
    }

    public Clasificacion(int idclasificacion, String clasificacion) {
        this.idclasificacion = idclasificacion;
        this.clasificacion = clasificacion;
    }

    public int getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(int idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
}
