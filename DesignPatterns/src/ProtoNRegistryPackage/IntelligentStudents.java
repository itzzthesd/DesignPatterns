package ProtoNRegistryPackage;

public class IntelligentStudents extends Student{
    public int iq;

    IntelligentStudents(){};
    IntelligentStudents(IntelligentStudents intelligentStudents){
        super(intelligentStudents);
        //this.iq = intelligentStudents.iq;
    }

    public IntelligentStudents clone(){
        return new IntelligentStudents(this);
    }
}
