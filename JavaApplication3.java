package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
public static void main(String[] args) {        
Scanner entrada=new Scanner (System.in);

System.out.println("Ingrese la letra: ");
int letra=entrada.next().codePointAt(0);
System.out.println("Es codigo Ascci: "+letra);
switch (letra){
    case'a';case'e';case'i';case'o';case'u';
    {
        System.out.println("Minuscula");
    }    
    break;
    case'A';case'E';case'I';case'O';case'U';
    {
        System.out.println("Mayuscula");
    }
    break;
    case 49; case 50; case 51; case 52;case 53;
    {
       System.out.println("Es un numero:");
    }
    break;
    default:
    System.out.println("Es una consonante");
    break;
}       
    }
    
}
