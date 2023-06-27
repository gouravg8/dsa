/**
 * Oops_inheritance
 */
public class Oops_inheritance {

    public static void main(String[] args) {
        Shape cube = new Shape(5.0);
        double cubeHai = cube.l * cube.w * cube.h;
        System.out.println("Volume of cube is " + cubeHai);

        Weight wOfcube = new Weight(4.0, 3.5, 2.5, 5.0);
        System.out.printf("l %f, w %f, h %f, weight %f", wOfcube.l, wOfcube.w, wOfcube.h, wOfcube.weight);

        System.out.println();
        Weight w = new Weight(wOfcube);
        System.out.println(w.h);
    }
}

/**
 * Weight
 */
class Weight extends Shape {
    double weight;

    Weight(double weight) {
        super(); // this is calling the constructor of theire parent class of having "zero"
                 // arguments
        this.weight = weight;
    }

    Weight(double l, double w, double h, double weight) {
        super(l, w, h); // this is calling the constructor of theire parent class of having three
                        // arguments l, w, h
        this.weight = weight;
    }

    Weight(Weight w){
        weight = w.weight;
    }
}

/**
 * Shape
 */
class Shape {
    double l, w, h;

    Shape() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Shape(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Shape(double l, double w) {
        this.l = l;
        this.w = w;
    }

    Shape(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

}