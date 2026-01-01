import java.util.*;

class Department {

    private static int dpID = 0;
    private static ArrayList<Integer> dpIds = new ArrayList<>();
    private static ArrayList<String> dpNames = new ArrayList<>();
    private static ArrayList<Integer> dpEnrl = new ArrayList<>();

    public static int getNextDepID() {
        return ++dpID;
    }

    public static int get_total_enrl(String depName) {
        for (int i = 0; i < dpNames.size(); i++) {
            if (dpNames.get(i).equals(depName)) {
                return dpEnrl.get(i);
            }
        }
        return -1;
    }

    private int depId;
    private String depName;

    public Department(String depName, boolean calledByStudent) {
        this.depName = depName;
        int idx = -1;

        for (int i = 0; i < dpNames.size(); i++) {
            if (dpNames.get(i).equals(depName)) {
                idx = i;
                break;
            }
        }

        if (idx >= 0) {
            this.depId = dpIds.get(idx);
            if (calledByStudent) {
                dpEnrl.set(idx, dpEnrl.get(idx) + 1);
            }
        } else {
            int newId = getNextDepID();
            this.depId = newId;
            dpIds.add(newId);
            dpNames.add(depName);
            dpEnrl.add(calledByStudent ? 1 : 0);
        }
    }

    public int get_dep_id() { return depId; }
    public String get_dep_name() { return depName; }

    @Override
    public String toString() {
        return "Department[id=" + depId + ", name=" + depName + "]";
    }
}

