/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * @author rbr - 081024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 081024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int a = 24, b = 6, c = 11, resultado;
		
		//Calculo el resultado
		resultado = (a + b) * c / (b - a);
		
		//Muestro por consola el resultado
		System.out.println("El resultado es: " + resultado);
		
		//Explico cómo ha afectado al cálculo la prioridad de los operadores
		System.out.println("En primer lugar, se ejecutan primero los operadores que están entre paréntesis ya que"
				+ " el paréntesis indica que se realice primero esas operaciones que contienen en su interior."
				+ " Finalmente se ejecutan la multiplicación y la división.");

	}

}
