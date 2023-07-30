/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalgui;

/**
 *
 * @author manuelfuentes
 */
class Ticket {
    
    int id;
     double precioP,precioAdicional,acumP, total;
     int numeroAsiento; 
     String asiento;
     String cliente;
     String tipo; 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
     String pelicula; 

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

   

   

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    

    Ticket() {
    }

    public int getId() {
        return id;
    }

    public double getAcumP() {
        return acumP;
    }

    public void setAcumP(double acumP) {
        this.acumP = acumP;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioP() {
        return precioP;
    }

    public Ticket(int id, double precioP, double precioAdicional, double acumP, double total, String asiento,String cliente, String pelicula, String tipo) {
        this.id = id;
        this.precioP = precioP;
        this.precioAdicional = precioAdicional;
        this.acumP = acumP;
        this.total = total;
        this.asiento = asiento; 
        this.cliente = cliente; 
        this.pelicula = pelicula;
        this.tipo = tipo; 
       
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public double getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(double precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

  

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", precioP=" + precioP + ", precioAdicional=" + precioAdicional + ", acumP=" + acumP + ", total=" + total + ", numeroAsiento=" + numeroAsiento + ", asiento=" + asiento + ", cliente=" + cliente + ", tipo=" + tipo + ", pelicula=" + pelicula + '}';
    }


    
}
