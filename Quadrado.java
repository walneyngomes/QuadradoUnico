package Quadrado;

public class Quadrado {

	private static Quadrado intance = null;
	private static final int MULT = 2;
	private double width;
	private double height;

	private Quadrado(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public static Quadrado instance(double width, double height) {
		if (intance == null) {
			intance = new Quadrado(width, height);

		}
		return intance;

	}

	public double areaQuadrado() {
		return (this.getHeight() * this.getWidth());
	}

	public double perimetro() {

		return (this.getHeight() + this.getWidth()) * MULT;
	}

	public double diagonal() {
		return Math.sqrt(this.getHeight() * this.getWidth() + this.getHeight() * this.getWidth());
	}

	public String toString() {
		return "Perimetro" + this.perimetro() + "Diagonal" + this.diagonal() + "AreaTotal" + this.areaQuadrado();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static int getMult() {
		return MULT;
	}

}
