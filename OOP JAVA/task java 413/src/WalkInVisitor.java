public class WalkInVisitor implements Attendable {

    private String name;
    private int age;
    private int arrivalOrder;

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

    public int getArrivalOrder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(int arrivalOrder) {
        if (arrivalOrder > 0) {
            this.arrivalOrder = arrivalOrder;
        } else {
            this.arrivalOrder = 1;
        }
    }

    @Override
    public String getPriority() {
        return "Walk-in";
    }

    @Override
    public int getWaitMinutes() {
        return arrivalOrder * 15;
    }

    @Override
    public void printAllInfo() {
        IO.println(
                "[Walk-in] " + name +
                        ", age " + age +
                        ", waits " + getWaitMinutes() + " min"
        );
    }
}