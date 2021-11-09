package com.example.vhrdemo.dao;

import com.example.vhrdemo.entity.Adjustsalary;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface IAdjustsalaryDao {
    Adjustsalary search(@Param("eid") int eid);

    int update(@Param("eid") int eid, @Param("asDate") Date asDate,@Param("beforeSalary") int beforeSalary,@Param("afterSalary") int afterSalary,@Param("reason") String reason,@Param("remark") String remark);

    int insert(@Param("eid") int eid, @Param("asDate") Date asDate,@Param("beforeSalary") int beforeSalary,@Param("afterSalary") int afterSalary,@Param("reason") String reason,@Param("remark") String remark);

    int delete(@Param("eid") int eid);
}
