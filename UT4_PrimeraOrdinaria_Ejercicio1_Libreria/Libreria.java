package ejercicio1;

public class Libreria {
    String nombre;
    String direccion;
    Libro[] librosEnStock = new Libro[100];
    int cantLib = 0; //cantidad de libros total

    public void agregarLibro(String t, String a, double p) {
        if (cantLib < 100) { //100 libro máximo en la librería
            librosEnStock[cantLib++] = new Libro(t, a, p);//Titulo, autor y precio
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < cantLib; i++) {
            System.out.println(librosEnStock[i].getInfo());
        }
    }
}

class Libro {
    String tit; //titulo 
    String aut; //autor
    double pre; //precio

    public Libro(String t, String a, double p) {
        this.tit = t;
        this.aut = a;
        this.pre = p;
    }

    public String getInfo() {
        return "Titulo: " + tit + ", Autor: " + aut + ", precio: " + pre + " euros";
    }
}




    
