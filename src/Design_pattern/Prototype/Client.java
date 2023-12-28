package Design_pattern.Prototype;

public class Client {
    public static void FillRegistry(StudentRegistry studentRegistry){
        StudentPrototype Dec22BeginnerBatch = new StudentPrototype();
        Dec22BeginnerBatch.setAverageBatchPsp(92);
        Dec22BeginnerBatch.setBatchName("Dec 22 Beginner Batch");
        studentRegistry.register("Dec22BeginnerBatch", Dec22BeginnerBatch);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatchName("Dec 22 Beginner Intelligent Batch");
        intelligentStudent.setAverageBatchPsp(97);
        intelligentStudent.setIq(175);
        studentRegistry.register("intelligentStudent", intelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        FillRegistry(studentRegistry);

        StudentPrototype vj = studentRegistry.get("Dec22BeginnerBatch").clone();
        vj.setName("Vijay");
        vj.setPsp(94);
        vj.setAge(23);
        vj.setId(52);

        StudentPrototype krishna = studentRegistry.get("intelligentStudent").clone();
        krishna.setName("Krishna");
        krishna.setPsp(97);
        krishna.setAge(23);
        krishna.setId(12);

        System.out.println("PSP Of "+vj.getName()+" is "+vj.getPsp());
        System.out.println("PSP Of "+krishna.getName()+" is "+krishna.getPsp());
    }
}