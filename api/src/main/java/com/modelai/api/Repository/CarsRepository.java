package com.modelai.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelai.api.Model.CarsModel;

public interface CarsRepository extends JpaRepository<CarsModel, Long> {

}
