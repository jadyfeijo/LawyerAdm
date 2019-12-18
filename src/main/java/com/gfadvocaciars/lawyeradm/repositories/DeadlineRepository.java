package com.gfadvocaciars.lawyeradm.repositories;

import com.gfadvocaciars.lawyeradm.domain.Deadline;
import com.gfadvocaciars.lawyeradm.domain.Process;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeadlineRepository extends MongoRepository<Deadline,String> {
}
