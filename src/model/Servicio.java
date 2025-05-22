package model;

public class Servicio {

  private String tipoServicio;
  private String descripcion;
  private double duracion;
  private int precio;


  public Servicio(String tipoServicio, String descripcion, double duracion, int precio) {
    this.tipoServicio = tipoServicio;
    this.descripcion = descripcion;
    this.duracion = duracion;
    this.precio= precio;
  }
}

