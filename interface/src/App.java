public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setRadius(4.0);

        System.out.println("==== CIRCLE ====");
        System.out.println(circle.calculatorArea());
        System.out.println(circle.calculatorPerimeter());

        Rectangle rectangle = new Rectangle();

        rectangle.setBase(10.0);
        rectangle.setHeight(10.0);

        System.out.println("==== RECTAGULE ====");
        System.out.println(rectangle.calculatorArea());
        System.out.println(rectangle.calculatorPerimeter());

    }
}
