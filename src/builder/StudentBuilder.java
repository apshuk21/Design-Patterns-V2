//package builder;
//
//public class StudentBuilder {
//    private String name;
//    private int age;
//    private int gradYear;
//    private String course;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public StudentBuilder name(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public StudentBuilder age(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public StudentBuilder gradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public StudentBuilder course(String course) {
//        this.course = course;
//        return this;
//    }
//
//    public Student build() {
//        if (this.getAge() < 18) {
//            throw new IllegalArgumentException("Age must be at least 18");
//        }
//
//        if (this.getGradYear() > 2024) {
//            throw new IllegalArgumentException("Grad year must be smaller than 2024");
//        }
//
//        if (this.getCourse() == null) {
//            this.course = "Academy";
//        } else {
//            this.course = this.getCourse();
//        }
//        return new Student(this);
//    }
//}
