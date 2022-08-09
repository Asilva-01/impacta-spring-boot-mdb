package com.Asilva01.impactamongodb.repository;




import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Asilva01.impactamongodb.User;

@Repository
public interface UserRpository extends MongoRepository<User, String> {

}
