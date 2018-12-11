package obi.journey.site

import grails.gorm.services.Service

@Service(Gerente_conteudo)
interface Gerente_conteudoService {

    Gerente_conteudo get(Serializable id)

    List<Gerente_conteudo> list(Map args)

    Long count()

    void delete(Serializable id)

    Gerente_conteudo save(Gerente_conteudo gerente_conteudo)

}