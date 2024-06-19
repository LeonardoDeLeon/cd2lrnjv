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
    public List<Vaccine> fetchByVaccineCompanyName(String c) {
        return repo.searchByVaccineCompanyName(c);
    }

    @Override
    public List<Vaccine> fetchByVaccineCompanyName(String comp1, String comp2) {
        return repo.searchByVaccineCompanyName(comp1,comp2);
    }

    @Override
    public List<String> fetchByVaccinePriceRange(Integer minP, Integer maxP) {
        return repo.searchByVaccinePriceRange(minP,maxP);
    }

    @Override
    public List<Object[]> fetchVaccineInfoByVaccineName(String vac1, String vac2) {
        return repo.searchVaccineInfoByVaccineName(vac1,vac2);
    }

    @Override
    public int updateThePriceOfByVaccineName(Integer newCost, String vac) {
        return repo.updatePriceOfByVaccineName(newCost, vac);
    }

    @Override
    public int deleteTheByVaccinePriceRange(Integer minP, Integer maxP) {
        return repo.deleteByVaccinePriceRange(minP, maxP);
    }

    @Override
    public int insertVaccineInfo(Integer id, String vaccineName, String vaccineCompany, Integer cost) {
        return repo.insertVaccineDetails(id, vaccineName, vaccineCompany, cost);
    }

}
