package repository;

import model.Parts;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryParts extends  Repository {

    public  RepositoryParts(){
        super();
    }

    public void insertParts(Parts parts){
        String insertTo="";
        insertTo+="insert into parts( name, description, type)  values(";
        insertTo+= String.format("'%s','%s','%s'",parts.getName(),parts.getDescription(),parts.getType());
        insertTo+=")";
        executeStatement(insertTo);
   }

   public void stergePartsById(int id){
        String text=String.format("delete from parts where id=%d",id);
        executeStatement(text);
   }

   public void updateDescription(int id,String description){


       String update = "";
       update += String.format("update parts set description='%s'", description);
       update += String.format(" where id=%d", id);
       executeStatement(update);
   }



   public void deleteParts(String name){
        String delete="";
        delete+=String.format("delete from parts where name ='%s'",name);
        executeStatement(delete);
   }
   private ResultSet allPart(){
        executeStatement("select * from parts");
        try{
            return  statment.getResultSet();
        }catch(Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
   }

   public List<Parts> allParts(){
        ResultSet set=allPart();
        List<Parts> parts=new ArrayList<>();
        try{
            while(set.next()){
                parts.add(new Parts(set.getInt(1), set.getString(2), set.getString(3), set.getString(4)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a create lista");
        }
        return  parts;
   }
}


