package Design_pattern.Prototype;

public class Student implements Create_Prototype{
    private int id;
    int age;
    String name;
    double psp;
    String batchName;
    double averageBatchPsp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Student(){

    }

    public Student(Student student){
        this.id = student.id;
        this.age = student.age;
        this.psp = student.psp;
        this.batchName = student.batchName;
        this.name = student.name;
        this.averageBatchPsp = student.averageBatchPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}