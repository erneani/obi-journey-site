package obi.journey.site

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProvaServiceSpec extends Specification {

    ProvaService provaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Prova(...).save(flush: true, failOnError: true)
        //new Prova(...).save(flush: true, failOnError: true)
        //Prova prova = new Prova(...).save(flush: true, failOnError: true)
        //new Prova(...).save(flush: true, failOnError: true)
        //new Prova(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //prova.id
    }

    void "test get"() {
        setupData()

        expect:
        provaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Prova> provaList = provaService.list(max: 2, offset: 2)

        then:
        provaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        provaService.count() == 5
    }

    void "test delete"() {
        Long provaId = setupData()

        expect:
        provaService.count() == 5

        when:
        provaService.delete(provaId)
        sessionFactory.currentSession.flush()

        then:
        provaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Prova prova = new Prova()
        provaService.save(prova)

        then:
        prova.id != null
    }
}
