public class Student {
    private String name;
    private String id;
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() { return name; }
    public String getId() { return id; }
    public void setName(String name) { this.name = name; }
}