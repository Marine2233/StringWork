package stringWork;

public class Student {
    private String name;
    private int mark;

    public Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + " "+ mark;
    }
}
