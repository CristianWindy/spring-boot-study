package com.fengtianle.repository;

import com.fengtianle.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);

    @Transactional
    @Modifying
    @Query("update User set userName=?1 where id=?2 ")
    int modifyById(String userName, Long id);

    @Transactional
    @Modifying
    @Query("delete from User where id=?1 ")
    void deleteById(Long id);
}
