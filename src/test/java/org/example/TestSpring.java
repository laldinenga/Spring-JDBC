package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        userDAO dao = ctx.getBean("dao", userDAO.class);

        /*For Create Operatation*/
        user st = new user(10, "lawma@gmail.com", "lalroliana", "lawmtea", "abc123");
        dao.safe(st);
        System.out.println("record is inserted successfully");

        /*For Update Operation*/
        user st = new user(10, "lawmi@gmail.com", "lalrolianathang", "lawmteaii", "abc321");
        dao.update(st);
        System.out.println("Record is updated successfully");

        /*For Read Operation*/
        List<user> st = dao.listusers();
        for (user record : st) {
            System.out.println("id :" + record.getId());
            System.out.println("email :" + record.getEmail());
            System.out.println("firstname :" + record.getFirstname());
            System.out.println("lastname :" + record.getLastname());
            System.out.println("password :" + record.getPassword());

        }

        /*for DELETE OPERATION*/
        user st = new user();
        dao.delete(7);
        System.out.println("Delete successful");


    }
}
