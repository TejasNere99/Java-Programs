
class Rectangle{
    int l,b;
    public Rectangle(int l,int b) {
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println("Area of rectangle : "+l*b);
    }
}


// constructor
public class ParameterisedConstructor{
    public static void main(String args[]) {
        Rectangle r = new Rectangle(1, 2);
        r.area();
    }
}

