public class Rectangle implements GeometricForm {

    private Double area;
    private Double height;
    private Double base;
    private Double perimeter;

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double calculatorArea() {
        setArea(getHeight() * getBase());

        return getArea();
    }

    public Double calculatorPerimeter() {
        setPerimeter(2 * (getBase() + getHeight()));

        return getPerimeter();
    }

}
