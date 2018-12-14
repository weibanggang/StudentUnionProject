package com.wbg.sums.service;

import com.wbg.sums.entity.TypeofMeeting;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeofMeetingService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typeof_meeting
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer tId);
    int count(String status);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typeof_meeting
     *
     * @mbg.generated
     */
    int insert(TypeofMeeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typeof_meeting
     *
     * @mbg.generated
     */
    TypeofMeeting selectByPrimaryKey(Integer tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typeof_meeting
     *
     * @mbg.generated
     */
    List<TypeofMeeting> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table typeof_meeting
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TypeofMeeting record);

    // 根据t_id修改状态int updateStatus(int t_id, String status);
    int updateStatus(@Param("t_id")int t_id, @Param("status")String status);

    //   update TypeofMeeting set status=#{status} where t_id=#{t_id}
    //  根据状态查询全部 List<TypeofMeeting> selectAllStatus(String status);
    List<TypeofMeeting> selectAllStatus(@Param("status")String status);

    //      select * from TypeofMeeting where status={#status}
    //  根据状态查询编号、名称 List<TypeofMeeting> iselectAllStatus(String status);
    List<TypeofMeeting> iselectAllStatus(@Param("status")String status);

    //      select t_id,t_name  from TypeofMeeting where status={#status}
//      根据t_id修改顺序   int updateSort(int t_id, int t_sort);
    int updateSort(@Param("t_id")int t_id,@Param("t_sort") int t_sort);

    //      update TypeofMeeting set t_sort=#{t_sort} where t_id=#{t_id}
//      模糊名称查询 List<TypeofMeeting> selectAllVague(String t_name);
    List<TypeofMeeting> selectAllVague(@Param("t_name") String t_name);
//      select *  from TypeofMeeting  where  t_name like  concat('%',#{ t_name},'%')

}
