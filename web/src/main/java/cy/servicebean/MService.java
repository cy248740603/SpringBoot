package cy.servicebean;

import org.springframework.stereotype.Service;

@Service
public class MService{
    public String sayHello(String s){
        return "Hello " + s + " !";
    }
}