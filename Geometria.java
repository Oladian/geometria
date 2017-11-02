/** Clase Geometría 
	la vamos a usar para realizar
	diversos cálculos.
	@author Izan
	@version 1.0
*/

public class Geometria {

	public static final double PI=3.1416;

	/** Método areaCuadrado que nos calcula el área de un cuadrado dado el lado
		@param lado del tipo double que el lado define al cuadrado
		@return área del cuadrado, de tipo double
	*/

	public static double areaCuadrado(double lado) {
		return lado*lado;
	}

	/** Método areaRectangulo que nos calcula el área de un rectángulo dada la base y la alturaa
		@param base del tipo double
		@param altura del tipo double
		@return área del rectángulo, de tipo double
	*/

	public static double areaRectangulo(double base, double altura) {
		return base*altura;
	}

	/** Método areaTriangulo que nos calcula el área de un triángulo dada la base por la altura entre dos
		@param base del tipo double
		@param altura del tipo double
		@return área del triángulo, de tipo double
	*/

	public static double areaTriangulo(double base, double altura) {
		return base*altura/2;
	}

	/** Método areaCirculo que nos calcula el área de círculo dado el radio
		@param radio del tipo double
		@return área del círculo, de tipo double
	*/

	public static double areaCirculo(double radio){
		return radio*radio*PI;
	}

}