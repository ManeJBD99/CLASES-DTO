/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 *
public class musica {
    
    private String autor;
    private String emisora;
    private String grupo;
    private String reconocimiento;
    private String categoria;
    private String produccion;
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getEmisora(){
        return emisora;
    }
    public void setEmisora(String emisora){
        this.emisora = emisora;
    }
    
    public String getGrupo(){
        return grupo;
    }
    
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    
    public String getReconocimiento(){
        return reconocimiento;
    }
    
    public void setReconocimiento(String reconocimiento){
        this.reconocimiento = reconocimiento;
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getProduccion(){
        return produccion;
    }
    
    public void setProduccion(String produccion){
        this.produccion = produccion;
    }
         
}
