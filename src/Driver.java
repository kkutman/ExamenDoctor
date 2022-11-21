import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

public class Driver extends Person implements PersonAble{
    private String nameCar;

    public Driver(int id, String fullName, int age, char gender, String email,
                  String phoneNumber, double governmentsSalary, String nameCar) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
        this.nameCar = nameCar;
    }

//    public String getNameCar() {
//        return nameCar;
//    }
//
//    @Override
//    public void favoriteSport(String name) {
//        System.out.println(getFullName()+" love sport "+name);
//    }
//
//    @Override
//    public String favoriteLanguage(String name) {
//        return getFullName()+" love language "+name;
//    }
//
//    @Override
//    public Month favoriteMouth(int num) {
//        return Month.of(num);
//    }
//
//    @Override
//    public String getLastName() {
//        return getFullName();
//    }
//
//    @Override
//    public LocalDate getDateOfBrith(int year,int mouth,int day ) {
//
//        return LocalDate.of(year,mouth,day);
//    }
//
//    @Override
//    public String getPhoneNumberAndEmail() {
//        return getPhoneNumber()+" "+getEmail();
//    }
//
//    @Override
//    public Long getPeopleOfAllAges(Person[] people) {
//        return null;
//    }

//    public static void sortAge ( Person[] people){
//
//
//        Arrays.sort(people,new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                if(p1.getAge() != p2.getAge())
//                    return p1.getAge() - p2.getAge();
//                return p1.getFullName().compareTo(p2.getFullName());
//            }
//        });
//
//        System.out.println(Arrays.toString(people));
//    }

    @Override
    public String toString() {
        return "Driver{" +
                "nameCar='" + nameCar + '\'' +"age"+ getAge()+
                '}';
    }
}
