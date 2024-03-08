package com.example.testapi2.service;


import com.example.testapi2.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IStaffService {
    public void save(Staff staff);

    public Optional<Staff> findById(int id);

    public Page<Staff> findAll(Pageable pageable);


    public void delete(Staff staff);
}
