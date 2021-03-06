package pl.hanawind.sailcalculator.sail;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hanawind.sailcalculator.user.User;

import java.util.List;

public interface SailRepository extends JpaRepository<Sail, Long> {


    List<Sail> findAllByUser(User user);

}
