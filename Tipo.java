import java.util.Scanner;

public class Tipo{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa la inicial de tu nonmbre");
        char inicial = scanner.next().charAt(0);

         System.out.println("Ingresa tu estatura en metros");
         int edad = scanner.nextInt();
        
         System.out.println("¿Eres estudiante? (true/false)");
         boolean esEstudiante = scanner.nextBoolean();

        System.out.println("Tu nombre es"+nombre);
         
        
        
    }
}