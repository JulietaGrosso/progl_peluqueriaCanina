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
    Turnos turno = new Turnos(new Date("22/05/2025 09:10"), Estado.PROGRAMADO, johnny);
    Servicio servicio = new Servicio(Tiposervicio.BAÑO, "Baño", 2, 2000, turno);


    System.out.println(johnny.mostrarDatos());
    System.out.println(turno.mostrarDatos());
    System.out.println(servicio.mostrarDatos());


    Mascota donato = new Mascota("Donato", Especie.GATO, "Orange Tabby", 5, "Julieta");
    Turnos turnoDonato = new Turnos(new Date("23/05/2025 09:30"), Estado.PROGRAMADO, donato);
    Servicio servicioDonato = new Servicio(Tiposervicio.BAÑO, "Baño", 1, 2000, turnoDonato);

    System.out.println(donato.mostrarDatos());
    System.out.println(turnoDonato.mostrarDatos());
    System.out.println(servicioDonato.mostrarDatos());


    Mascota leia = new Mascota("Leia", Especie.GATO, "bicolor", 4, "Maximiliano");
    Turnos turnoLeia = new Turnos(new Date("24/05/2025 10:00"), Estado.REALIZADO, leia);
    Servicio servicioLeia = new Servicio(Tiposervicio.LIMPIEZA_OIDOS, "Limpieza", 1, 1500, turnoLeia);

    System.out.println(leia.mostrarDatos());
    System.out.println(turnoLeia.mostrarDatos());
    System.out.println(servicioLeia.mostrarDatos());
  }
}