/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class Cantante {
        private String nombre;
    private String apellido;
    private Integer edad;
    private String origen;
    private String categoria;
    private String signo;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public Integer getEdad(){
        return edad;
    }
    
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    
    public String getOrigen(){
        return origen;
    }
    
    public void setOrigen(String origen){
        this.origen = origen;
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getSigno(){
        return signo;
    }
    
    public void setSigno(String signo){
        this.signo = signo;
    }
 
}
