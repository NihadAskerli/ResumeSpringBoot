package com.example;

import com.example.dao.inter.UserDaoInter;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import outer.MyComponent;

import java.util.List;

@SpringBootApplication
public class ResumeDbAppJpaSpringApplication {
    public ResumeDbAppJpaSpringApplication(){
        System.out.println("ResumeDbAppJpaSpringApplication");
    }
    @Autowired
    @Qualifier ("userDao1")
private UserDaoInter userDao;


//    @Autowired
//    @Qualifier ("alma")
//    private Object obj;
//    @Autowired
//    @Qualifier ("alma")
//    private Object obj2;
//    @Autowired
//    @Qualifier ("alma")
//    private Object obj3;
//    @Autowired
//    private AMyConfiguration conf;
//    @Autowired
//    private AMyConfiguration conf2;

//@Autowired
// MyComponent component;


    public static void main(String[] args) {

        SpringApplication.run(ResumeDbAppJpaSpringApplication.class, args);

    }
//    @Bean(name="userDao1")
//    UserDaoInter getUserDao(){
//        return new UserDaoImpl();
//    }
    @Bean
    public CommandLineRunner runner(){
        CommandLineRunner clr=new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                System.out.println("obj="+object);
//                System.out.println("obj="+obj);
//                System.out.println("obj="+obj2);

//                List<User>list=userDao.getAll(null,null,null);
//                System.out.println(list);
                userDao.updateUser(null);




            }
        };
       return clr;
    }

}
