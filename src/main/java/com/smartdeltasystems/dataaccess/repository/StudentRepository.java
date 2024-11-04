package com.smartdeltasystems.dataaccess.repository;

import com.smartdeltasystems.dataaccess.document.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
