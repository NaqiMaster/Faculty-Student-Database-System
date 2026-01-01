import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

class Person {

    private String firstName, lastName, dob, address;

    public Person(String f, String l, String dob, String addr) {
        this.firstName = f;
        this.lastName = l;
        this.dob = dob;
        this.address = addr;
    }

    public String get_first_name() { return firstName; }
    public String get_last_name() { return lastName; }
    public String get_dob() { return dob; }
    public String get_address() { return address; }

    public int find_age() {
        try {
            LocalDate birth = LocalDate.parse(dob);
            YearMonth start = YearMonth.from(birth);
            YearMonth end = YearMonth.from(LocalDate.now());
            return (int) (ChronoUnit.MONTHS.between(start, end) + 1);
        } catch (DateTimeParseException e) {
            return -1;
        }
    }
}
