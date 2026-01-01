import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

class Database {

    private String filename;
    private ArrayList<ArrayList<String>> rows;
    private ArrayList<Object> obj_list;

    public Database(String filename) {
        this.filename = filename;
        this.rows = new ArrayList<>();
        this.obj_list = new ArrayList<>();
    }

    public void read_file() {
        // your CSV-reading logic
    }

    public void populate_data() {
        // your Faculty + Student creation logic
    }

    public Object get_fac_obj(String key) {
        // your lookup logic
    }

    public void print_dept_data(String deptName) {
        // your printing logic
    }

    // helper/testing methods
}
