package com.alienators.SpringDataJpa2.service;


import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.alienators.SpringDataJpa2.dao.Vaccine;
import com.alienators.SpringDataJpa2.view.ResultView1;
import com.alienators.SpringDataJpa2.view.View;

public interface IVaccineService 
{
    public List<Vaccine> fetchByVaccineCompanyName(String c);

    public List<Vaccine> fetchByVaccineCompanyName(String comp1, String comp2);

    public List<String> fetchByVaccinePriceRange(Integer minP, Integer maxP); 

    public List<Object[]> fetchVaccineInfoByVaccineName(String vac1, String vac2);

    public int updateThePriceOfByVaccineName(Integer newCost,String vac);

    public int deleteTheByVaccinePriceRange(Integer minP,Integer maxP);

    public int insertVaccineInfo(Integer id, String vaccineName, String vaccineCompany, Integer cost);

}
