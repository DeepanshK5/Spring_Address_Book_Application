package com.bridgelabz.addressbook.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressBookModel {
    private int id;
    private String name;
    private String address;

    public AddressBookModel(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
