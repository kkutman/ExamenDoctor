import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

public abstract class Person implements PersonAble {
    private int id;
    private String fullName;
    private int age;
    private char gender;
    private String email;
    private String phoneNumber;
    private double governmentsSalary;

    public Person(int id, String fullName, int age, char gender, String email, String phoneNumber, double governmentsSalary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.governmentsSalary = governmentsSalary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getGovernmentsSalary() {
        return governmentsSalary;
    }

    @Override
    public void favoriteSport(String name) {
        System.out.println(getFullName()+" love sport "+name);
    }

    @Override
    public String favoriteLanguage(String name) {
        return getFullName()+" love language "+name;
    }

    @Override
    public Month favoriteMouth(int num) {
        return Month.of(num);
    }

    @Override
    public String getLastName() {
        String []array = fullName.split(" ");
        for (String s:array){
            return array[0];
        }
        return null;
    }

    @Override
    public LocalDate getDateOfBrith(int year, int mouth, int day ) {

        return LocalDate.of(year,mouth,day);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumber()+" "+getEmail();
    }





    @Override
    public void getPeopleOfAllAges(Person[] people) {

        int [] array = new int[people.length];
        int index = 0;
        for (Person person:people){
            array[index]=person.getAge();
            index++;
        }
        Arrays.sort(array);
        for (int i = 0; i < people.length; i++) {
            System.out.println(array[i]);

        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", governmentsSalary=" + governmentsSalary +
                '}';
    }
}
