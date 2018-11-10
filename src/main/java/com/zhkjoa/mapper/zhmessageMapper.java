package com.zhkjoa.mapper;

import com.zhkjoa.model.zhmessage;
import com.zhkjoa.model.zhmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface zhmessageMapper {
    @SelectProvider(type=zhmessageSqlProvider.class, method="countByExample")
    long countByExample(zhmessageExample example);

    @DeleteProvider(type=zhmessageSqlProvider.class, method="deleteByExample")
    int deleteByExample(zhmessageExample example);

    @Delete({
        "delete from zhmessage",
        "where m_id = #{mId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer mId);

    @Insert({
        "insert into zhmessage (m_id, m_name, ",
        "m_title, m_data, m_time, ",
        "m_department, m_state)",
        "values (#{mId,jdbcType=INTEGER}, #{mName,jdbcType=CHAR}, ",
        "#{mTitle,jdbcType=CHAR}, #{mData,jdbcType=VARCHAR}, #{mTime,jdbcType=CHAR}, ",
        "#{mDepartment,jdbcType=CHAR}, #{mState,jdbcType=INTEGER})"
    })
    int insert(zhmessage record);

    @InsertProvider(type=zhmessageSqlProvider.class, method="insertSelective")
    int insertSelective(zhmessage record);

    @SelectProvider(type=zhmessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="m_id", property="mId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="m_name", property="mName", jdbcType=JdbcType.CHAR),
        @Result(column="m_title", property="mTitle", jdbcType=JdbcType.CHAR),
        @Result(column="m_data", property="mData", jdbcType=JdbcType.VARCHAR),
        @Result(column="m_time", property="mTime", jdbcType=JdbcType.CHAR),
        @Result(column="m_department", property="mDepartment", jdbcType=JdbcType.CHAR),
        @Result(column="m_state", property="mState", jdbcType=JdbcType.INTEGER)
    })
    List<zhmessage> selectByExample(zhmessageExample example);

    @Select({
        "select",
        "m_id, m_name, m_title, m_data, m_time, m_department, m_state",
        "from zhmessage",
        "where m_id = #{mId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="m_id", property="mId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="m_name", property="mName", jdbcType=JdbcType.CHAR),
        @Result(column="m_title", property="mTitle", jdbcType=JdbcType.CHAR),
        @Result(column="m_data", property="mData", jdbcType=JdbcType.VARCHAR),
        @Result(column="m_time", property="mTime", jdbcType=JdbcType.CHAR),
        @Result(column="m_department", property="mDepartment", jdbcType=JdbcType.CHAR),
        @Result(column="m_state", property="mState", jdbcType=JdbcType.INTEGER)
    })
    zhmessage selectByPrimaryKey(Integer mId);

    @UpdateProvider(type=zhmessageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") zhmessage record, @Param("example") zhmessageExample example);

    @UpdateProvider(type=zhmessageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") zhmessage record, @Param("example") zhmessageExample example);

    @UpdateProvider(type=zhmessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(zhmessage record);

    @Update({
        "update zhmessage",
        "set m_name = #{mName,jdbcType=CHAR},",
          "m_title = #{mTitle,jdbcType=CHAR},",
          "m_data = #{mData,jdbcType=VARCHAR},",
          "m_time = #{mTime,jdbcType=CHAR},",
          "m_department = #{mDepartment,jdbcType=CHAR},",
          "m_state = #{mState,jdbcType=INTEGER}",
        "where m_id = #{mId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(zhmessage record);
}