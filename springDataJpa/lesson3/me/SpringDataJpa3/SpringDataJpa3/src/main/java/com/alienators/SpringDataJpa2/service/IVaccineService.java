package com.alienators.SpringDataJpa2.service;


import java.util.List;

import com.alienators.SpringDataJpa2.dao.Vaccine;

public interface IVaccineService 
{
    public Iterable<Vaccine> fetchDetails(boolean status, String... properties);
    public List<Vaccine> fetchDetails(int pgNo, int pgSize, boolean status, String... properties);

    public void fetchDetailsPagination(int pageSize);
}
