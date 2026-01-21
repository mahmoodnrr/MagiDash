package com.mahmoudstore.magidash.api.controller;


import com.mahmoudstore.magidash.api.model.Dashboard;
import com.mahmoudstore.magidash.api.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/dashboards")
public class DashboardController {

    @Autowired
    DashboardRepository repository;

    @GetMapping()
    public List<Dashboard> getAll() {
        return repository.findAll();
    }

}
