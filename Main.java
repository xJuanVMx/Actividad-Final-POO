import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaZapatos sistema = new SistemaZapatos();
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n TIENDA DE ZAPATOS \n");
            System.out.println("1. Registrar zapato");
            System.out.println("2. Listar zapatos");
            System.out.println("3. Buscar zapato por ID");
            System.out.println("4. Eliminar zapato");
            System.out.println("5. Salir");
            System.out.print("\nElija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\nSeleccione tipo:");
                    System.out.println("1. Deportivo");
                    System.out.println("2. Formal");
                    System.out.println("3. Sandalia");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Marca:");
                    String marca = sc.nextLine();

                    System.out.println("Precio:");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Talla:");
                    int talla = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Cantidad en Stock:");
                    int cantidadEnStock = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.println("Tipo de deporte:");
                        String deporte = sc.nextLine();

                        sistema.agregarZapato(
                                new ZapatoDeportivo(id, marca, precio, talla, cantidadEnStock, deporte));

                    } else if (tipo == 2) {
                        System.out.println("Material:");
                        String material = sc.nextLine();

                        sistema.agregarZapato(
                                new ZapatoFormal(id, marca, precio, talla, cantidadEnStock, material));

                    } else if (tipo == 3) {
                        System.out.println("Tipo de correa:");
                        String correa = sc.nextLine();

                        sistema.agregarZapato(
                                new Sandalia(id, marca, precio, talla, cantidadEnStock, correa));
                    }
                    break;

                case 2:
                    sistema.listarZapatos();
                    break;

                case 3:
                    System.out.println("ID a buscar:");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    ProductoBase encontrado = sistema.buscarPorId(idBuscar);
                    if (encontrado != null)
                        System.out.println("\nEncontrado:\n" + encontrado);
                    else
                        System.out.println("No existe ese ID.");
                    break;

                case 4:
                    System.out.println("ID a eliminar:");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    if (sistema.eliminarZapato(idEliminar))
                        System.out.println("Zapato eliminado.");
                    else
                        System.out.println("No existe ese ID.");
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
