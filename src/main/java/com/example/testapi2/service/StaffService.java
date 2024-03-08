package com.example.testapi2.service;

import com.example.testapi2.model.Staff;
import com.example.testapi2.repository.IStaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService implements IStaffService {

    @Autowired
    private IStaffRepo iStaffRepo;
    @Override
    public void save(Staff staff) {
        iStaffRepo.save(staff);
    }

    @Override
    public Optional<Staff> findById(int id) {
        return iStaffRepo.findById(id);
    }

    @Override
    public Page<Staff> findAll(Pageable pageable) {
        return iStaffRepo.findAll(pageable);
    }

    @Override
    public void delete(Staff staff) {
        iStaffRepo.delete(staff);
    }
}
