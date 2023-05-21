/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class Vestimenta {
        private String tela;
    private String diseñador;
    private String marca;
    private String modelo;
    private String talla;
    private Integer costo;
    
    public String getTela(){
        return tela;
    }
    
    public void setTela(String tela){
        this.tela = tela;
    }
    
    public String getDiseñador(){
        return diseñador;
    }
    
    public void setDiseñador(String diseñador){
        this.diseñador = diseñador;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;    
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getTalla(){
        return talla;
    }
    
    public void setTalla(String talla){
        this.talla = talla;
    }
    
    public Integer getCosto(){
        return costo;
    }
    
    public void setCosrto(Integer costo){
        this.costo = costo;
    }

}
