package obi.journey.site

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class Gerente_conteudoServiceSpec extends Specification {

    Gerente_conteudoService gerente_conteudoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Gerente_conteudo(...).save(flush: true, failOnError: true)
        //new Gerente_conteudo(...).save(flush: true, failOnError: true)
        //Gerente_conteudo gerente_conteudo = new Gerente_conteudo(...).save(flush: true, failOnError: true)
        //new Gerente_conteudo(...).save(flush: true, failOnError: true)
        //new Gerente_conteudo(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //gerente_conteudo.id
    }

    void "test get"() {
        setupData()

        expect:
        gerente_conteudoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Gerente_conteudo> gerente_conteudoList = gerente_conteudoService.list(max: 2, offset: 2)

        then:
        gerente_conteudoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        gerente_conteudoService.count() == 5
    }

    void "test delete"() {
        Long gerente_conteudoId = setupData()

        expect:
        gerente_conteudoService.count() == 5

        when:
        gerente_conteudoService.delete(gerente_conteudoId)
        sessionFactory.currentSession.flush()

        then:
        gerente_conteudoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Gerente_conteudo gerente_conteudo = new Gerente_conteudo()
        gerente_conteudoService.save(gerente_conteudo)

        then:
        gerente_conteudo.id != null
    }
}
