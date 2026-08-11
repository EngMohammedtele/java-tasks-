public class Car implements Rentable {
    private final String plateNumber; // no setter - a plate identifies one physical car and must never change
    private double dailyRate;
    private int rentalDays;
    private int seats;

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

