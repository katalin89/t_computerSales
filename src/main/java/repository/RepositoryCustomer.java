package repository;

import exceptions.ComputerFoundException;
import exceptions.ComputerNotFoundException;
import model.Computer;
import model.Costumer;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryCustomer extends Repository {



    public RepositoryCustomer() {
        super();
    }

    public void insertCostumer(Costumer customer) {


        String insertTo = "";

        insertTo += " insert into customer(name,mobile,email,address,password,userName)  values (";
        insertTo += String.format("'%s','%s','%s','%s','%s','%s'", customer.getName(), customer.getMobile(), customer.getEmail(), customer.getAddress(), customer.getPassword(),customer.getUserName());
        insertTo += ")";
        executeStatement(insertTo);

    }


    public void stergeCustomerById(int id) {

        String text = String.format("delete from customer where id= %d ", id);
        executeStatement(text);
    }

    public void updateAdress(int id, String address) {

        String update = "";
        update += String.format("update customer set address='%s'", address);
        update += String.format("where id=%d", id);
        executeStatement(update);


    }




    public void deleteCustomer(String name) {
        String delete = "";
        delete += String.format(" delete from customer where name = '%s'", name);
        executeStatement(delete);
    }

    private ResultSet allCustomer() {
        executeStatement("select * from customer");
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    //dupa nume
    private ResultSet findCostumerName(String name) {
        executeStatement(String.format("select * from customer where name='%s'", name));
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    public Costumer findCostumers(String name) throws ComputerFoundException {
        ResultSet set = findCostumerName(name);
        List<Costumer> customer = new ArrayList<>();
        try {
            while (set.next()) {

                customer.add(new Costumer(set.getInt(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6),set.getString(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (customer.size() != 0) {
            throw new ComputerFoundException("Cartea exista deja");
        }
        return customer.get(0);
    }






    public List<Costumer> allCostumers() {
        ResultSet set = allCustomer();
        List<Costumer> customers = new ArrayList<>();
        try {
            while (set.next()) {
                customers.add(new Costumer(set.getInt(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6),set.getString(7)));
            }
        } catch (Exception e) {
            System.out.println("Nu sa creat lista");
        }
        return customers;

    }
    private ResultSet findCustomerName(String name){
        executeStatement(String.format("select * from customer where name ='%s'",name));
        try{
            return statment.getResultSet();
        }catch (Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

    public  Costumer findCustomers(String name) throws  ComputerFoundException{
        ResultSet set=findCustomerName(name);
        List<Costumer> customer=new ArrayList<>();
        try{
            while(set.next()){
       //  public Costumer(int id, String name, String mobile, String email, String address, String password, String userName) {

                    customer.add(new Costumer(set.getInt(1),set.getString(2),set.getString(3),set.getString(4),set.getString(5),set.getString(6),set.getString(7)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        if(customer.size()!=0){
            throw new ComputerFoundException("Computerul exista deja");
        }
        return  customer.get(0);
    }

    //Nu s-a gasit customer
    private ResultSet findCostumer(int id){
        executeStatement(String.format("select * from customer where id=%d",id));
        try{
            return  statment.getResultSet();
        }catch(Exception e){
            System.out.println("Nu s-a executat schita");
            return  null;
        }
    }

}

/*


    //Nu s-a gasit cartea
    private ResultSet findCostumer(int id) {
        executeStatement(String.format("select * from customer where id=%d", id));
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    ----

        private ResultSet findCostumerName(String name) {
        executeStatement(String.format("select * from customer where name='%s'", name));
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

       //dupa nume

    public Costumer findCostumers(String name) throws ComputerFoundException {
        ResultSet set = findCostumerName(name);
        List<Costumer> customer = new ArrayList<>();
        try {
            while (set.next()) {

                customer.add(new Costumer(set.getInt(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getString(6),set.getString(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (customer.size() != 0) {
            throw new ComputerFoundException("Cartea exista deja");
        }
        return customer.get(0);
    }




*/
