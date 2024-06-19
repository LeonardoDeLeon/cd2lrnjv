package com.alienators.SpringDataJpa2.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.alienators.SpringDataJpa2.dao.IVaccineRepo;
import com.alienators.SpringDataJpa2.dao.Vaccine;
import com.alienators.SpringDataJpa2.view.ResultView1;
import com.alienators.SpringDataJpa2.view.View;

@Service
public class VaccineServiceImpl implements IVaccineService
{

    @Autowired
    IVaccineRepo repo;

    @Override
    public <T extends View> List<T> fetchByCostLessThan(Integer cost, Class<T> cls) {
        return repo.findByCostLessThan(cost,cls);
    }




}
