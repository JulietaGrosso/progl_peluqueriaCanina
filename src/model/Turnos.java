package model;

import enums.Estado;

import java.util.Date;

public class Turnos {
  private int id;
  private Date fecha;
  private Estado estado;
  private Mascota mascota;

  public Turnos(int id, Date fecha, Estado estado, Mascota mascota) {
    this.id= id;
    this.fecha = fecha;
    this.estado = estado;
    this.mascota= mascota;
  }

  public int getId(){return this.id;}
  public Date getFecha(){return this.fecha;}
  public Estado getEstado(){return this.estado;}
  public Mascota getMascota(){return this.mascota;}


  public void setId(int id) {
    this.id = id;
  }
  public void setFecha(Date fecha){
    this.fecha= fecha;
  }
  public void setEstado(Estado estado){
    this.estado=estado;
  }
  public void setMascota(Mascota mascota){
    this.mascota=mascota;
  }

  public String mostrarDatos(){
    return ":" + id + "\n" +
            "Fecha " + fecha + "\n" +
            "Estado" + estado + "\n" +
            "Mascota" + mascota + "\n";

  }

  public String toString(){
    return mostrarDatos();

  }
}
