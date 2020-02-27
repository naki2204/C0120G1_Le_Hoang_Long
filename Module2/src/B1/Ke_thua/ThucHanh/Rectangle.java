package B1.Ke_thua.ThucHanh;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(){
    }

    public Rectangle(double height,double width) {
        this.height = height;
        this.width =width;
    }

    public Rectangle(double height,double width,String color ,boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return (this.width*this.height);
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "A Rectangle with" +
                " width="+getWidth()+" and" +
                " length="+getHeight()+
                " which is a subclass of "
                +super.toString();
    }
}

