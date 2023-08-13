package Ejercicio-1;

import java.util.Scanner;

public class ErasTour {
    public static void main(String[] args) {
        boolean menu = true;
        Scanner s = new Scanner(System.in);
        int option;
        buyer by = new buyer();
        locality l1 = new locality(100);
        locality l2 = new locality(500);
        locality l3 = new locality(1000);
        do {
            System.out.println("Bienvenido. Seleccione una opción: 1) Nuevo comprador 2) Nueva solicitud 3) Consultar disponibilidad 4) Disponibilidad local 5) Reporte de caja 6) Salir");
            option = s.nextInt(); s.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    //String name = s.nextLine();
                    by.setName(s.nextLine());
                    System.out.println("Ingrese su email: ");
                    String email = s.nextLine();
                    by.setEmail(email);
                    by.setBalance(0);
                    by.setAmount(0);
                    System.out.println(email);
                    by.setActive(true);
                    break;
                case 2:
                    if (by.isActive()){
                        System.out.println("Ingrese la cantidad de boletos a comprar: ");
                        int amount = s.nextInt();
                        by.setAmount(amount);
                        System.out.println("Ingrese su presupuesto: ");
                        int balance = s.nextInt();
                        by.setBalance(balance);
                        by.attempt(l1, l2, l3);
                        //System.out.println("" + l1.getSeats() + l1.getBought() + l2.getSeats() + l2.getBought() + l3.getSeats() + l3.getBought());

                    }
                    else {
                        System.out.println("Ingrese sus datos de comprador primero");
                    }
                    break;
                case 6:
                    menu = false;
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
                    break;
            }
        } while (menu);
        s.close();
    }
}
