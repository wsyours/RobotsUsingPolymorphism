/**
 * Created by Администратор on 21.03.2017.
 */
public class Robot implements Transformable{

    Robot(){}

    void act()
    {
       System.out.println("Robot: I don`t know what kind of robot I am. What do you want from me?");
    }
   public void transform(){



    }
    public static void main(String[]args){
      Robot anybot = new Robot();
      Robot wbot = new Worm();
      Robot abot = new Android();
      Robot qbot = new Quadrocopter();

     anybot.act();
       wbot.act();
       abot.act();
       qbot.act();
    }
}
