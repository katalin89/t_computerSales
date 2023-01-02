package repository;

import model.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryUser extends Repository {
    public RepositoryUser() {
        super();
    }

    public void insertUser(User user) {
//        String insertTo="";
//        insertTo=" insert into user( role_id, name, email, dob, adress)  values(";
//        insertTo+=String.format("%d,'%s','%s','%s','%s'",user.getRoleId(),user.getName(),user.getEmail(),user.getDob(),user.getAddress());
//        insertTo+=")";
//        executeStatement(insertTo);

        String insertTo = "";
        insertTo += " insert into user( role_id, name, email, dob, adress)  values(";
        insertTo+=String.format("%d,'%s','%s','%s','%s'",user.getRoleId(),user.getName(),user.getEmail(),user.getDob(),user.getAddress());
        insertTo += ")";
        executeStatement(insertTo);
    }


    public void stergeUserById(int id) {
        String text = String.format("delete from user where id=%d", id);
        executeStatement(text);
    }

    public void updateAdress(int id, String adress) {
        String update = "";
        update += String.format("update user set adress='%s'", adress);
        update += String.format("where id=%d", id);
        executeStatement(update);
    }

    private ResultSet allUser() {
        executeStatement("select * from user");
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    public List<User> allusers() {
        ResultSet set = allUser();
        List<User> users = new ArrayList<>();
        try {
            while (set.next()) {
                //    public  User(int id,int roleId,String name,String email,String dob,String address){
                users.add(new User(set.getInt(1), set.getInt(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6)));
            }
        } catch (Exception e) {
            System.out.println("Nu s-a executat lista");
        }
        return users;
    }
}
/*

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

*/