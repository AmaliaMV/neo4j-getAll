package com.example

import grails.compiler.GrailsCompileStatic

import org.neo4j.driver.v1.StatementResult

@GrailsCompileStatic
class PersonController {

    def index() {
        log.info("Executing index controller ...")
        StatementResult result = Person.executeCypher("MATCH (n:test_Person) RETURN ID(n) as id LIMIT ${Person.TOTAL}")

        List ids = new ArrayList<>(Person.TOTAL)

        while (result.hasNext()) {
            Long id = result.next().get("id").asLong()
            ids.add(id)
        }

        log.info("I got ${ids.size()} ids to retrieve ...")
        List people = Person.getAll(ids)
        log.info("Retrieved ${people.size()} items. Rendering response")
        render people: people, size: people.size()
    }

}
