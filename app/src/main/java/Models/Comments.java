package Models;

/**
 * Created by Pavilion on 17/6/2017.
 */
public class Comments {
    private int id;
    private String date;
    private int id_user;
    private String message;
    private int  rate;
    private String id_department;

    public int getId() {
        return id;
    }
    public String getPosterUserName(){
        return "";
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getId_department() {
        return id_department;
    }

    public void setId_department(String id_department) {
        this.id_department = id_department;
    }
}
