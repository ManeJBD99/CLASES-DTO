/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class yamahaMT09 {
     private Integer modelo;
     private Integer precio;
     private String año;
     private String velocidadFinal;
     private String codigoMoto;
     private String ubicacion;
    private String color;
    
    public Integer getModelo(){
        return modelo;
    }
    
    public void setModelo(Integer modelo){
        this.modelo = modelo;
    }
    
    public Integer getPrecio(){
        return precio;
    }
   
    public void setPrecio(Integer precio){
        this.precio = precio;
    }
    
    public String getAño(){
        return año;
    }
    
    public void setAño (String año) {
      this.año = año;
    }
    
    public String getVelocidadFinal(){
        return velocidadFinal;
    }
    public void setVelocidadFinal(String velocidadFinal){
        this.velocidadFinal = velocidadFinal;
    }
    public String getCodigoMoto(){
        return codigoMoto;
    } 
    
    public void setCodigoMoto (String codigoMoto){
        this.codigoMoto = codigoMoto;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public void setUbicacion (String ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor (String color){
        this.color = color;
    }
    
}
