package UI;

import Service.UserService;
import java.util.Scanner;

public class Menu {

    Scanner op = new Scanner(System.in);
    int opcion;
    UserService users = new UserService();

    public void Menu() {

        do {
            System.out.println("---------------------MENU----------------------");
            System.out.println("Ingresa un numero dependiendo de que quieres realizar");
            System.out.println("0: Cerrar programa");
            System.out.println("1: Agregar un usuario");
            System.out.println("2: Eliminar un usuario");
            System.out.println("3: Consultar usuarios");

            try {
                System.out.print("Selecciona una opción: ");
                opcion = op.nextInt(); 
                switch (opcion) {
                    case 1:
                        users.addUser();
                        break;

                    case 2:
                        users.deletUser();
                        break;

                    case 3:
                        users.consultUser();
                        break;

                    case 0:
                        System.out.println("Cerrando programa...");
                        break;

                    default:
                        System.out.println("Opción no válida, intenta nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                op.nextLine();
                opcion = -1;
            }

        } while (opcion != 0);
    }
}
