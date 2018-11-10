package com.zhkjoa.mapper;

import com.zhkjoa.model.zhuser;
import com.zhkjoa.model.zhuserExample.Criteria;
import com.zhkjoa.model.zhuserExample.Criterion;
import com.zhkjoa.model.zhuserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class zhuserSqlProvider {

    public String countByExample(zhuserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("zhuser");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(zhuserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("zhuser");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(zhuser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("zhuser");
        
        if (record.getZhId() != null) {
            sql.VALUES("zh_id", "#{zhId,jdbcType=INTEGER}");
        }
        
        if (record.getZhUsername() != null) {
            sql.VALUES("zh_username", "#{zhUsername,jdbcType=CHAR}");
        }
        
        if (record.getZhPassword() != null) {
            sql.VALUES("zh_password", "#{zhPassword,jdbcType=CHAR}");
        }
        
        if (record.getZhDepartment() != null) {
            sql.VALUES("zh_department", "#{zhDepartment,jdbcType=CHAR}");
        }
        
        if (record.getZhName() != null) {
            sql.VALUES("zh_name", "#{zhName,jdbcType=CHAR}");
        }
        
        if (record.getZhEmail() != null) {
            sql.VALUES("zh_email", "#{zhEmail,jdbcType=CHAR}");
        }
        
        if (record.getZhSex() != null) {
            sql.VALUES("zh_sex", "#{zhSex,jdbcType=CHAR}");
        }
        
        if (record.getZhState() != null) {
            sql.VALUES("zh_state", "#{zhState,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(zhuserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("zh_id");
        } else {
            sql.SELECT("zh_id");
        }
        sql.SELECT("zh_username");
        sql.SELECT("zh_password");
        sql.SELECT("zh_department");
        sql.SELECT("zh_name");
        sql.SELECT("zh_email");
        sql.SELECT("zh_sex");
        sql.SELECT("zh_state");
        sql.FROM("zhuser");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        zhuser record = (zhuser) parameter.get("record");
        zhuserExample example = (zhuserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("zhuser");
        
        if (record.getZhId() != null) {
            sql.SET("zh_id = #{record.zhId,jdbcType=INTEGER}");
        }
        
        if (record.getZhUsername() != null) {
            sql.SET("zh_username = #{record.zhUsername,jdbcType=CHAR}");
        }
        
        if (record.getZhPassword() != null) {
            sql.SET("zh_password = #{record.zhPassword,jdbcType=CHAR}");
        }
        
        if (record.getZhDepartment() != null) {
            sql.SET("zh_department = #{record.zhDepartment,jdbcType=CHAR}");
        }
        
        if (record.getZhName() != null) {
            sql.SET("zh_name = #{record.zhName,jdbcType=CHAR}");
        }
        
        if (record.getZhEmail() != null) {
            sql.SET("zh_email = #{record.zhEmail,jdbcType=CHAR}");
        }
        
        if (record.getZhSex() != null) {
            sql.SET("zh_sex = #{record.zhSex,jdbcType=CHAR}");
        }
        
        if (record.getZhState() != null) {
            sql.SET("zh_state = #{record.zhState,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("zhuser");
        
        sql.SET("zh_id = #{record.zhId,jdbcType=INTEGER}");
        sql.SET("zh_username = #{record.zhUsername,jdbcType=CHAR}");
        sql.SET("zh_password = #{record.zhPassword,jdbcType=CHAR}");
        sql.SET("zh_department = #{record.zhDepartment,jdbcType=CHAR}");
        sql.SET("zh_name = #{record.zhName,jdbcType=CHAR}");
        sql.SET("zh_email = #{record.zhEmail,jdbcType=CHAR}");
        sql.SET("zh_sex = #{record.zhSex,jdbcType=CHAR}");
        sql.SET("zh_state = #{record.zhState,jdbcType=INTEGER}");
        
        zhuserExample example = (zhuserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(zhuser record) {
        SQL sql = new SQL();
        sql.UPDATE("zhuser");
        
        if (record.getZhUsername() != null) {
            sql.SET("zh_username = #{zhUsername,jdbcType=CHAR}");
        }
        
        if (record.getZhPassword() != null) {
            sql.SET("zh_password = #{zhPassword,jdbcType=CHAR}");
        }
        
        if (record.getZhDepartment() != null) {
            sql.SET("zh_department = #{zhDepartment,jdbcType=CHAR}");
        }
        
        if (record.getZhName() != null) {
            sql.SET("zh_name = #{zhName,jdbcType=CHAR}");
        }
        
        if (record.getZhEmail() != null) {
            sql.SET("zh_email = #{zhEmail,jdbcType=CHAR}");
        }
        
        if (record.getZhSex() != null) {
            sql.SET("zh_sex = #{zhSex,jdbcType=CHAR}");
        }
        
        if (record.getZhState() != null) {
            sql.SET("zh_state = #{zhState,jdbcType=INTEGER}");
        }
        
        sql.WHERE("zh_id = #{zhId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, zhuserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}