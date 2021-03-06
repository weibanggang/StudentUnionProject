package com.wbg.sums.dao;

import com.wbg.sums.entity.PersonalMeritRecord;
import java.util.List;

public interface PersonalMeritRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table personal_merit_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table personal_merit_record
     *
     * @mbg.generated
     */
    int insert(PersonalMeritRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table personal_merit_record
     *
     * @mbg.generated
     */
    PersonalMeritRecord selectByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table personal_merit_record
     *
     * @mbg.generated
     */
    List<PersonalMeritRecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table personal_merit_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PersonalMeritRecord record);

    //根据部门、时间查询  List<PersonalMeritRecord> selectDidADate(did,date);

}