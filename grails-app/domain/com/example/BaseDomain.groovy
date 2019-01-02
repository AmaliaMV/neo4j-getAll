package com.example

import org.grails.datastore.mapping.model.PersistentEntity

class BaseDomain {

    User updatedBy

    static constraints = {
        updatedBy nullable: true
    }

    static mapping = {
        updatedBy lazy: false, fetch: "eager"
        labels { PersistentEntity pe ->
            "test_${pe.javaClass.simpleName}"
        }
    }

}
