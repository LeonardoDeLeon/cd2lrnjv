package com.alienators.SpringDataJpa2.service;


import java.util.Collection;
import java.util.List;

import com.alienators.SpringDataJpa2.dao.Vaccine;
import com.alienators.SpringDataJpa2.view.ResultView1;
import com.alienators.SpringDataJpa2.view.View;

public interface IVaccineService 
{
    public <T extends View>List<T> fetchByCostLessThan(Integer cost, Class<T> cls);
}
