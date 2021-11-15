package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public interface IEmployeeDao {
    List<Employee> findall();

    Employee insert(@Param("name")String name,@Param("gender") String gender,@Param("birthday") Date birthday,@Param("idCard") String idCard,@Param("wedlock") String wedlock,@Param("nationId") int nationId,@Param("nativePlace") String nativePlace,@Param("politicId") int politicId,@Param("email") String email,@Param("phone") String phone,@Param("address") String address,@Param("departmentId") int departmentId,@Param("jobLevelId") int jobLevelId,@Param("posId") int posId,@Param("engageForm") String engageForm,@Param("tiptopDegree") String tiptopDegree,@Param("specialty") String specialty,@Param("school") String school,@Param("beginDate") Date beginDate,@Param("contractTerm") double contractTerm,@Param("conversionTime") Date conversionTime,@Param("beginContract") Date beginContract,@Param("endContract") Date endContract);

    Employee insert2(@Param("birthday") Date birthday);
}
