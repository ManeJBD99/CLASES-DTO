/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class Universidad {
    private String estudiantes;
    private String aulas;
    private String docentes;
    private String portero;
    private String vendedores;
    private String baños;

    public String getEstudiantes(){
        return estudiantes;
    }

    public void setEstudiantes(String estudiantes){
        this.estudiantes = estudiantes;
    }
    
    public String getAulas(){
        return aulas;
    }
    
    public void setAulas(String aulas){
        this.aulas = aulas;
    }
    
    
    public String getDocentes(){
    return docentes;        
    }
    
    public void setDocentes(String docentes){
        this.docentes = docentes;
    }
    
    public String getPortero(){
        return portero;
    }
    
    public void setPortero(String portero){
        this.portero = portero;
    }
    
    public String getVendedores(){
        return vendedores;
    }
    
    public void setVendedores(String vendedores){
        this.vendedores = vendedores;
    }
    
    public String getBaños(){
        return baños;
    }

    public void setBaños (String baños){
        this.baños = baños;
    }


}
