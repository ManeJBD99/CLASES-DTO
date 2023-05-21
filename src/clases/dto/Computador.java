/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class Computador {
    private String modelo;
    private String marca;
    private String año;
    private String procesador;
    private String RAM;
    private String tarjetaGrafica;
    private String discoDuro;
    private String sistemaOperativo;
    
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
    
    public String getAño(){
        return año;
    }
    
    public void setAño(String año){
        this.año = año;
    }
    
    public String getProcesador(){
       return procesador;
    }
    
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    
    public String getRAM(){
        return RAM;
    }
    
    public void setRAM(String RAM){
        this.RAM = RAM;
    }
    
    public String getTarjetaGrafica(){
        return tarjetaGrafica;
    }
    
    public void setTarjetaGrafica(String tarjetaGrafica){
        this.tarjetaGrafica = tarjetaGrafica;
    }
    
    public String getDiscoDuro(){
        return discoDuro;
    }
    
    public void setDiscoDuro(String discoDuro){
        this.discoDuro = discoDuro;
    }
    
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
}
