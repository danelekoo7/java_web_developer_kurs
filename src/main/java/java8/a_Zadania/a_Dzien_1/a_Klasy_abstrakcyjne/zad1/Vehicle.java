package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad1;


public abstract class Vehicle{

    private Integer maxSpeed;
    protected String model;

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public Vehicle() {
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getCanonicalName() + ", model: " + this.model + ", speed: " + this.maxSpeed;
    }

}