public class TestGeometria {
	public static void main(String[] args) {

		double areaCuadrado = Geometria.areaCuadrado(2);
		System.out.println("Area del cuadrado 2 vale "+ areaCuadrado);

		double areaRectangulo = Geometria.areaRectangulo(2.123,1.233);
		System.out.println("Area del rectángulo 2.123, 1.233 vale "+ areaRectangulo);


		double areaTriangulo = Geometria.areaTriangulo(2.123,1.233);
		System.out.println("Area del triángulo 2.123,1.233 vale " + areaTriangulo);

		double areaCirculo = Geometria.areaCirculo(1.233);
		System.out.println("Area del círculo 1.233 vale " + areaCirculo);

	}
}