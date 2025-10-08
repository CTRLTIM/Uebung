import java.util.Scanner;


public class Greetings {
    
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Wie heißen sie?: ");
String name = scanner.nextLine();


System.out.println("Hallo "+name+"!");

}

}
