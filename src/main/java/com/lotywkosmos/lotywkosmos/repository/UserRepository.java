package com.lotywkosmos.lotywkosmos.repository;

import com.lotywkosmos.lotywkosmos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getByLoginAndPassword(String login, String password);
}
