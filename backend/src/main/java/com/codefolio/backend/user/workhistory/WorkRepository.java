package com.codefolio.backend.user.workhistory;

import com.codefolio.backend.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface WorkRepository extends JpaRepository<Work, Long> {
    List<Work> findAllByUsers(Users users);
}
