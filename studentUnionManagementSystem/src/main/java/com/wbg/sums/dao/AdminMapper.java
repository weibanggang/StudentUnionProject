package com.wbg.sums.dao;

import com.wbg.sums.entity.Admin;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer aId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    int insert(Admin record);
    int count(@Param("status")String status);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    Admin selectByPrimaryKey(Integer aId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    List<Admin> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Admin record);

    //    根据a_username修改密码 int updatePassword(String a_username,String a_password);
    int updatePassword(@Param("a_username") String a_username,@Param("a_password") String a_password);

    //    update Admin set a_password=#{a_password} where a_username=#{a_username}
    //    根据a_username判断是否出现过该用户  int selectUserName(String a_username);
    int selectUserName(@Param("a_username") String a_username);

    //    select count(*) from Admin where a_username=#{a_username}
//    根据a_username修改状态    int updateStatus(String a_username,String status);
    int updateStatus(@Param("a_username") String a_username,@Param("status")  String status);

    //    update Admin set status=#{status} where a_username=#{a_username}
//    模糊账号查询编号、账号、状态、备注 List<Admin> selectAllVague(String a_username);
    List<Admin> selectAllVague(@Param("a_username") String a_username);

    //    select * from Admin where  a_username like concat('%',#{a_username},'%')
//    根据状态查询编号、账号、状态、备注  List<Admin> selectAllStatus(String status);
    List<Admin> selectAllStatus(@Param("status")String status);
//    select * from Admin where status=#{status}

}