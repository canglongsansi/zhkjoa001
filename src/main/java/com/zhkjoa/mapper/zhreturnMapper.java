package com.zhkjoa.mapper;

import com.zhkjoa.model.zhreturn;
import com.zhkjoa.model.zhreturnExample;
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

public interface zhreturnMapper {
    @SelectProvider(type=zhreturnSqlProvider.class, method="countByExample")
    long countByExample(zhreturnExample example);

    @DeleteProvider(type=zhreturnSqlProvider.class, method="deleteByExample")
    int deleteByExample(zhreturnExample example);

    @Delete({
        "delete from zhreturn",
        "where r_id = #{rId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rId);

    @Insert({
        "insert into zhreturn (r_id, r_name, ",
        "r_title, r_data, r_time, ",
        "r_state, r_department, ",
        "r_managername, r_reason)",
        "values (#{rId,jdbcType=INTEGER}, #{rName,jdbcType=CHAR}, ",
        "#{rTitle,jdbcType=CHAR}, #{rData,jdbcType=VARCHAR}, #{rTime,jdbcType=CHAR}, ",
        "#{rState,jdbcType=INTEGER}, #{rDepartment,jdbcType=CHAR}, ",
        "#{rManagername,jdbcType=CHAR}, #{rReason,jdbcType=VARCHAR})"
    })
    int insert(zhreturn record);

    @InsertProvider(type=zhreturnSqlProvider.class, method="insertSelective")
    int insertSelective(zhreturn record);

    @SelectProvider(type=zhreturnSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="r_id", property="rId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="r_name", property="rName", jdbcType=JdbcType.CHAR),
        @Result(column="r_title", property="rTitle", jdbcType=JdbcType.CHAR),
        @Result(column="r_data", property="rData", jdbcType=JdbcType.VARCHAR),
        @Result(column="r_time", property="rTime", jdbcType=JdbcType.CHAR),
        @Result(column="r_state", property="rState", jdbcType=JdbcType.INTEGER),
        @Result(column="r_department", property="rDepartment", jdbcType=JdbcType.CHAR),
        @Result(column="r_managername", property="rManagername", jdbcType=JdbcType.CHAR),
        @Result(column="r_reason", property="rReason", jdbcType=JdbcType.VARCHAR)
    })
    List<zhreturn> selectByExample(zhreturnExample example);

    @Select({
        "select",
        "r_id, r_name, r_title, r_data, r_time, r_state, r_department, r_managername, ",
        "r_reason",
        "from zhreturn",
        "where r_id = #{rId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="r_id", property="rId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="r_name", property="rName", jdbcType=JdbcType.CHAR),
        @Result(column="r_title", property="rTitle", jdbcType=JdbcType.CHAR),
        @Result(column="r_data", property="rData", jdbcType=JdbcType.VARCHAR),
        @Result(column="r_time", property="rTime", jdbcType=JdbcType.CHAR),
        @Result(column="r_state", property="rState", jdbcType=JdbcType.INTEGER),
        @Result(column="r_department", property="rDepartment", jdbcType=JdbcType.CHAR),
        @Result(column="r_managername", property="rManagername", jdbcType=JdbcType.CHAR),
        @Result(column="r_reason", property="rReason", jdbcType=JdbcType.VARCHAR)
    })
    zhreturn selectByPrimaryKey(Integer rId);

    @UpdateProvider(type=zhreturnSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") zhreturn record, @Param("example") zhreturnExample example);

    @UpdateProvider(type=zhreturnSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") zhreturn record, @Param("example") zhreturnExample example);

    @UpdateProvider(type=zhreturnSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(zhreturn record);

    @Update({
        "update zhreturn",
        "set r_name = #{rName,jdbcType=CHAR},",
          "r_title = #{rTitle,jdbcType=CHAR},",
          "r_data = #{rData,jdbcType=VARCHAR},",
          "r_time = #{rTime,jdbcType=CHAR},",
          "r_state = #{rState,jdbcType=INTEGER},",
          "r_department = #{rDepartment,jdbcType=CHAR},",
          "r_managername = #{rManagername,jdbcType=CHAR},",
          "r_reason = #{rReason,jdbcType=VARCHAR}",
        "where r_id = #{rId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(zhreturn record);
}