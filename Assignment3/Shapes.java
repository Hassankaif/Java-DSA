import java.util.Scanner;

import static java.lang.Math.PI;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("""
                1. Area Of Circle Java Program
                2. Area Of Triangle
                3. Area Of Rectangle Program
                4. Area Of Isosceles Triangle
                5. Area Of Parallelogram
                6. Area Of Rhombus
                7. Area Of Equilateral Triangle
                8. Perimeter Of Circle
                9. Perimeter Of Equilateral Triangle
                10. Perimeter Of Parallelogram
                11. Perimeter Of Rectangle
                12. Perimeter Of Square
                13. Perimeter Of Rhombus
                14. Volume Of Cone Java Program
                15. Volume Of Prism
                16. Volume Of Cylinder
                17. Volume Of Sphere
                18. Volume Of Pyramid
                19. Curved Surface Area Of Cylinder
                20. Total Surface Area Of Cube 
                Enter Your Choice: """);
        int ch=sc.nextInt();
        switch (ch){
            case 1: {
                System.out.println("ENTER RADIUS: ");
                float r = sc.nextFloat();
                double area = 3.14 * r * r;
                System.out.println("AREA OF CIRCLE IS: " + area);
                break;
            }
            case 2,6: {
                System.out.println("ENTER BASE: ");
                float b = sc.nextFloat();
                System.out.println("ENTER HEIGHT: ");
                float h = sc.nextFloat();
                float area = (b*h)/2;
                System.out.println("AREA OF Triangle IS: " + area);
                break;
            }
            case 3,5: {
                System.out.println("ENTER BREATH: ");
                float b = sc.nextFloat();
                System.out.println("ENTER LENGHT: ");
                float l = sc.nextFloat();
                float area = l*b;
                System.out.println("AREA OF Rectangle IS: " + area);
                break;
            }
            case 4: {
                System.out.println("ENTER side: ");
                float a = sc.nextFloat();
                System.out.println("ENTER base: ");
                float b = sc.nextFloat();
                double area = (b / 4) * (Math.sqrt(4*(a*a) - b*b));
                System.out.println("AREA OF Isosceles Triangle IS: " + area);
                break;
            }
            case 7: {
                System.out.println("ENTER side: ");
                float a = sc.nextFloat();
                double area = (Math.sqrt(3) / 4) * a * a;
                System.out.println("AREA OF Equalateral Triangle IS: " + area);
                break;
            }
        //perimeter
            case 8: {
                System.out.println("ENTER radius: ");
                float a = sc.nextFloat();
                double area = 2 * PI * a;
                System.out.println("PERIMETER OF CIRCLE IS: " + area);
                break;
            }
            case 9 : {
                System.out.println("ENTER side: ");
                float a = sc.nextFloat();
                double area = 3 * a;
                System.out.println("Perimeter of Equilateral Triangle: " + area);
                break;
            }
            case 10,11: {
                System.out.println("ENTER length: ");
                float l = sc.nextFloat();
                System.out.println("ENTER breath: ");
                float b = sc.nextFloat();
                double area = 2*(l+b);
                System.out.println("Perimeter of Parallelogram/Rectangle IS: " + area);
                break;
            }
            case 12,13: {
                System.out.println("ENTER lenght: ");
                float a = sc.nextFloat();
                double area = 4 * a;
                System.out.println("PERIMETER OF SQUARE/RHOMBUS IS: " + area);
                break;
            }
            //volume
            case 14: {
                System.out.println("ENTER radius: ");
                float r = sc.nextFloat();
                System.out.println("ENTER height: ");
                float h = sc.nextFloat();
                double area = (PI*r*r*h)/3;
                System.out.println("Volume of Cone IS: " + area);
                break;
            }
            case 15: {
                System.out.println("ENTER height: ");
                float h = sc.nextFloat();
                System.out.println("ENTER base: ");
                float b = sc.nextFloat();
                double area = b*h;
                System.out.println("Volume of Prism IS: " + area);
                break;
            }
            case 16: {
                System.out.println("ENTER radius: ");
                float r = sc.nextFloat();
                System.out.println("ENTER height: ");
                float h = sc.nextFloat();
                double area = (PI*r*r*h);
                System.out.println("Volume of Cylinder IS: " + area);
                break;
            }

            case 17: {
                System.out.println("ENTER radius: ");
                float r = sc.nextFloat();
                double area = (4.0*PI*r*r*r)/3;
                System.out.println("Volume of Sphere IS: " + area);
                break;
            }
            case 18: {
                System.out.println("ENTER height: ");
                float h = sc.nextFloat();
                System.out.println("ENTER base: ");
                float b = sc.nextFloat();
                double area = (1.0/3)*b*h;
                System.out.println("Volume of Pyramid IS: " + area);
                break;
            }
            case 19: {
                System.out.println("ENTER radius: ");
                float r = sc.nextFloat();
                System.out.println("ENTER height: ");
                float h = sc.nextFloat();
                double area = (2*PI*r*h);
                System.out.println("Curved Surface of Cylinder IS: " + area);
                break;
            }
            case 20: {
                System.out.println("ENTER Side: ");
                float a = sc.nextFloat();
                double area = 6 * a;
                System.out.println("Total Surface Area of Square IS: " + area);
                break;
            }



        }
    }
}

