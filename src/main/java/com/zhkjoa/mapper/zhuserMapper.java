package com.zhkjoa.mapper;

import com.zhkjoa.model.zhuser;
import com.zhkjoa.model.zhuserExample;
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

public interface zhuserMapper {
    @SelectProvider(type=zhuserSqlProvider.class, method="countByExample")
    long countByExample(zhuserExample example);

    @DeleteProvider(type=zhuserSqlProvider.class, method="deleteByExample")
    int deleteByExample(zhuserExample example);

    @Delete({
        "delete from zhuser",
        "where zh_id = #{zhId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer zhId);

    @Select({
            "select",
            "zh_id, zh_username, zh_password, zh_department, zh_name, zh_email, zh_sex, zh_state",
            "from zhuser",
            "where zh_username = #{zhId,jdbcType=CHAR}"
    })
    @Results({
            @Result(column="zh_id", property="zhId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="zh_username", property="zhUsername", jdbcType=JdbcType.CHAR),
            @Result(column="zh_password", property="zhPassword", jdbcType=JdbcType.CHAR),
            @Result(column="zh_department", property="zhDepartment", jdbcType=JdbcType.CHAR),
            @Result(column="zh_name", property="zhName", jdbcType=JdbcType.CHAR),
            @Result(column="zh_email", property="zhEmail", jdbcType=JdbcType.CHAR),
            @Result(column="zh_sex", property="zhSex", jdbcType=JdbcType.CHAR),
            @Result(column="zh_state", property="zhState", jdbcType=JdbcType.INTEGER)
    })
    zhuser selectByUsername(String zhUsername);

    @Select({
            "select",
            "zh_id, zh_username, zh_password, zh_department, zh_name, zh_email, zh_sex, zh_state",
            "from zhuser"
    })
    @Results({
            @Result(column="zh_id", property="zhId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="zh_username", property="zhUsername", jdbcType=JdbcType.CHAR),
            @Result(column="zh_password", property="zhPassword", jdbcType=JdbcType.CHAR),
            @Result(column="zh_department", property="zhDepartment", jdbcType=JdbcType.CHAR),
            @Result(column="zh_name", property="zhName", jdbcType=JdbcType.CHAR),
            @Result(column="zh_email", property="zhEmail", jdbcType=JdbcType.CHAR),
            @Result(column="zh_sex", property="zhSex", jdbcType=JdbcType.CHAR),
            @Result(column="zh_state", property="zhState", jdbcType=JdbcType.INTEGER)
    })
    List<zhuser> queryAll();

    @Insert({
        "insert into zhuser (zh_id, zh_username, ",
        "zh_password, zh_department, ",
        "zh_name, zh_email, zh_sex, ",
        "zh_state)",
        "values (#{zhId,jdbcType=INTEGER}, #{zhUsername,jdbcType=CHAR}, ",
        "#{zhPassword,jdbcType=CHAR}, #{zhDepartment,jdbcType=CHAR}, ",
        "#{zhName,jdbcType=CHAR}, #{zhEmail,jdbcType=CHAR}, #{zhSex,jdbcType=CHAR}, ",
        "#{zhState,jdbcType=INTEGER})"
    })
    int insert(zhuser record);

    @InsertProvider(type=zhuserSqlProvider.class, method="insertSelective")
    int insertSelective(zhuser record);

    @SelectProvider(type=zhuserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="zh_id", property="zhId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="zh_username", property="zhUsername", jdbcType=JdbcType.CHAR),
        @Result(column="zh_password", property="zhPassword", jdbcType=JdbcType.CHAR),
        @Result(column="zh_department", property="zhDepartment", jdbcType=JdbcType.CHAR),
        @Result(column="zh_name", property="zhName", jdbcType=JdbcType.CHAR),
        @Result(column="zh_email", property="zhEmail", jdbcType=JdbcType.CHAR),
        @Result(column="zh_sex", property="zhSex", jdbcType=JdbcType.CHAR),
        @Result(column="zh_state", property="zhState", jdbcType=JdbcType.INTEGER)
    })
    List<zhuser> selectByExample(zhuserExample example);

    @Select({
        "select",
        "zh_id, zh_username, zh_password, zh_department, zh_name, zh_email, zh_sex, zh_state",
        "from zhuser",
        "where zh_id = #{zhId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="zh_id", property="zhId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="zh_username", property="zhUsername", jdbcType=JdbcType.CHAR),
        @Result(column="zh_password", property="zhPassword", jdbcType=JdbcType.CHAR),
        @Result(column="zh_department", property="zhDepartment", jdbcType=JdbcType.CHAR),
        @Result(column="zh_name", property="zhName", jdbcType=JdbcType.CHAR),
        @Result(column="zh_email", property="zhEmail", jdbcType=JdbcType.CHAR),
        @Result(column="zh_sex", property="zhSex", jdbcType=JdbcType.CHAR),
        @Result(column="zh_state", property="zhState", jdbcType=JdbcType.INTEGER)
    })
    zhuser selectByPrimaryKey(Integer zhId);

    @UpdateProvider(type=zhuserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") zhuser record, @Param("example") zhuserExample example);

    @UpdateProvider(type=zhuserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") zhuser record, @Param("example") zhuserExample example);

    @UpdateProvider(type=zhuserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(zhuser record);

    @Update({
        "update zhuser",
        "set zh_username = #{zhUsername,jdbcType=CHAR},",
          "zh_password = #{zhPassword,jdbcType=CHAR},",
          "zh_department = #{zhDepartment,jdbcType=CHAR},",
          "zh_name = #{zhName,jdbcType=CHAR},",
          "zh_email = #{zhEmail,jdbcType=CHAR},",
          "zh_sex = #{zhSex,jdbcType=CHAR},",
          "zh_state = #{zhState,jdbcType=INTEGER}",
        "where zh_id = #{zhId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(zhuser record);
}