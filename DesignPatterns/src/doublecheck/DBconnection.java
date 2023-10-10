package doublecheck;
//multi threaded environement
public class DBconnection {
    private static DBconnection instance = null;

    private DBconnection(){

    }

    public DBconnection getInstance(){
        if(instance == null){
            synchronized (DBconnection.class){
                if(instance == null){
                    instance= new DBconnection();
                }
            }
        }
        return instance;
    }
}
