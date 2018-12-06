package obi.journey.site

import grails.gorm.services.Service

@Service(Estagio)
interface EstagioService {

    Estagio get(Serializable id)

    List<Estagio> list(Map args)

    Long count()

    void delete(Serializable id)

    Estagio save(Estagio estagio)

}