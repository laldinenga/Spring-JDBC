package org.example;

/*We will perform CRUD Operation*/
public interface userDAO {
    public void safe(user st);   /*for Create operation*/
    public void update(user st);   /*for Update operation*/
    public void delete(int st);/*for Delete operation*/
   List<user> listusers();     /*for Read operation*/

}
