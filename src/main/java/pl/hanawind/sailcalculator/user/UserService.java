package pl.hanawind.sailcalculator.user;

import org.springframework.stereotype.Service;
import pl.hanawind.sailcalculator.sail.Sail;
import pl.hanawind.sailcalculator.sail.SailRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final SailRepository sailRepository;

    public UserService(UserRepository userRepository, SailRepository sailRepository) {
        this.userRepository = userRepository;
        this.sailRepository = sailRepository;
    }


    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUser(String name){
        return userRepository.findByName(name);
    }

    public List<Sail>userSails(User user){
        return sailRepository.findAllByUser(user);
    }

    public User getById (Long id){
        return userRepository.getById(id);
    }

}