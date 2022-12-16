package repository;

import model.Role;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryRole extends Repository{
    public RepositoryRole(){
        super();
    }

    public void insertRole(Role role){
        String insertTo="";
        insertTo+="insert into role( title, description) values ( ";
        insertTo+=String.format("'%s','%s'",role.getTitle(),role.getDescription());
        insertTo+=")";
        executeStatement(insertTo);

    }

    public void stergeRoleById(int id){
        String text=String.format("delete from role where id= %d",id);
        executeStatement(text);
    }

    public  void updateTitle(int id,String title){
        String update="";
        update+=String.format("update role set description= '%s'",title);
        update+=String.format("where id= %d",id);
        executeStatement(update);
    }

    private ResultSet allPermission(){
        executeStatement("select * from role");
        try{
            return statment.getResultSet();
        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public List<Role> allPermissions(){
        ResultSet set=allPermission();
        List<Role>rols=new ArrayList<>();
        try{
            while(set.next()){
                rols.add(new Role(set.getInt(1),set.getString(2),set.getString(3)));
            }
        }catch (Exception e){
            System.out.println("Nu s-a creat lista");
        }
        return  rols;

    }
}
