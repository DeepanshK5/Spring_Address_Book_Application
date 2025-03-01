package com.bridgelabz.addressbookapplication.controller;

import com.bridgelabz.addressbookapplication.dto.AddressBookDTO;
import com.bridgelabz.addressbookapplication.model.AddressBookModel;
import com.bridgelabz.addressbookapplication.service.IAddressBookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private final IAddressBookService addressBookService;

    public AddressBookController(IAddressBookService addressBookService) {
        this.addressBookService = addressBookService;
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<AddressBookModel>> getAllContacts() {
        return new ResponseEntity<>(addressBookService.getAllContacts(), HttpStatus.OK);
    }

    @GetMapping("/contacts/{id}")
    public ResponseEntity<AddressBookModel> getContactById(@PathVariable int id) {
        return new ResponseEntity<>(addressBookService.getContactById(id), HttpStatus.OK);
    }

    @PostMapping("/contacts")
    public ResponseEntity<AddressBookModel> addContact(@RequestBody AddressBookDTO dto) {
        return new ResponseEntity<>(addressBookService.addContact(dto), HttpStatus.CREATED);
    }

    @PutMapping("/contacts/{id}")
    public ResponseEntity<AddressBookModel> updateContact(@PathVariable int id, @RequestBody AddressBookDTO dto) {
        return new ResponseEntity<>(addressBookService.updateContact(id, dto), HttpStatus.OK);
    }

    @DeleteMapping("/contacts/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable int id) {
        addressBookService.deleteContact(id);
        return new ResponseEntity<>("Deleted contact with ID: " + id, HttpStatus.OK);
    }
}
