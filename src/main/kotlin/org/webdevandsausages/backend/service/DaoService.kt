package org.webdevandsausages.backend.service

import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct
import kotlin.reflect.KClass

@Service
class DaoService<K : Any> {
    @Autowired
    lateinit var ctx: DSLContext

    val daoMap = HashMap<KClass<K>, Any>()

    @PostConstruct
    fun populateDaoMap() {

    }

}