import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Visitante> visitantes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

        Visitante visitante = new Visitante();

        System.out.print("Ingrese nombre del visitante: ");
        visitante.setNombre(scanner.nextLine());

        System.out.print("Ingrese cedula del visitante: ");
        visitante.setCedula(scanner.nextLine());
 
        System.out.print("Ingrese edad del visitante: ");
        visitante.setEdad(scanner.nextInt());

        System.out.println();
        
        scanner.nextLine();

        visitantes.add(visitante);

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Visitante N." + (i+1));
            System.out.println("Nombre: " + visitantes.get(i).getNombre());
            System.out.println("Cedula: " + visitantes.get(i).getCedula());
            System.out.println("Edad: " + visitantes.get(i).getEdad());
            System.out.println("------------------------");
        }
    }
}