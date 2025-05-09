import java.util.Scanner;

public class Suma{
    public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);
    System.out.println("Escribe el primer numero");
    int numero = scanner.nextInt();
    
    System.out.println("Escribe el segundo numero");
    int numero2 =scanner.nextInt();

     System.out.println("Escribe el tercer numero");
    int numero3 =scanner.nextInt();
    
     System.out.println("Escribe el cuarto numero");
    int numero4 =scanner.nextInt();

    int resultado = numero + numero2 + numero3 + numero4;

    System.out.println("El resultado es: " + resultado);

    }
}