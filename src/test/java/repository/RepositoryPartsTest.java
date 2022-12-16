package repository;

import model.Parts;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryPartsTest {

    @Test
    void insertParts() {
        RepositoryParts repositoryParts=new RepositoryParts();
        Parts parts=new Parts(1,"Hard","2021","Pc");
        repositoryParts.insertParts(parts);
    }

    @Test
    void stergePartsById() {
        RepositoryParts repositoryParts=new RepositoryParts();
        repositoryParts.stergePartsById(5);


    }

    @Test
    void updateDescription() {
        RepositoryParts repositoryParts=new RepositoryParts();
        repositoryParts.updateDescription(6,"test");

    }

    @Test
    void deleteParts() {
        RepositoryParts repositoryParts=new RepositoryParts();

        repositoryParts.deleteParts("Hard");
    }

    @Test
    void allParts() {
        RepositoryParts repositoryParts=new RepositoryParts();
        List<Parts> parts=repositoryParts.allParts();
        for(Parts p:parts){
            System.out.println(p.toString());
        }

    }


}