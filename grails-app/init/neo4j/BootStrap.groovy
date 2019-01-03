package neo4j

import org.grails.datastore.mapping.core.Session

import com.example.ContactInformation
import com.example.Person
import com.example.User

class BootStrap {

    def init = { servletContext ->
        Person.withNewSession { Session session ->
            Person.withTransaction {
                User.findByUsername('adminTest') ?: new User(username: 'adminTest', password: 'admin').save(flush: true)
            }

            Person.withTransaction {
                User user = User.findByUsername('adminTest')
                user.updatedBy = user
                user.save(flush: true)

                Person person

                if (Person.count() < Person.TOTAL) {
                    (1..Person.TOTAL).each { num ->
                        person = new Person(name: "person-${num}",
                                            lastName: "lastName-${num}",
                                            birthDate: new Date(),
                                            contactInformation: new ContactInformation(
                                                email: "mail-${num}@mail.com",
                                                phoneNumber: "+5491156${num}"))
                        person.updatedBy = user
                        person.save()

                        log.debug("persona ${person.name} creada - id ${person.id}")

                        if (num % 5 == 0) {
                            session.flush()
                        }
                    }
                }
            }

        }
    }

    def destroy = {
    }
}
