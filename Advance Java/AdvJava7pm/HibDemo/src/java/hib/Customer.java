package hib;
// Generated Apr 26, 2018 7:45:50 PM by Hibernate Tools 3.2.1.GA



/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private int cid;
     private String cname;
     private String mailid;
     private String mob;
     private String address;
     private String city;
     private String state;

    public Customer() {
    }

	
    public Customer(int cid) {
        this.cid = cid;
    }
    public Customer(int cid, String cname, String mailid, String mob, String address, String city, String state) {
       this.cid = cid;
       this.cname = cname;
       this.mailid = mailid;
       this.mob = mob;
       this.address = address;
       this.city = city;
       this.state = state;
    }
   
    public int getCid() {
        return this.cid;
    }
    
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getMailid() {
        return this.mailid;
    }
    
    public void setMailid(String mailid) {
        this.mailid = mailid;
    }
    public String getMob() {
        return this.mob;
    }
    
    public void setMob(String mob) {
        this.mob = mob;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }




}

