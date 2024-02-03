package com.mhv.dbtest.repository.secondary;

import com.mhv.dbtest.entity.secondary.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
