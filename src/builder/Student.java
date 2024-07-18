package builder;

public class Student {
    private String name;
    private int age;
    private int gradYear;
    private String course;
    private String batch;
    private double psp;

    public Student(StudentBuilder builder) {
        if (builder.getAge() < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }

        if (builder.getGradYear() > 2024) {
            throw new IllegalArgumentException("Grad year must be smaller than 2024");
        }

        if (builder.getCourse() == null) {
            this.course = "Academy";
        } else {
            this.course = builder.getCourse();
        }

        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getBatch() {
        return batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}
