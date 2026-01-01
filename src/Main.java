class Main {
    public static void main(String[] args) {
        Database db = new Database("data.csv");
        db.read_file();
        db.populate_data();
        db.print_dept_data("Computer Science");
    }
}
