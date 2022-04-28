package com.in28minutes.learning.jpa.jpain10steps;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.entity.service.UserDAOService;
import com.in28minutes.learning.jpa.jpain10steps.entity.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandlineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandlineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);
        log.info("New User is Created :" + user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieved :" + userWithIdOne);

        List<User> all = userRepository.findAll();
        log.info("All User retrieved :" + all);



    }
}
