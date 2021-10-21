package com.james.loginreg.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.james.loginreg.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    List<User> findAll();
    void deleteById(Long id);
    Optional<User> findById(Long id);
    @SuppressWarnings("unchecked")
	User save(User id);
    
}

