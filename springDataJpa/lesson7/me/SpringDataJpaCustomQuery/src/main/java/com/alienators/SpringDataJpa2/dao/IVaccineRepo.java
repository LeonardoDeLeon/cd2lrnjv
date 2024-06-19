package com.alienators.SpringDataJpa2.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.alienators.SpringDataJpa2.view.ResultView1;
import com.alienators.SpringDataJpa2.view.View;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> 
{
    // @Query("from vaccine where vaccineCompany=:company")
    // public List<Vaccine> searchByVaccineCompanyName(String company);

    @Query("from Vaccine where vaccineCompany=:company")
    public List<Vaccine> searchByVaccineCompanyName(@Param("company") String c);

    @Query("from Vaccine where vaccineCompany in(:comp1,:comp2)")
    public List<Vaccine> searchByVaccineCompanyName(String comp1, String comp2);

    @Query("select vaccineName,vaccineCompany from Vaccine where cost between :minP and :maxP")
    public List<String> searchByVaccinePriceRange(Integer minP, Integer maxP); 

    @Query("select vaccineCompany, cost from Vaccine where vaccineName in (:vac1, :vac2)")
    public List<Object[]> searchVaccineInfoByVaccineName(String vac1, String vac2);

    @Transactional
    @Modifying
    @Query("update Vaccine set cost=:newCost where vaccineName=:vac")
    public int updatePriceOfByVaccineName(Integer newCost,String vac);

    @Transactional
    @Modifying
    @Query("delete from Vaccine where cost between :minP and :maxP")
    public int deleteByVaccinePriceRange(Integer minP,Integer maxP);

    @Transactional
    @Modifying
    @Query(value="insert into vaccine_info(`id`,`vaccine_name`,`vaccine_company`,`cost`) values(?,?,?,?) ", nativeQuery=true)
    public int insertVaccineDetails(Integer id, String vaccineName, String vaccineCompany, Integer cost);
}
