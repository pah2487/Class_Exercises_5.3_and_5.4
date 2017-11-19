/**
 * class that creates objects composed of color horsepower, engine size, and make. Also keeps track of how many  of this object were made.
 * @author Patrick H.
 * @since 2017-11-19
 * @version 1.0
 */
public class Car {
    private String color;
    private int horsepower;
    private double enginesize;
    private String make;
    private static int count = 0;

    /**
     * constructs new Car with given parameters
     * @param color color of the car
     * @param horsepower horsepower of the car's engine
     * @param enginesize size of the car's engine
     * @param make producer of the car
     */
    public Car(String color, int horsepower, double enginesize, String make){
        this.color = color;
        this.horsepower = horsepower;
        this.enginesize = enginesize;
        this.make = make;
        count++;
    }
    public Car(){
        this.color = "black";
        this.horsepower = 500;
        this.enginesize = 5.7;
        this.make = "BMW";
        count++;
    }
    /**
     * Returns car's color
     * @return Car's color
     */
    public String getColor(){
        return color;
    }
    /**
     * Returns car's horsepower
     * @return Car's horsepower
     */
    public int getPower() {
        return horsepower;
    }
    /**
     * Returns Car's engine size
     * @return Size of the car's engine
     */
    public double getEngineSize(){
        return enginesize;
    }
    /**
     * Returns car's producer
     * @return Car's make
     */
    public String getMake(){
        return make;
    }
    /**
     * Sets a car's color
     * @param color Car's color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Sets car's horsepower
     * @param horsepower Car's horsepower
     */
    public void setPower(int horsepower){
        this.horsepower = horsepower;
    }
    /**
     * Sets car's engine size
     * @param enginesize Car's engine size
     */
    public void setEngineSize(double enginesize) {
        this.enginesize = enginesize;
    }
    /**
     * Sets car's producer
     * @param make Car's producer
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     *returns a car's values as a string
     */
    @Override
    public String toString(){
        return "Color: "+this.color+", Horsepower: "+this.horsepower+", Engine Size: "+this.enginesize+", Make: "+this.make;
    }

    /**
     * retruns how many car objects have been created
     * @return number of car objects made
     */
    public static int getCount(){
        return count;
    }

    @Override
    public boolean equals(Object car){
        if(car.toString().equalsIgnoreCase(this.toString())){
            return true;
        }
        else{
            return false;
        }

    }
}
