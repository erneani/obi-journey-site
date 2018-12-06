package obi.journey.site

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class GerenteServiceSpec extends Specification {

    GerenteService gerenteService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Gerente(...).save(flush: true, failOnError: true)
        //new Gerente(...).save(flush: true, failOnError: true)
        //Gerente gerente = new Gerente(...).save(flush: true, failOnError: true)
        //new Gerente(...).save(flush: true, failOnError: true)
        //new Gerente(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //gerente.id
    }

    void "test get"() {
        setupData()

        expect:
        gerenteService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Gerente> gerenteList = gerenteService.list(max: 2, offset: 2)

        then:
        gerenteList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        gerenteService.count() == 5
    }

    void "test delete"() {
        Long gerenteId = setupData()

        expect:
        gerenteService.count() == 5

        when:
        gerenteService.delete(gerenteId)
        sessionFactory.currentSession.flush()

        then:
        gerenteService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Gerente gerente = new Gerente()
        gerenteService.save(gerente)

        then:
        gerente.id != null
    }
}
