package com.bridgelabz.addressbookapplication.service;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.addressbookapplication.model.AddressBookModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    
    private final List<AddressBookModel> contactList = new ArrayList<>();
    private int contactId = 1;

    @Override
    public List<AddressBookModel> getAllContacts() {
        return contactList;
    }

    @Override
    public AddressBookModel getContactById(int id) {
        return contactList.stream().filter(contact -> contact.getId() == id).findFirst().orElse(null);
    }

    @Override
    public AddressBookModel addContact(AddressBookDTO dto) {
        AddressBookModel newContact = new AddressBookModel(contactId++, dto.getName(), dto.getAddress());
        contactList.add(newContact);
        return newContact;
    }

    @Override
    public AddressBookModel updateContact(int id, AddressBookDTO dto) {
        AddressBookModel contact = getContactById(id);
        if (contact != null) {
            contact.setName(dto.getName());
            contact.setAddress(dto.getAddress());
        }
        return contact;
    }

    @Override
    public void deleteContact(int id) {
        contactList.removeIf(contact -> contact.getId() == id);
    }
}
