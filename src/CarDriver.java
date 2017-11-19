/**
 * class that displays 3 car specs then changes them to be the same
 * @author Patrick H.
 * @since 2017-11-19
 * @version 1.0
 */
public class CarDriver {
    public static void main(String[] args){
        Car myCar = new Car();
        Car hisCar = new Car("Black",400,3.5,"Honda");
        Car herCar = new Car("Pink",300,2.5,"Volks");
        System.out.println("My Car: "+myCar);
        System.out.println("His Car: "+hisCar);
        System.out.println("Her Car: "+herCar);

        changeCar(myCar);
        changeCar(hisCar);
        changeCar(herCar);

        System.out.println("\nAfter the change:");
        System.out.println("My Car: Color: "+myCar.getColor() + ", Horsepower: " + myCar.getPower() + ", Engine Size: " +  myCar.getEngineSize() + ", Make: " + myCar.getMake());
        System.out.println("His Car: Color: "+hisCar.getColor() + ", Horsepower: " + hisCar.getPower() + ", Engine Size: " +  hisCar.getEngineSize() + ", Make: " + hisCar.getMake());
        System.out.println("Her Car: Color: "+herCar.getColor() + ", Horsepower: " + herCar.getPower() + ", Engine Size: " +  herCar.getEngineSize() + ", Make: " + herCar.getMake());
    }
    public static void changeCar(Car Car){
        Car.setColor("Blue");
        Car.setPower(650);
        Car.setEngineSize(6.5);
        Car.setMake("Ferrari");
        return;
    }
}
