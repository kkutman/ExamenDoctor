public class Doctor extends Person{
    private String whichDirection;

    public Doctor(int id, String fullName, byte age,
                  char gender, String email, String phoneNumber, double governmentsSalary, String whichDirection) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.whichDirection = whichDirection;
    }

    public String getWhichDirection() {
        return whichDirection;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "whichDirection='" + whichDirection + '\'' +
                '}';
    }
}
