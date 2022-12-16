package repository;

import model.Permission;
import model.Role;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryRoleTest {
    @Test
    void insert() {
        RepositoryRole repositoryRole = new RepositoryRole();
        Role role = new Role(1, "test", "description");
        repositoryRole.insertRole(role);

    }

    @Test
    void stergeById(){
      RepositoryRole repositoryRole=new RepositoryRole();
      repositoryRole.stergeRoleById(5);
    }

    @Test
    void update(){
        RepositoryRole repositoryRole=new RepositoryRole();
        repositoryRole.updateTitle(1,"sectia Pc");
    }

    @Test
    void allParts(){
        RepositoryRole repositoryRole=new RepositoryRole();
        List<Role>rols=repositoryRole.allPermissions();
        for(Role r:rols){
            System.out.println(r.toString());
        }
    }

}
