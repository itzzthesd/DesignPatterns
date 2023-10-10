package Eager;
//single threaded environement - singleton
public class DBconnection {
    private static DBconnection instance = new DBconnection();

    private DBconnection(){

    }

    public DBconnection getInstance(){
        return instance;
    }
}
