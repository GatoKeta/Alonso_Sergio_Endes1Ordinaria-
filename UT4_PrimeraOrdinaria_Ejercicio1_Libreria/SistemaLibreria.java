package ejercicio1;

public class SistemaLibreria {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        libreria.nombre = "Libros y Libros";
        libreria.direccion = "Calle Ficticia 123";
        libreria.agregarLibro("Don Quijote de la Mancha", "Miguel de Cervantes", 9.99);
        libreria.agregarLibro("Cien años de soledad", "Gabriel Garcia Marquez", 12.80);
        libreria.mostrarLibros();
    }
}