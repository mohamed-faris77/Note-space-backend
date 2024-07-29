package com.example.Project.Journal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JournalRepository extends JpaRepository<Journal, Long> {
    @Query(nativeQuery = true,value = "select * from Journal  where userID = ?1")
    List<Journal> findByUserID(String userID);
}
