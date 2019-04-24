package com.cs.cloud.dao;

import com.cs.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long>{
}
