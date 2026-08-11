public class BookedPatient implements Attendable {

    private String name;
    private int age;
    private final String slotTime; // no setter - locked once the object is built

    public BookedPatient(String slotTime) {
        this.slotTime = slotTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            IO.println("Name is required");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            IO.println("Invalid age");
        }
    }

    public String getSlotTime() {
        return slotTime;
    }

    @Override
    public String getPriority() {
        return "Booked";
    }

    @Override
    public int getWaitMinutes() {
        return 10;
    }

    @Override
    public void printAllInfo() {
        IO.println(
                "[Booked] " + name +
                        ", age " + age +
                        ", slot " + slotTime +
                        ", waits " + getWaitMinutes() + " min"
        );
    }
}
