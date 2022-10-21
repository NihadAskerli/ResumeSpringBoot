package outer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class MyComponent {
//    @Bean
//    public Object getObject(){
//        System.out.println("objekt yaradildi");
//        return new Object();
//    }
    public MyComponent(){

        System.out.println("MyComponent");
    }

}
