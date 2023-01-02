package repository;

import model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryUserTest {

    @Test
    void insertUser() {
        RepositoryUser repositoryUser=new RepositoryUser();
        User user=new User(1,1,"test","test","2002-01-04","test");
        repositoryUser.insertUser(user);
    }

    @Test
    void stergeUserById() {
        RepositoryUser repositoryUser=new RepositoryUser();
        repositoryUser.stergeUserById(5);
    }

    @Test
    void updateAdress() {
        RepositoryUser repositoryUser=new RepositoryUser();
        repositoryUser.updateAdress(6,"Zagazului");

    }

    @Test
    void allusers() {
        RepositoryUser repositoryUser=new RepositoryUser();
        List<User>users=repositoryUser.allusers();
        for(User u:users){
            System.out.println(u.toString());
        }
    }
}
/*


    @Test
    public void allLists() {
        RepositoryService repositoryService = new RepositoryService();
        List<Service> services = repositoryService.allServices();
        for (Service s : services) {
            System.out.println(s.toString());
        }
    }
}

*/