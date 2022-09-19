package model;

public class Sales {
    private int id;
    private  String amount;
    private String type;
    private String description;
    private  int costumerId;

    public Sales(int id,String amount,String type,String description,int costumerId){
        this.id=id;
        this.amount=amount;
        this.type=type;
        this.description=description;
        this.costumerId=costumerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        text+=id+","+amount+","+type+","+description+","+costumerId;
        return text;
    }

    @Override
    public boolean equals(Object o){
        Sales sale=(Sales)o;
        return  sale.type==this.type;
    }
}
