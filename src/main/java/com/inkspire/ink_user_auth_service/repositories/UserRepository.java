package com.inkspire.ink_user_auth_service.repositories;

import com.inkspire.ink_user_auth_service.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
}
