package lessons.services;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}