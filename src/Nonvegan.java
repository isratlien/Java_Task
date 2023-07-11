public class Nonvegan extends Person{
    public void nonveg(){
        System.out.println("he likes chicken");
    }

    @Override
    public void eat() {
        System.out.println("but also eat more");
    }
}
