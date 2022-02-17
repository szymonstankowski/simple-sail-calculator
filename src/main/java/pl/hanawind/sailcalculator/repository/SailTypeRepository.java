package pl.hanawind.sailcalculator.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.hanawind.sailcalculator.sailattribute.SailType;

import java.util.List;
import java.util.Optional;


public interface SailTypeRepository extends JpaRepository<SailType, Long> {




}
