import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    void favoriteSport(String name);

    String favoriteLanguage(String name);

    Month favoriteMouth(int num);

    String getLastName();

    LocalDate getDateOfBrith(int year,int mouth,int day);

    String getPhoneNumberAndEmail();

    void getPeopleOfAllAges(Person [] people);


}
