package model;

public class User {
    private int id;
    private int roleId;
    private String name;
    private String email;
    private  String dob;
    private  String address;

    public  User(int id,int roleId,String name,String email,String dob,String address){
        this.id=id;
        this.roleId=roleId;
        this.name=name;
        this.email=email;
        this.dob=dob;
        this.address=address;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+roleId+","+name+","+email+","+dob+","+address;
        return  text;
    }
    @Override
    public boolean equals(Object o){
        User user=(User )o;
        return  user.id==this.id;
    }
}
