package ProtoNRegistryPackage;

public class Student implements Prototype<Student>{
    String name;
    int age;
    String univ;
    int psp;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    String batchName;
    Student(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
        this.univ = st.univ;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
