public class Container{

    int x;
    double y;
    String str;

    public static void main(String args[]){
        Container container = new Container();
        container.foo();
    }

    public Container()
    {
        this.x =45;
        this.y = 100;
        this.str = "test class";
    }

    public void foo(){
        System.out.println("X: "+this.x);
    }

}