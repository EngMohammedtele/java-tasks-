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

