package com.example.PP_3_1_1_Spring_Boot_App.service.impl;

import com.example.PP_3_1_1_Spring_Boot_App.entity.Role;
import com.example.PP_3_1_1_Spring_Boot_App.repository.RoleRepository;
import com.example.PP_3_1_1_Spring_Boot_App.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
