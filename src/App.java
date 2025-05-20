import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola mundo!");

        try (Scanner scanner = new Scanner(System.in)){
            int n= scanner.nextInt();
            int m= scanner.nextInt();
            if (n%2==0 && m%2==0){
                System.out.println(x: n y m son pares");
        
}
