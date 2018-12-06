package obi.journey.site

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EstagioServiceSpec extends Specification {

    EstagioService estagioService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Estagio(...).save(flush: true, failOnError: true)
        //new Estagio(...).save(flush: true, failOnError: true)
        //Estagio estagio = new Estagio(...).save(flush: true, failOnError: true)
        //new Estagio(...).save(flush: true, failOnError: true)
        //new Estagio(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //estagio.id
    }

    void "test get"() {
        setupData()

        expect:
        estagioService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Estagio> estagioList = estagioService.list(max: 2, offset: 2)

        then:
        estagioList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        estagioService.count() == 5
    }

    void "test delete"() {
        Long estagioId = setupData()

        expect:
        estagioService.count() == 5

        when:
        estagioService.delete(estagioId)
        sessionFactory.currentSession.flush()

        then:
        estagioService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Estagio estagio = new Estagio()
        estagioService.save(estagio)

        then:
        estagio.id != null
    }
}
