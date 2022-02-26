package sluk3r.autofactory;


@AutoElement(tag = "cat")
public class Cat implements  Animal{
    @Override
    public void bark() {
        System.out.println("meow");
    }
}
