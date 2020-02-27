package B1.Lop_va_huong_doi_tuong_trong_java.BaiTap;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return  this.getB()*this.getB()-4*this.getA()*this.getC();
    }

    public double getRoot1(){
        double root1=0.0;
        if(this.getDiscriminant()>= 0) {
            root1 = (-this.getB() + Math.sqrt(this.getDiscriminant()) / (2 * this.getA()));
        }
        return root1;
    }public double getRoot2(){
        double root2=0.0;
        if(this.getDiscriminant()>= 0) {
            root2 = (-this.getB() - Math.sqrt(this.getDiscriminant()) / (2 * this.getA()));
        }
        return root2;
    }




}

