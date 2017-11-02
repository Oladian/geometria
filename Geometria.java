public class Geometria {

	public static final double PI=3.1416;

	public static double areaCuadrado(double lado) {
		return lado*lado;
	}

	public static double areaRectangulo(double base, double altura) {
		return base*altura;
	}

	public static double areaTriangulo(double base, double altura) {
		return base*altura/2;
	}

	public static double areaCirculo(double radio){
		return radio*radio*PI;
	}

}