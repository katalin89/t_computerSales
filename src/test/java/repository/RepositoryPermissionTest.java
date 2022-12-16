package repository;

import model.Parts;
import model.Permission;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;





public class RepositoryPermissionTest {
    @Test
    void insert() {
        RepositoryPermission repositorypermisson = new RepositoryPermission();
        Permission permission=new Permission(1,1,"test","test","tets");
        repositorypermisson.insertPermission(permission);

    }
    @Test
    void  delete(){
        RepositoryPermission repositorypermisson = new RepositoryPermission();
        repositorypermisson.stergePersmissionById(8);

    }

    @Test
    void  update(){
        RepositoryPermission repositorypermisson = new RepositoryPermission();
        repositorypermisson.updateDescription(7,"updateDescription");

    }
    @Test
    void  deleteByTitle(){
        RepositoryPermission repositorypermisson = new RepositoryPermission();
        repositorypermisson.deletePermission("test");

    }
    @Test
    void allParts() {
        RepositoryPermission repositoryPermisson = new RepositoryPermission();
        List<Permission> permissions=repositoryPermisson.allPermissions();
        for(Permission p:permissions){
            System.out.println(p.toString());
        }

    }




}