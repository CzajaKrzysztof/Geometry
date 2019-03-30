package com.codecool.java.geometry.shapes;

public class RegularPentagon extends Shape {
    private float a;

	public RegularPentagon() {}
	
	public RegularPentagon(float a) {
        if (Shape.checkIfArgsGreaterThanZero(a)) {
            this.a = a;
        }
	}
	
	public float getA() {
		return a;
	}

	@Override
	public double calculateArea() {
		return (Math.pow(a,2) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))))/4;
	}

	@Override
	public double calculatePerimeter() {
		return 5 * a;
	}

	@Override
	public String getAreaFormula() {
		return "(a^2 * sqrt(5(5+2sqrt(5))))/4";
	}

	@Override
	public String getPerimeterFormula() {
		return "5xa";
	}

	@Override
    public String toString() {
        return String.format("Regular Pentagon, a = %.1f", a);
    }
}
