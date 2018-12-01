package com.lpod.test.task.sampleprojectwithdocker.repository;

import com.lpod.test.task.sampleprojectwithdocker.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonDaoRest extends PagingAndSortingRepository<Person, Long> {
}
