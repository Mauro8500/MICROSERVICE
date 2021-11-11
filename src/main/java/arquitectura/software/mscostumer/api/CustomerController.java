package arquitectura.software.mscostumer.api;

import arquitectura.software.mscostumer.config.CustomerConfig;
import arquitectura.software.mscostumer.entity.Customer;
import arquitectura.software.mscostumer.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/customer")

public class CustomerController{

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerConfig customerConfig;
    
    @RequestMapping(path = "/test",
                    method = RequestMethod.GET)
    public String testCustomer(){
        return "Ms-customer";
    }

    @RequestMapping(path = "/save",
                     method = RequestMethod.POST)
    public Customer saveCustomer(@RequestBody Customer customer){
        System.out.println("Registrando al cliente -->: " + customerConfig.showConfiguration());
       return customerRepository.save(customer);
    }

    @RequestMapping(path = "/all",
                    method = RequestMethod.GET)
    public List<Customer> getAllCustomer(){
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @RequestMapping(
                    method = RequestMethod.GET)
    public Customer getCustomer(@RequestParam Integer customerId) throws Exception{
        Optional<Customer> customerOptional = customerRepository.findById(customerId);
        if(customerOptional.isPresent()){
            Customer customer = customerOptional.get();
            return customer;
        }else{
            throw new Exception("No se encuentra el usuario");
        } 
    }

}