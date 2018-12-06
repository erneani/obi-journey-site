package obi.journey.site

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CaminhoServiceSpec extends Specification {

    CaminhoService caminhoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Caminho(...).save(flush: true, failOnError: true)
        //new Caminho(...).save(flush: true, failOnError: true)
        //Caminho caminho = new Caminho(...).save(flush: true, failOnError: true)
        //new Caminho(...).save(flush: true, failOnError: true)
        //new Caminho(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //caminho.id
    }

    void "test get"() {
        setupData()

        expect:
        caminhoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Caminho> caminhoList = caminhoService.list(max: 2, offset: 2)

        then:
        caminhoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        caminhoService.count() == 5
    }

    void "test delete"() {
        Long caminhoId = setupData()

        expect:
        caminhoService.count() == 5

        when:
        caminhoService.delete(caminhoId)
        sessionFactory.currentSession.flush()

        then:
        caminhoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Caminho caminho = new Caminho()
        caminhoService.save(caminho)

        then:
        caminho.id != null
    }
}
