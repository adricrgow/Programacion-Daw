package clases;

public class PersonaFC {
    String cedula;
    String nombre;
    String apellido;
    char genero;

    public PersonaFC(){

    }

    public PersonaFC(String cedula,String nombre,String apellido,char genero){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public String getCedula(){
        return this.cedula;
    }
}
