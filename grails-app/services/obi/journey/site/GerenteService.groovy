package obi.journey.site

import grails.gorm.services.Service

@Service(Gerente)
interface GerenteService {

    Gerente get(Serializable id)

    List<Gerente> list(Map args)

    Long count()

    void delete(Serializable id)

    Gerente save(Gerente gerente)

}