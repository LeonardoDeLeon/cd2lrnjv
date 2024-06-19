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

@Service
public class VaccineServiceImpl implements IVaccineService
{
    @Autowired
    private IVaccineRepo repo;

    @Override
    public List<Vaccine> fetchByCost(Integer cost) {
        return repo.findByCost(cost);
    }

    @Override
    public List<Vaccine> fetchByVaccineCompany(String companyName) {
        return repo.findByVaccineCompanyIs(companyName);
        // return repo.findByVaccineCompany(companyName);
    }

    @Override
    public List<Vaccine> fetchByCostLessThan(Integer cost) {
        return repo.findByCostLessThan(cost);
    }

    @Override
    public List<Vaccine> fetchByCostBetween(Integer startingCost, Integer endingCost) {
        return repo.findByCostBetween(startingCost, endingCost);
    }

    @Override
    public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> vaccines, Integer startingCost, Integer endingCost) {
        return repo.findByVaccineNameInAndCostBetween(vaccines, startingCost, endingCost);
    }
}
