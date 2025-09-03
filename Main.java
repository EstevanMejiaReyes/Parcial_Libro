public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 0);

        System.out.println("Información del libro:");
        System.out.println(libro);
        System.out.println();

        System.out.println("Intentando realizar un préstamo...");
        if (libro.prestar()) {
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }
        System.out.println("Estado actual del libro:");
        System.out.println(libro);
        System.out.println();

        System.out.println("Intentando realizar una devolución...");
        if (libro.devolver()) {
            System.out.println("Devolución realizada con éxito.");
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }
        System.out.println("Estado final del libro:");
        System.out.println(libro);
        system.out.println("Prueba finalizada.");
    }
} 
