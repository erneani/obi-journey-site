package obi.journey.site

import grails.gorm.services.Service

@Service(Caminho)
interface CaminhoService {

    Caminho get(Serializable id)

    List<Caminho> list(Map args)

    Long count()

    void delete(Serializable id)

    Caminho save(Caminho caminho)

}