package com.bridgelabz.addressbookapplication.service;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.addressbookapplication.model.AddressBookModel;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookModel> getAllContacts();
    AddressBookModel getContactById(int id);
    AddressBookModel addContact(AddressBookDTO dto);
    AddressBookModel updateContact(int id, AddressBookDTO dto);
    void deleteContact(int id);
}
