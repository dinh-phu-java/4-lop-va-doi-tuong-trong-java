import java.util.Scanner;

class Quadractic {
    private double a,b,c;
    public Quadractic(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        double delta= 2*this.b-4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double r1 =(-this.b +Math.sqrt(this.getDiscriminant()))/2*this.a;
        return r1;
    }
    public double getRoot2(){
        double r2=(-this.b -Math.sqrt(this.getDiscriminant()))/2*this.a;
        return r2;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Nhập a,b và c: ");
        double a= in.nextDouble();
        double b= in.nextDouble();
        double c= in.nextDouble();

        Quadractic myQuad= new Quadractic(a,b,c);

        if(myQuad.getDiscriminant() > 0){
            System.out.println("Nghiệm 1 là "+myQuad.getRoot1());
            System.out.println("Nghiệm 2 là "+myQuad.getRoot2());
        }else if(myQuad.getDiscriminant() == 0){
            System.out.println("Có 1 nghiệm duy nhất "+ myQuad.getRoot1());
        }else{
            System.out.println("The equation has no root");
        }
    }
}
