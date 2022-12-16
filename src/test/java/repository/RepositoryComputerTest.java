package repository;

import model.Computer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryComputerTest {
    @Test
    public  void insertComputer(){
        RepositoryComputer repositoryComputer=new RepositoryComputer();
        Computer computer=new Computer(1,"test","5000","i7","Asus",1);

       repositoryComputer.insertComputer(computer);
    }

    @Test
    public void deleteById(){
        RepositoryComputer repositoryComputer=new RepositoryComputer();
        repositoryComputer.stergComputerById(5);

    }



    @Test
    public void update(){
        RepositoryComputer repositoryComputer=new RepositoryComputer();
        repositoryComputer.updatePrice(6,4055);

    }


    @Test
    public void allLists(){
        RepositoryComputer repositoryComputer=new RepositoryComputer();
        List<Computer> computers=repositoryComputer.allComputers();
        for(Computer c:computers){
            System.out.println(c.toString());
        }

    }


}
