package com.bridgelabz.addressbookapplication.service;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.addressbookapplication.model.AddressBookModel;
import com.bridgelabz.addressbookapplication.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Override
    public List<AddressBookModel> getAllContacts() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookModel getContactById(int id) {
        return addressBookRepository.findById(id).orElse(null);
    }

    @Override
    public AddressBookModel addContact(AddressBookDTO dto) {
        AddressBookModel newContact = new AddressBookModel(dto.getName(), dto.getAddress());
        return addressBookRepository.save(newContact);
    }

    @Override
    public AddressBookModel updateContact(int id, AddressBookDTO dto) {
        AddressBookModel contact = getContactById(id);
        if (contact != null) {
            contact.setName(dto.getName());
            contact.setAddress(dto.getAddress());
            return addressBookRepository.save(contact);
        }
        return null;
    }

    @Override
    public void deleteContact(int id) {
        addressBookRepository.deleteById(id);
    }
}
