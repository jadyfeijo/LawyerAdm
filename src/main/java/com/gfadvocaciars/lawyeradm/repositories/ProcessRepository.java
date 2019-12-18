package com.gfadvocaciars.lawyeradm;

import com.gfadvocaciars.lawyeradm.domain.Process;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcessRepository extends MongoRepository<Process,String> {
}
