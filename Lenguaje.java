public class Lenguaje {
String nombre;
Integer año;

public Lenguaje (){}

public Lenguaje(String nombre, Integer año) {
    this.nombre = nombre;
    this.año = año;
}

public void descripción () {
    System.out.println(this.nombre + " fue creado en " + this.año);
}
}
