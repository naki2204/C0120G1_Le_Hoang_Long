package B1.Ke_thua.ThucHanh;

public class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color="green";
        this.filled=true;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }

    @Override
    public String toString() {
        return "Shape with color of "
                +getColor()+
                " and"
                +(getFilled()? " filled":" not filled");

    }
}
