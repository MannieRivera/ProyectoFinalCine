/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalgui;


public class Cliente {

   
    
    int codigo;
    String nombre;
    int edad;
    String sexo;
    String telefono;
    String direccion;
    int contadorCliente;
    
    public Cliente(){
        this.codigo = 0;
        this.nombre = "";
        this.edad = 0;
        this.telefono = "";
        this.direccion ="";
        this.sexo = "";
        this.contadorCliente = 0;
    }


    public Cliente( int codigo ,String nombre, int edad,String sexo, String telefono, String direccion) {
       
        this.codigo = codigo;
        this.nombre = nombre; 
        this.edad = edad; 
        this.sexo = sexo; 
        this.telefono = telefono; 
        this.direccion = direccion;
        
    }

    public int getContadorCliente() {
        return contadorCliente;
    }

    public void setContadorCliente(int contadorCliente) {
        this.contadorCliente = contadorCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
  
    
}

