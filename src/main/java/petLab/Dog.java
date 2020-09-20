package petLab;

public class Dog extends Pet implements IGreet{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Bark Bark";
    }

}
