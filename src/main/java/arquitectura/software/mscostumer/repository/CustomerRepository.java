package arquitectura.software.mscostumer.repository;

import arquitectura.software.mscostumer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
