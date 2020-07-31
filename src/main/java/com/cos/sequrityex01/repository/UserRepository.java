package com.cos.sequrityex01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.sequrityex01.model.User;

//JpaRepository 를 상속하면 자동 컴포넌트 스캔됨
public interface UserRepository extends JpaRepository<User, Integer>{
	
	//JPA naming전략
	// SELECT * FROM user WHERE username = 1?
	User findByUsername(String username);
}
	

	

	

