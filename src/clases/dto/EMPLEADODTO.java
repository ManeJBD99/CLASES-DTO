/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.dto;

/**
 *
 * @author manuc
 */
public class EMPLEADODTO {
    
    private Integer codigo;
    private int Idempleado;
    private String nombre; 
    private String apellido;
    private String cedula;
    private Long salario;   
  
public Integer getCodigo(){
    return codigo;
}

public void setCodigo(Integer codigo){
    this.codigo = codigo;
}

public int getIdempleado(){
    return Idempleado;
}

public void setIdempleado(int Idempleado){
    this.Idempleado = Idempleado;
}

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

public String getCedula(){
return cedula;
}

public void setCedula(String cedula){
    this.cedula = cedula;
}

public Long getSalario(){
    return salario;
}

public void setSalario(Long salario){
    this.salario = salario;
}
}

