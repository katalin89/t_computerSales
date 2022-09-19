package model;

public class Computer {
    private  int id;
    private String type;
    private String price;
    private  String  description;
    private String company;
    private  int costumerId;

    public  Computer(int id,String type,String price,String description,String company,int costumerId){
        this.id=id;
        this.type=type;
        this.price=price;
        this.description=description;
        this.company=company;
        this.costumerId=costumerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(int costumerId) {
        this.costumerId = costumerId;
    }

    @Override

    public  String toString(){
        String text="";
        text+=id+","+type+","+price+","+description+","+company+","+costumerId;
        return  text;
    }

    @Override
    public  boolean equals(Object o){
        Computer computer=(Computer) o;
        return  computer.price==this.price;

    }





}
