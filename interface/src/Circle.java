public class Circle implements GeometricForm {

    private Double area;
    private Double radius;
    private Double circumferenceLength;

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getCircumferenceLength() {
        return circumferenceLength;
    }

    public void setCircumferenceLength(Double circumferenceLength) {
        this.circumferenceLength = circumferenceLength;
    }

    public Double calculatorArea() {
        setArea(Math.PI * (getRadius() * getRadius()));
        return getArea();
    }

    public Double calculatorPerimeter() {
        setCircumferenceLength(2 * Math.PI * getRadius());
        return getCircumferenceLength();
    }
}
