package model;

import enums.Especie;

public class Mascota {

  private static int idContador=0;
  private int id;
  private String nombre;
  private Especie especie;
  private String raza;
  private int edad;
  private String nombreDelDueno;



  public Mascota( String nombre, Especie especie, String raza, int edad, String nombreDelDueno){

    this.id=Mascota.idContador+1;
    this.nombre=nombre;
    this.especie=especie;
    this.raza=raza;
    this.edad=edad;
    this.nombreDelDueno=nombreDelDueno;
    Mascota.idContador=Mascota.idContador+1;
  }

  public int getId(){
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public Especie getEspecie() {
    return especie;
  }

  public String getRaza() {
    return raza;
  }

  public int getEdad() {
    return edad;
  }

  public String getNombreDelDueno() {
    return nombreDelDueno;
  }



  public void setId(int id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEspecie(Especie especie) {
    this.especie = especie;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setNombreDelDueno(String nombreDelDueno) {
    this.nombreDelDueno = nombreDelDueno;
  }





  public String mostrarDatos(){
    return "ID:" + id + "\n" +
            "nombre " + nombre + "\n" +
            "especie" + especie + "\n" +
            "edad" + edad + "\n" +
            "raza" + raza + "\n" +
            "Nombre del dueño" + nombreDelDueno + "\n";

  }

  public String toString(){
    return mostrarDatos();

  }
}









