package repository;

import exceptions.ComputerFoundException;
import exceptions.ComputerNotFoundException;
import model.Computer;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryComputer extends Repository {



    public RepositoryComputer() {
        super();
    }

    public void insertComputer(Computer computer) {


        String insertTo = "";

        insertTo += " insert into computer(type,price,description,company,customer_id)  values (";
        insertTo += String.format("'%s','%s','%s','%s',%d", computer.getType(), computer.getPrice(), computer.getDescription(), computer.getCompany(), computer.getCostumerId());
        insertTo += ")";
        executeStatement(insertTo);

    }


    public void stergComputerById(int id) {

        String text = String.format("delete from computer where id= %d ", id);
        executeStatement(text);
    }

    public void updatePrice(int id, int price) {

        String update = "";
        update += String.format("update computer set price=%d", price);
        update += String.format(" where id=%d", id);
        executeStatement(update);


    }


    public void deleteCompany(String company) {
        String delete = "";
        delete += String.format(" delete from computer where company = '%s'", company);
        executeStatement(delete);
    }

    private ResultSet allComputer() {
        executeStatement("select * from computer");
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    //dupa nume
    private ResultSet findComputerType(String type) {
        executeStatement(String.format("select * from computer where type='%s'", type));
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    public Computer findComputers(String name) throws ComputerFoundException {
        ResultSet set = findComputerType(name);
        List<Computer> computer = new ArrayList<>();
        try {
            while (set.next()) {

                computer.add(new Computer(set.getInt(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (computer.size() != 0) {
            throw new ComputerFoundException("Cartea exista deja");
        }
        return computer.get(0);
    }

    //Nu s-a gasit cartea
    private ResultSet findComputer(int id) {
        executeStatement(String.format("select * from computer where id=%d", id));
        try {
            return statment.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    //nu s-a gasit
    public Computer findComputers(int id) throws ComputerNotFoundException {
        ResultSet set = findComputer(id);
        List<Computer> computers = new ArrayList<>();
        try {
            while (set.next()) {

                computers.add(new Computer(set.getInt(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (computers.isEmpty()) {

            throw new ComputerNotFoundException("Nu exista computerul");
        }
        return computers.get(0);
    }


    public List<Computer> allComputers() {
        ResultSet set = allComputer();
        List<Computer> computers = new ArrayList<>();
        try {
            while (set.next()) {
                computers.add(new Computer(set.getInt(1), set.getString(2), set.getString(3), set.getString(4), set.getString(5), set.getInt(6)));
            }
        } catch (Exception e) {
            System.out.println("Nu sa creat lista");
        }
        return computers;

    }

}

