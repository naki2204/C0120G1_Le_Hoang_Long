package B1.Lop_va_huong_doi_tuong_trong_java.ThucHanh;


public class Rectangle {

        double width;
        double height;
        public Rectangle(){

        }
        public Rectangle(double width,double height){
            this.width=width;
            this.height = height;
        }
        public double getArea(){
            return (this.width*this.height);
        }
        public double getPerimeter(){
            return 2*(this.height+this.width);
        }
        public String display(){
            return "Rectangle {"+"width: "+width+"; height: "+height+"}";
        }





}
