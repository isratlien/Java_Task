public class Home1 {
    public static void main(String [] args){
        Vegan ve=new Vegan();
        ve.eat();
        ve.vegi();
        ve.speak();
        Nonvegan nonve = new Nonvegan();
        nonve.eat();
        nonve.nonveg();
    }
}
