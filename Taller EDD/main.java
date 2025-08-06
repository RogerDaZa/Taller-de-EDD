import java.util.ArrayList;
import java.util.Scanner;

class Venta {
    String nombre;
    double pr;
    int ID;
    int cant;

    public Venta(String nombre, int ID, double pr, int cant) {
        this.nombre = nombre;
        this.ID = ID;
        this.pr = pr;
        this.cant = cant;
    }
}

public class main {
    public static void main(String[] args) {
        ArrayList<Venta>  ventas= new ArrayList<>();
        double Ing_Total = 0;
        Boolean salir = false;
        Scanner sc = new Scanner(System.in);

        while (!salir) {
            System.out.println("Bienvenido a ventas, Digite la opción de su necesidad: 1. Para crear una venta. 2. Para listar las ventas. 3. Búsqueda por ID. 4. Modificar. 5. Eliminar. 6. Ingresos Totales. 7. Salir :");
            int w = sc.nextInt();
            switch (w) {
                case 1:
                    System.out.println("Escriba el nombre de producto: ");
                    String nombre = sc.next();
                    System.out.println("Digite su ID: ");
                    int ID = sc.nextInt();
                    System.out.println("Digite el precio de su producto: ");
                    double pr = sc.nextDouble();
                    System.out.println("Digite la cantidad de elementos a vender: ");
                    int cant = sc.nextInt();
                    Ing_Total= Ing_Total + pr*cant;
                    ventas.add(new Venta(nombre, ID, pr, cant));
                    System.out.println("Producto añadido, felicidades por su venta");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("La suma de las de los precios es: " + Ing_Total);
                    break;
                case 7:
                    salir = true;
                    System.out.println("Usted ha salido del sistema");
                    break;
                    default:
                    System.out.println("Usted ha digitado un digito fuera del alcance de este sistema");
            }
        }
  
    }
}