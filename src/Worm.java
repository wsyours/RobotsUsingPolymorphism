/**
 * Created by Администратор on 21.03.2017.
 */
public class Worm extends Robot implements Transformable{

    @Override
    public void act(){
        System.out.println("Worm robot crawls");
    }
    @Override
    public void transform(){
        System.out.println("Transformed to mole.");
    }
}
