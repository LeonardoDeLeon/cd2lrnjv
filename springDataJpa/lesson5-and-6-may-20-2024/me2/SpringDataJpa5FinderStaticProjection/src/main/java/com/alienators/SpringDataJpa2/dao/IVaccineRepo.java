package com.alienators.SpringDataJpa2.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alienators.SpringDataJpa2.view.ResultView;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> 
{
    public List<ResultView> findByCostLessThan(Integer cost);

}
