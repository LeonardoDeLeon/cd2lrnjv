package com.alienators.SpringDataJpa2.service;


import java.util.Collection;
import java.util.List;

import com.alienators.SpringDataJpa2.dao.Vaccine;
import com.alienators.SpringDataJpa2.view.ResultView;

public interface IVaccineService 
{

        public List<ResultView> fetchByCostLessThan(Integer cost);

}
