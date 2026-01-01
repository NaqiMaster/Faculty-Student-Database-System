import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Student extends Person {

    private static int sID = 0;
    private static ArrayList<String> stuIds = new ArrayList<>();
    private static ArrayList<String> stuF = new ArrayList<>();
    private static ArrayList<String> stuL = new ArrayList<>();
    private static ArrayList<String> stuD = new ArrayList<>();

    public static String get_next_student_ID(String f, String l, String d) {
        for (int i = 0; i < stuIds.size(); i++) {
            if (stuF.get(i).equals(f) && stuL.get(i).equals(l) && stuD.get(i).equals(d)) {
                return stuIds.get(i);
            }
        }
        String id = String.format("STU%05d", ++sID);
        stuIds.add(id);
        stuF.add(f);
        stuL.add(l);
        stuD.add(d);
        return id;
    }

    private String student_ID;
    private Department dept;
    private Faculty supervisor;

    public Student(String f, String l, String dob, Faculty sup, String deptName) {
        super(f, l, dob, "");
        this.student_ID = get_next_student_ID(f, l, dob);
        this.dept = deptName == null ? null : new Department(deptName, true);
        this.supervisor = sup;
    }

    @Override
    public int find_age() {
        try {
            LocalDate birth = LocalDate.parse(get_dob());
            return (int) (ChronoUnit.DAYS.between(birth, LocalDate.now()) + 1);
        } catch (DateTimeParseException e) {
            return -1;
        }
    }

    public Faculty get_supervisor() { return supervisor; }
}
