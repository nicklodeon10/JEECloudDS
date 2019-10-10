/**
 * 
 */
package com.cg.springsecuritypractice.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.springsecuritypractice.dto.User;


/**
 * @author DEVANG
 *
 */
public interface UserRepository extends JpaRepository<User, BigInteger> {

	Optional<User> findByUsername(String username);
	
}
