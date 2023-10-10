package ProtoNRegistryPackage;

public class Client {

    public static void fillregistry(StudentRegistry reg){
        Student julyStudent = new Student();
        julyStudent.batchName = "july22";
        julyStudent.univ = "wbut";
        reg.register("julyStudent", julyStudent);

        Student augStudent = new Student();
        augStudent.batchName = "aug23";
        augStudent.univ = "scaler";
        reg.register("augStudent", augStudent);

        IntelligentStudents advancedStudent = new IntelligentStudents();
        advancedStudent.batchName = "sept20";
        advancedStudent.univ = "mit";
        advancedStudent.iq = 30;
        reg.register("advStudent", advancedStudent);
    }

    public static void main(String[] args) {
        StudentRegistry reg = new StudentRegistry();
        fillregistry(reg);


        Student subhadip = reg.get("julyStudent").clone();
        subhadip.name = "subhadip";
        subhadip.age = 30;
        subhadip.psp = 90;

        Student saikat = reg.get("advStudent").clone();
        saikat.psp = 90;
        saikat.age = 23;
        saikat.name = "saikat";


        System.out.println(subhadip.univ);
    }
}
