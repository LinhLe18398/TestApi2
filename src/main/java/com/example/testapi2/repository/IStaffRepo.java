package com.example.testapi2.repository;

import com.example.testapi2.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStaffRepo extends JpaRepository<Staff,Integer> {
    List<Staff> findAllByName(String keyword);
}
