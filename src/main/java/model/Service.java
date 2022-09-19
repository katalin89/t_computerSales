package model;

public class Service {
    private int id;
    private int computerId;
    private String type;
    private String charge;
    private  String description;

    public  Service(int id,int computerId,String type,String charge,String description){
        this.id=id;
        this.computerId=computerId;
        this.type=type;
        this.charge=charge;
        this.description=description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override

    public  String toString(){
        String text="";
        text+=id+","+computerId+","+type+","+charge+","+description;
        return  text;
    }

    @Override
    public  boolean equals(Object o){
        Service service=(Service)o;
        return service.description==this.description;

    }
}
