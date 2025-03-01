package com.bridgelabz.addressbookapplication.repository;

import com.bridgelabz.addressbookapplication.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookModel, Integer> {
}
