/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class Ventilador {
    
    private String procedencia;
    private String modelo;
    private String marca;
    private String potencia;
    private Integer precio;
    private String tamaño;
    
    public String getProcedencia (){
        return procedencia;
    }
    
    public void setProcedencia(String procedencia){
        this.procedencia = procedencia;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getPotencia(){
        return potencia;
    }
    
    public void setPotencia(String potencia){
        this.potencia = potencia;
    }
    
    public Integer getPrecio(){
        return precio;
    }
    
    public void setPrecio(Integer precio){
        this.precio = precio;
    }
    
    public String getTamaño(){
        return tamaño;
    }
    
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
       
}
