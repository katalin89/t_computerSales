package repository;

import model.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryService extends Repository{
    public  RepositoryService(){
        super();
    }

    public  void insertService(Service service){
        String insertTo="";
        insertTo+=" insert into service( computer_id, type, charge, description) values (";
        insertTo+=String.format("%d,'%s','%s','%s'",service.getComputerId(),service.getType(),service.getCharge(),service.getDescription());
        insertTo+=")";
        executeStatement(insertTo);
    }

    public void stergeServiceById(int id){
        String text=String.format("delete from service where id=%d",id);
        executeStatement(text);
    }

    public void updateType(int id,String type){
        String update="";
        update+=String.format("update service set type='%s'",type);
        update+=String.format("where id=%d",id);
        executeStatement(update);
    }

    private ResultSet allSevice(){
        executeStatement("select * from service");
        try{
            return statment.getResultSet();
        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Service> allServices(){
        ResultSet set=allSevice();
        List<Service>services=new ArrayList<>();
        try{
            while(set.next()){
                services.add(new Service(set.getInt(1),set.getInt(2),set.getString(3),set.getString(4),set.getString(5)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a cereat lista");
        }
        return services;
    }
}

