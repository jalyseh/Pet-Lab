package petLab;

public interface IGreet {

         default void iGreet(){
        System.out.println("runs to owner");
    }
}
