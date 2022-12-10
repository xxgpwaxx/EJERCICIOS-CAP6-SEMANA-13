/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENACIÓN_POR_INTERCAMBIO;
import java.util.Scanner;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class ORDENACIÓN_POR_INTERCAMBIO {
    public static void main(String[] args) {
        int a[] = new int[IngresoCantidad()];
        ingresoDatos(a);
        MostrarArrayInicial(a);
        ordIntercambio(a);
        MostrarArrayFinal(a);
    }
    
    public static int IngresoCantidad(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la CANTIDAD : ");
        int cantidad = sc.nextInt();
        return cantidad;
    }
    
    public static void ingresoDatos(int a[]){
        for(int i=0; i < a.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el dato "+(i+1)+" : ");
            a[i]=sc.nextInt();
        }
    }
    
    public static void MostrarArrayInicial(int a[]){
        System.out.println("Array INICIAL");
        for(int i=0; i < a.length; i++){
            System.out.println("dato ["+i+"] es : "+a[i]);
        }
    }
    
    public static void MostrarArrayFinal(int a[]){
        System.out.println("Array FINAL");
        for(int i=0; i < a.length; i++){
            System.out.println("dato ["+i+"] es : "+a[i]);
        }
    }
    
    public static void ordIntercambio (int a[]){
	int i, j;
	for (i = 0 ; i < a.length-1; i++){
            // sitúa mínimo de a[i+1]...a[n-1] en a[i]
            for (j = i+1 ; j < a.length; j++){
	 	if (a[i] > a[j]){
                    intercambiar(a, i, j);
	 	}
            }
        }
    }
    
    public static void intercambiar(int []a, int i, int j){
	int aux = a[i];
	a[i] = a[j];
	a[j]= aux ;
    }
}
