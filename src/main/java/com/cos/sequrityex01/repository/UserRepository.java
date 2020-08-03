package com.cos.sequrityex01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.sequrityex01.model.User;

//JpaRepository 를 상속하면 자동 컴포넌트 스캔됨
public interface UserRepository extends JpaRepository<User, Integer>{
	
	//JPA naming전략
	// SELECT * FROM user WHERE username = 1?
	User findByUsername(String username);
	// SELECT * FROM user WHERE username = 1? AND password = 2?
		// User findByUsernameAndPassword(String username, String password);
		
		// @Query(value = "select * from user", nativeQuery = true)
		// User find마음대로();
}
	

	

	

