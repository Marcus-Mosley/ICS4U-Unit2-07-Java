/**
* This class creates a vehicle.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-02
*/
public class Vehicle {
  private String colour;
  private int maxSpeed;
  private int speed; // KPH
  
  // Constructors
  
  /**
  * The Vehicle method constructs a vehicle.
  */
  public Vehicle(String startColour, int startMaxSpeed) {
    colour = startColour;
    maxSpeed = startMaxSpeed;
    speed = 0;
  }
  
  // Getters
  
  public String getColour() {
    return this.colour;
  }
  
  public int getMaxSpeed() {
    return this.maxSpeed;
  }
  
  public int getSpeed() {
    return this.speed;
  }
  
  // Setters
  
  public void setColour(String newColour) {
    this.colour = newColour;
  }
  
  // Methods
  
  public void accelerate(int increment) {
    this.speed += increment;
  }
  
  public void applyBrake(int decrement) {
    this.speed -= decrement;
  }
  
  /**
  * The printVehicleInfo method outputs the vehicle info.
  */
  public final void printVehicleInfo() {
    System.out.print("\nColour: " + colour);
    System.out.print("\nMax. Speed: " + maxSpeed);
    System.out.print("\nCurrent Speed: " + speed);
  }
}