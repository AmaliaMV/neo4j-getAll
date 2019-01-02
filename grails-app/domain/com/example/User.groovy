package com.example

class User extends BaseDomain {

    String username
    String password

    User manager

    static constraints = {
        manager nullable: true
    }

    static mapping = {
        manager lazy: false
    }
}
