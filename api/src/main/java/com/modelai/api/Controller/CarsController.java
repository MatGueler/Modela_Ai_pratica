package com.modelai.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.modelai.api.Model.CarsModel;
import com.modelai.api.Repository.CarsRepository;
import com.modelai.api.dto.CarsDTO;

@RestController
@RequestMapping("api/cars")
public class CarsController {

    @Autowired
    private CarsRepository repository;

    @GetMapping
    public List<CarsModel> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody CarsDTO req) {

        repository.save(new CarsModel(req));

    }
}
