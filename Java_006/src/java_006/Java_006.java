/*
Crear una matriz cargar sus elementos e imprimirlos 
 */
package java_006;
import java.util.Scanner;

public class Java_006 {
private Scanner sc;
private int [][] sueldos;



public void cargar()
{
 Scanner sc = new Scanner(System.in);
 sueldos = new int [3][3];
 
    for (int f = 0; f < 3; f++) {
        for (int c = 0; c < 3; c++) {
            System.out.println("Ingrese el componente de la fila y de la comlumna a cargar: ");
            sueldos[f][c]=sc.nextInt();
        }
    } 
}
public void imprimir()
    {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(sueldos[f][c]+"");
            }
            System.out.println("");
        }
 
    }




    public static void main(String[] args) 
    {
            Java_006  jv006 = new Java_006();
            jv006.cargar();
            jv006.imprimir();
    }
    
}
