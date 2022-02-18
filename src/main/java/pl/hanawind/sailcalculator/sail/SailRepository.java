package pl.hanawind.sailcalculator.sail;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SailRepository extends JpaRepository<Sail, Long> {


    List<Sail> findAllSailsByUserId(Long id);

}
