package GetterSetter;

/**
 *
 * @author Shail Shah
 */
public class GS_Reg {
    int    id;
    int    t;
    String fname;
    String lname;
    String userid;
    String email;
    String pswd;
    String date;
    String num;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;

        // System.out.println(fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pass) {
        this.pswd = pass;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String number) {
        this.num = number;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
