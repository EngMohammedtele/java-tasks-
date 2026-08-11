public class Motorbike implements Rentable {

    private final String plateNumber; // no setter - a plate identifies one physical bike and must never change
    private double dailyRate;
    private int rentalDays;
    private int engineCc;

    public Motorbike(String plateNumber) {
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

    public int getEngineCc() {
        return engineCc;
    }

    public void setEngineCc(int engineCc) {
        if (engineCc >= 50 && engineCc <= 1500) {
            this.engineCc = engineCc;
        } else {
            IO.println("Engine size must be from 50 to 1500 cc");
        }
    }

    @Override
    public double costFor(int days) {
        // no insurance fee for a motorbike - just the daily rate
        return dailyRate * days;
    }

    @Override
    public void printAllInfo() {
        IO.println(
                "[Motorbike] " + plateNumber +
                        ", rate " + dailyRate + " OMR/day" +
                        ", " + engineCc + " cc" +
                        ", " + rentalDays + " days" +
                        ", cost " + costFor(rentalDays) + " OMR"
        );
    }
}
