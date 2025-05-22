package model;

public class Mascota {

  private int id;
  private String nombre;
  private String especie;
  private String raza;
  private int edad;
  private String nombreDelDueno;



  public Mascota( int id, String nombre, String especie, String raza, int edad, String nombreDelDueno){

    this.id=id;
    this.nombre=nombre;
    this.especie=especie;
    this.raza=raza;
    this.edad=edad;
    this.nombreDelDueno=nombreDelDueno;

  }

  public int getId(){
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getEspecie() {
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

  public void setEspecie(String especie) {
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
}





/*public String mostrarDatos(){
    return "ID:" + id + '/n' +
            "nombre " + nombre; ver esto */



}