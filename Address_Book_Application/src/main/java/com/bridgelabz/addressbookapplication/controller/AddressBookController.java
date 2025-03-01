package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // GET Request - Fetch sample contact
    @GetMapping("/contacts")
    public ResponseEntity<AddressBookDTO> getContact() {
        AddressBookDTO dto = new AddressBookDTO("Deepansh Khare", "Bhopal");
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    // POST Request - Add new contact
    @PostMapping("/contacts")
    public ResponseEntity<String> addContact(@RequestBody AddressBookDTO dto) {
        return new ResponseEntity<>("Added contact: " + dto, HttpStatus.CREATED);
    }
}
