/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class Dragon {
        private String tamaño;
    private String color;
    private String cultura;
    private Integer edad;
    private String alimento;
    private String genero;
    
    public String getTmaño(){
        return tamaño;
    }
    
    public void setTamaño (String tamaño){
        this.tamaño = tamaño;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getCultura(){
        return cultura;
    }
    
    public void setCultura(String cultura){
        this.cultura = cultura;
    }
    
    public Integer getEdad(){
        return edad;
    }
    
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    
    public String getAlimento(){
        return alimento;
    }
    
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }

}
