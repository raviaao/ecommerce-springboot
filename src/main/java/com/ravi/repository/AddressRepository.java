package com.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
