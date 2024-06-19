package com.alienators.SpringDataJpa2.service;


import java.util.List;

import com.alienators.SpringDataJpa2.dao.Vaccine;

public interface IVaccineService 
{
    public List<Vaccine> searchByGivenVaccineInfo(Vaccine vaccine, boolean status, String... args);
    public Vaccine searchVaccineById(Integer id);
    public List<Vaccine> searchVaccineByObj(Vaccine vaccine);
    public String removeVaccineInfoByIds(Iterable<Integer> ids);
}
