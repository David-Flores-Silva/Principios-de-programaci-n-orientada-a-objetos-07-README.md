
import java.util.*;
public class ShoppingCard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Inicalizamos las variables
		int costo, cantidad, total=0;
		String producto,pregunta ; 
		//Creamos la primera pregunta para darle forma al software		
		System.out.print("Desea usted comprar en la tienda de Don Pepe (y/n): ");
		pregunta=scan.next();
		//Creamos el bucle para si la respuesta es "y"
		while(pregunta.equalsIgnoreCase("y")) {
			
			System.out.println("Ingrese el nombre del item : ");
			producto = scan.next();
			System.out.print("Ingrese el costo del producto : ");
			costo= scan.nextInt();
			System.out.println("Ingrese cuantos que llevara :");
			cantidad=scan.nextInt();
			
			System.out.print("Desea usted seguir compranto en la tienda de Don Pepe (y/n): ");
			pregunta=scan.next();
			//Aqui actualizamos el costo de las compras
			total=total+(costo*cantidad);
			
		}
		
		System.out.println("Su total es : "+ total);
		
	}

}
