public class Programmer extends Person{
    private String programLanguars;

    public Programmer(int id, String fullName, byte age, char gender, String email,
                      String phoneNumber, double governmentsSalary, String programLanguars) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.programLanguars = programLanguars;
    }

    public String getProgramLanguars() {
        return programLanguars;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programLanguars='" + programLanguars + '\'' +
                '}';
    }
}
