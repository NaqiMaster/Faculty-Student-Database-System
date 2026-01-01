import java.util.*;

class Faculty extends Person {

    private static int fID = 0;
    private static ArrayList<String> facIds = new ArrayList<>();
    private static ArrayList<String> facF = new ArrayList<>();
    private static ArrayList<String> facL = new ArrayList<>();
    private static ArrayList<String> facD = new ArrayList<>();

    public static String get_next_faculty_ID(String f, String l, String d) {
        for (int i = 0; i < facIds.size(); i++) {
            if (facF.get(i).equals(f) && facL.get(i).equals(l) && facD.get(i).equals(d)) {
                return facIds.get(i);
            }
        }
        String id = String.format("F%04d", ++fID);
        facIds.add(id);
        facF.add(f);
        facL.add(l);
        facD.add(d);
        return id;
    }

    private String faculty_ID;
    private Department dept;

    public Faculty(String f, String l, String dob, String address, String deptName) {
        super(f, l, dob, address);
        this.faculty_ID = get_next_faculty_ID(f, l, deptName);
        this.dept = deptName == null ? null : new Department(deptName, false);
    }

    public String get_faculty_id() { return faculty_ID; }
    public Department get_dept() { return dept; }
}
