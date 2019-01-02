package com.example

class ContactInformation {

    String phoneNumber
    String email

    static belongsTo = [Person]

    static constraints = {
    }
}
