package com.alienators.SpringDataJpa2.service;

import java.util.List;
import java.util.Optional;

import com.alienators.SpringDataJpa2.dao.Vaccine;

public interface IVaccineService 
{
    public String registerVaccineInfo(Vaccine vaccineInfo);
    public Iterable<Vaccine> registerMultipleVaccines(Iterable<Vaccine> vaccines);
    public Long getVaccineCount();
    public Boolean checkAvailability(Integer id);
    public Iterable<Vaccine> getAllVaccinesInfo();
    public Iterable<Vaccine> getAllVaccinesSpecific(Iterable<Integer> ids);
    public Optional<Vaccine> getVaccineById(Integer id);
    public String removeVaccineById(Integer id);
    public String removeVaccinesByIds(List<Integer> ids);
    public String removeVaccineUsingVaccineObj(Vaccine vaccine);
}
