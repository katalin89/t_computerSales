package model;

public class Parts {
    private int id;
    private  String name;
    private  String description;
    private String type;

    public  Parts(int id,String name,String description,String type){
        this.id=id;
        this.name=name;
        this.description=description;
        this.type=type;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public  String toString(){
        String text="";
        text+=id+","+name+","+description+","+type;
        return  text;
    }
    @Override
    public  boolean equals(Object o){
        Parts parts=(Parts) o;
        return parts.name==this.name;
    }
}
