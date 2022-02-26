package sluk3r.autofactory;

@AutoElement(tag = "dog")
public class Dog implements  Animal{
    @Override
    public void bark() {
        System.out.println("woof");
    }
}
