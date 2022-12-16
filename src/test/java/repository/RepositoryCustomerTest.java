package repository;

import exceptions.ComputerFoundException;
import model.Costumer;
import org.junit.jupiter.api.Test;

import java.util.List;

class RepositoryCustomerTest {

    @Test
    void insertCustomer() {
        RepositoryCustomer repositoryCostumer=new RepositoryCustomer();

            Costumer costumer=new Costumer(1,"Matei","07652452","matei@yahoo.com","Livezeni nr 44","123","matei");


        repositoryCostumer.insertCostumer(costumer);
    }




    @Test
    void stergeCustomerById() {
        RepositoryCustomer repositoryCostumer=new RepositoryCustomer();
        repositoryCostumer.stergeCustomerById(9);
    }

    @Test
    void updateAdress(){
        RepositoryCustomer repositoryCostumer=new RepositoryCustomer();
repositoryCostumer.updateAdress(10,"test");

    }

    @Test
    void deleteCustomer(){
        RepositoryCustomer repositoryCostumer=new RepositoryCustomer();
        repositoryCostumer.deleteCustomer("Matei");

    }

@Test
    public void allCustomers(){
        RepositoryCustomer repositoryCostumer=new RepositoryCustomer();
        List<Costumer> customers=repositoryCostumer.allCostumers();
        for(Costumer c:customers){
            System.out.println(c.toString());
        }
    }

    @Test
    void findByName() throws ComputerFoundException {
        RepositoryCustomer repositoryCostumer=new RepositoryCustomer();

        repositoryCostumer.findCustomers("accesSales");

    }



}
