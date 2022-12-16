package repository;

import model.Service;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryServiceTest {
    @Test
    void insertService() {
        RepositoryService repositoryService = new RepositoryService();
        Service service = new Service(1, 1, "type", "charge", "description");
        repositoryService.insertService(service);

    }

    @Test
    public void deleteById() {
        RepositoryService repositoryService = new RepositoryService();
        repositoryService.stergeServiceById(7);

    }

    @Test
    public void update() {
        RepositoryService repositoryService = new RepositoryService();
        repositoryService.updateType(6, "test");

    }

    @Test
    public void allLists() {
        RepositoryService repositoryService = new RepositoryService();
        List<Service> services = repositoryService.allServices();
        for (Service s : services) {
            System.out.println(s.toString());
        }
    }
}

