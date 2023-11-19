package io.stemys.jpaprojection.person

import io.stemys.jpaprojection.person.repo.PersonDynamicProjectionRepository
import io.stemys.jpaprojection.person.repo.PersonProjectionRepository
import io.stemys.jpaprojection.person.repo.PersonRepository
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@ResponseBody
class PersonController(
        val personRepository: PersonRepository,
        val personProjectionRepository: PersonProjectionRepository,
        val personDynamicProjectionRepository: PersonDynamicProjectionRepository,
        val personMapper: PersonMapper
) {
    @GetMapping("/persons")
    @Transactional(readOnly = true)
    fun persons(): Any {

        return personRepository.findByLastname("doe").map { p -> personMapper.toPerson(p) }

//        return personRepository.findByLastname("doe").map { p -> personMapper.toPersonWithAddress(p) }

//        return personRepository.findByLastnameWithAddress("doe").map { p -> personMapper.toPersonWithAddress(p) };

//        return personProjectionRepository.findByLastname("doe");

//        return personDynamicProjectionRepository.findByLastname("doe", PersonEntity::class.java).map { p -> personMapper.toPerson(p) }

//        return personDynamicProjectionRepository.findByLastname("doe", NameOnly::class.java)

//        return personDynamicProjectionRepository.findByLastname("doe", PersonWithAddress::class.java)

//        return personDynamicProjectionRepository.findByLastname("doe", PersonWithAddressSummary::class.java)

//        return personDynamicProjectionRepository.findAllBy(Pageable.ofSize(2), PersonWithAddressSummary::class.java)
    }
}