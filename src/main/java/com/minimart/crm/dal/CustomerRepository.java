package com.minimart.crm.dal;

import java.util.List;
import com.minimart.crm.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
