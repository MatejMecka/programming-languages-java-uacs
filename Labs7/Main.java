// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
interface Two_D_Shape {
     double pi = 3.14;
     abstract void parameters();
     abstract float area();
     abstract float perimeter();
}

interface Three_D_shape {
    abstract float volume();
}

class Triangle implements Two_D_Shape {
    int sideA, sideB, sideC, height;
    Triangle(int sideA_inp, int sideB_inp, int sideC_inp, int height_inp) {
       sideA = sideA_inp;
       sideB = sideB_inp;
       sideC = sideC_inp;
       height = height_inp;

       System.out.println("A new triangle has been created.");
    }

    public boolean rectangular() {
        if ((sideA*sideA) + (sideB*sideB) == (sideC*sideC)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void parameters() {
        System.out.println("Side A: "+ sideA + "\tSide B: " + sideB + "\tSide C: " + sideC);
    }
    public float area() {
        return (sideA * height) / 2;
    }

    public float perimeter() {
        return sideA + sideB + sideC;
    }


}

class Sphere implements Three_D_shape, Two_D_Shape {
    int radius;
    Sphere (int radius_inp) {
        radius = radius_inp;
        System.out.println ("A new sphere has been created.");
    }

    public float volume(){
        return (float)pi * (radius * radius *radius) * ((float) 4/3);
    }

    public void parameters(){
        System.out.println("Radius: "+ radius);
    }
    public float perimeter(){
        return 0;
    }

    public float area (){
        return (float)pi * 4 * (radius*radius);
    }

}

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Triangle T1 = new Triangle(3,5,6,3);
        System.out.println("Triangle 1");
        System.out.println("======");
        T1.parameters();
        System.out.println("Area:" + T1.area());
        System.out.println("Perimeter: " + T1.perimeter());
        System.out.println("Rectangular: " + T1.rectangular());
        System.out.println("======");

        Sphere B1 = new Sphere(4);
        System.out.println("Sphere 1");
        System.out.println("======");
        B1.parameters();
        System.out.println("Area:" + B1.area());
        System.out.println("Perimeter: " + B1.perimeter());
        System.out.println("Volume: " + B1.volume());
        System.out.println("======");


        Two_D_Shape T2 = new Triangle(8,2,10,16);
        System.out.println("Triangle 2");
        System.out.println("======");
        T2.parameters();
        System.out.println("Area:" + T2.area());
        System.out.println("Perimeter: " + T2.perimeter());
        System.out.println("Rectangular: " + ((Triangle)T2).rectangular());
        System.out.println("======");


        Two_D_Shape B2 = new Sphere(3);
        System.out.println("Sphere 2");
        System.out.println("======");
        B1.parameters();
        System.out.println("Area:" + B2.area());
        System.out.println("Perimeter: " + B2.perimeter());
        System.out.println("Volume: " + ((Sphere)B2).volume());
        System.out.println("======");


        Three_D_shape B3 = new Sphere(7);
        System.out.println("Sphere 3");
        System.out.println("======");
        B1.parameters();
        System.out.println("Area:" + ((Sphere)B3).area());
        System.out.println("Perimeter: " + ((Sphere)B3).perimeter());
        System.out.println("Volume: " + B3.volume());
        System.out.println("======");


    }
}
