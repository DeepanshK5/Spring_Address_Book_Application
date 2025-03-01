package com.bridgelabz.addressbookapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // GET Request - Fetch all contacts
    @GetMapping("/contacts")
    public ResponseEntity<String> getAllContacts() {
        return new ResponseEntity<>("Fetching all contacts", HttpStatus.OK);
    }

    // GET Request - Fetch contact by ID
    @GetMapping("/contacts/{id}")
    public ResponseEntity<String> getContactById(@PathVariable int id) {
        return new ResponseEntity<>("Fetching contact with ID: " + id, HttpStatus.OK);
    }

    // POST Request - Add new contact
    @PostMapping("/contacts")
    public ResponseEntity<String> addContact() {
        return new ResponseEntity<>("Adding new contact", HttpStatus.CREATED);
    }

    // PUT Request - Update contact by ID
    @PutMapping("/contacts/{id}")
    public ResponseEntity<String> updateContact(@PathVariable int id) {
        return new ResponseEntity<>("Updating contact with ID: " + id, HttpStatus.OK);
    }

    // DELETE Request - Delete contact by ID
    @DeleteMapping("/contacts/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable int id) {
        return new ResponseEntity<>("Deleting contact with ID: " + id, HttpStatus.OK);
    }
}
