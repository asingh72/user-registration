package com.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.User;

@Repository
public interface UserRepositoy extends CrudRepository<User, Integer>{
	
	//boolean findByEmail(String email);
	
	@Query("select count(p) = 1 from User p where UPPER(email) = UPPER(?1)")
    boolean findByEmail(String email);
	
//	@Query("update User set archivedAddress = ?1 where id = ?2")
//    void updateArchivedAddress(Address address, int id);

}
