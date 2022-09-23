package ru.mirea.task7.Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // Следующие 5 методов будут вызывать методы, переопределенные в классе Circle
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // у класса Shape нет такого метода

        Circle c1 = (Circle)s1; // Следующие 6 методов будут вызывать методы, переопределенные в классе Circle
        System.out.println(c1); // Отличие от предыдущего кода в том, что сейчас у нас изменился тип переменной,
        System.out.println(c1.getArea()); // теперь мы точно знаем что это круг
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); Нельзя создать экземпляр абстрактного класса

        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);
        System.out.println(s3); // // Следующие 4 методов будут вызывать методы, переопределенные в классе Rectangle
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
       // System.out.println(s3.getLength()); Тип переменной - Shape, у этого класса нет такого метода

        Rectangle r1 = (Rectangle)s3; // Теперь изменился тип переменной, поэтому можем вызвать getLength
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Аналогично, у shape нет getSide
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4; // Это все тот же квадрат, будут вызываться его методы. Но тип переменной
        System.out.println(r2); // Rectangle, у которого нет метода getSide
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());


        Square sq1 = (Square)r2; // Теперь тип переменной Square, можем вызывать все методы класса Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
