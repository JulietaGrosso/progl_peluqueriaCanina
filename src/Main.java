import enums.Especie;
import enums.Estado;
import enums.Tiposervicio;
import model.Mascota;
import model.Servicio;
import model.Turnos;

import java.util.Date;

public class Main {
  public static void main(String[] args) {


    Mascota johnny = new Mascota( "Johnny", Especie.PERRO,"Pastor Alemán", 10, "Sandra");
    Turnos turno = new Turnos(1, new Date("22/05/2025 09:10"), Estado.PROGRAMADO, johnny);
    Servicio servicio = new Servicio(1, Tiposervicio.BAÑO, "Baño", 2, 2000, turno);


    System.out.println(johnny.mostrarDatos());
    System.out.println(turno.mostrarDatos());
    System.out.println(servicio.mostrarDatos());


    Mascota donato = new Mascota("Donato", Especie.GATO, "Terry Orange", 5, "Julieta");
    System.out.println(donato.mostrarDatos());
  }
}