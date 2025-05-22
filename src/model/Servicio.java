package model;

import enums.Tiposervicio;

public class Servicio {

  private int id;
  private Tiposervicio tipoServicio;
  private String descripcion;
  private double duracion;
  private int precio;
  private Turnos turno;



  public Servicio(int id, Tiposervicio tipoServicio, String descripcion, double duracion, int precio, Turnos turno) {
    this.id=id;
    this.tipoServicio = tipoServicio;
    this.descripcion = descripcion;
    this.duracion = duracion;
    this.precio= precio;
    this.turno=turno;
  }

  public int getId(){return this.id;}
  public Tiposervicio getTipoServicio(){return this.tipoServicio;}
  public String getDescripcion(){return this.descripcion;}
  public double getduracion(){return this.duracion;}
  public int getPrecio(){return this.precio;}
  public Turnos getTurno(){return this.turno;}

  public void setId(int id){
    this.id= id;
  }

  public void setTipoServicio(Tiposervicio tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setDuracion(double duracion) {
    this.duracion = duracion;
  }

  public void setPrecio(int precio){
    this.precio= precio;
  }

  public void setTurno(Turnos turno) {
    this.turno = turno;
  }

  public String mostrarDatos(){
    return ":" + id + "\n" +
            "tipo servicio " + tipoServicio + "\n" +
            "descripción" + descripcion + "\n" +
            "duración" + duracion + "\n" +
            "precio" + precio + "\n" +
            "Turno" + turno + "\n";

  }

  public String toString(){
    return mostrarDatos();

  }
}



