package mascotaVirtual;

import java.util.Scanner;

public class Menu  {
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        Robot robot = new Robot("Luca",20);
        int opcion;

        do{
            System.out.println(robot.getEnergia());
            System.out.println("Elija una opción: ");
            System.out.println("1: Comer \n2: Jugar \n3: Revivir \n4: Salir");
            opcion = leer.nextInt();

            switch (opcion){
                case 1: robot.setComer();
                    break;
                case 2: robot.setJugar();
                    break;
                case 3: robot.setRevivir();
                    break;
                case 4:
                    System.out.println("Juego Finalizado");
                    System.exit(0);
                    break;
            }

        }while(opcion != 4);

    }

}
