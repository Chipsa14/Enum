package homework;

public class classwork {
    static double calculatorPerimeter(double radius) {
        double perimetr = Math.PI * 2 * radius;
        return perimetr;
    }

    public static void main(String[] args) {
        double radius = 14;
        double perimetr1 = calculatorPerimeter(radius);
        double a =3;
        double b =4;
        double c = 5.5;
        double perimetr2 = calculatorPerimeter(a,b,c);
        System.out.println(perimetr2);

        System.out.println(perimetr1);
        System.out.println(calculatorPerimeter(2,2));
    }

static double calculatorPerimeter (double a ,double b,double c){
        double perimetr = a +b + c;
        return  perimetr;
}
static double calculatorPerimeter(double a,double c){
        double rek = (a + c)*2;
        return rek;
    }

public static void alex(){
    System.out.println(123);
}
}
