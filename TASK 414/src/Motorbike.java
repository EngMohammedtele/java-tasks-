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
