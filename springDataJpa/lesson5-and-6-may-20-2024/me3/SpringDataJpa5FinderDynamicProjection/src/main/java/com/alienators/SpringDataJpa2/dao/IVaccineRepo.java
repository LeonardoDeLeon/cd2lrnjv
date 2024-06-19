package com.alienators.SpringDataJpa2.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alienators.SpringDataJpa2.view.ResultView1;
import com.alienators.SpringDataJpa2.view.View;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> 
{
    public <T extends View>List<T> findByCostLessThan(Integer cost, Class<T> cls);

}
