package org.example.Models.data;

import javax.transaction.Transactional;
import org.example.Models.Search;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface SearchRepository extends CrudRepository<Search, Integer> {

}