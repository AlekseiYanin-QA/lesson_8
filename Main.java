public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());


        circle.setRadius(10);
        System.out.println("Новый радиус: " + circle.getRadius());
        System.out.println("Новая Площадь: " + circle.getArea());

        TestCircle test = new TestCircle();
        test.test();

    }
}



