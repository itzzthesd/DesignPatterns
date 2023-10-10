package Eager;
//single threaded environement
public class DBconnection {
    private static DBconnection instance = new DBconnection();

    private DBconnection(){

    }

    public DBconnection getInstance(){
        return instance;
    }
}
