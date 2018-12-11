package obi.journey.site

import grails.gorm.services.Service

@Service(Prova)
interface ProvaService {

    Prova get(Serializable id)

    List<Prova> list(Map args)

    Long count()

    void delete(Serializable id)

    Prova save(Prova prova)

}