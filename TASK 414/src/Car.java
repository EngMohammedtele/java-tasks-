public class Car implements Rentable {
    private final String plateNumber; // no setter - a plate identifies one physical car and must never change
    private double dailyRate;
    private int rentalDays;
    private int seats;

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String getPlateNumber() {
        return plateNumber;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        if (dailyRate > 0 && dailyRate <= 200) {
            this.dailyRate = dailyRate;
        } else {
            IO.println("Daily rate out of range");
        }
    }

    @Override
    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        if (rentalDays >= 1 && rentalDays <= 30) {
            this.rentalDays = rentalDays;
        } else {
            IO.println("Rental days must be from 1 to 30");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 2 && seats <= 7) {
            this.seats = seats;
        } else {
