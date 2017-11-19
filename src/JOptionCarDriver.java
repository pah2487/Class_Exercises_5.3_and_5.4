import javax.swing.*;
import java.util.Scanner;
/**
 * class that prompts for user 3 sets of car specs and checks if any are the same in JOptionPane
 * @author Patrick H.
 * @since 2017-11-19
 * @version 1.0
 */
public class JOptionCarDriver {
    public static void main(String[] args) {
        String inputCar1 = JOptionPane.showInputDialog(null, "Enter your car specs separated by commas: (Color,Horsepower,Engine Size,Make)");
        Scanner sc1 = new Scanner(inputCar1).useDelimiter(",");
        Car mycar = new Car(sc1.next(), sc1.nextInt(), sc1.nextDouble(), sc1.next());
        JOptionPane.showMessageDialog(null, "Your car was made with " + mycar);

        String inputCar2 = JOptionPane.showInputDialog(null, "Enter his car specs separated by commas: (Color, Horsepower, Engine Size, Make)");
        Scanner sc2 = new Scanner(inputCar2).useDelimiter(",");
        Car hiscar = new Car(sc2.next(), sc2.nextInt(), sc2.nextDouble(), sc2.next());
        JOptionPane.showMessageDialog(null, "His car was made with " + hiscar);

        String inputCar3 = JOptionPane.showInputDialog(null, "Enter her car specs separated by commas: (Color, Horsepower, Engine Size, Make)");
        Scanner sc3 = new Scanner(inputCar3).useDelimiter(",");
        Car hercar = new Car(sc3.next(), sc3.nextInt(), sc3.nextDouble(), sc3.next());
        JOptionPane.showMessageDialog(null, "Her car was made with " + mycar);
        if (mycar.equals(hiscar)) {
            if (mycar.equals(hercar)) {
                JOptionPane.showMessageDialog(null, "All the cars are the same!");
            }else{
                JOptionPane.showMessageDialog(null, "Your car and His car are the same!");
            }
        }else if(hiscar.equals(hercar)){
            JOptionPane.showMessageDialog(null, "His car and Her car are the same!");
        }else{
            JOptionPane.showMessageDialog(null, "All the cars are different!");
        }
    }
}
