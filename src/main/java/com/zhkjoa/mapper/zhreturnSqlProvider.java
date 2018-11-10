package com.zhkjoa.mapper;

import com.zhkjoa.model.zhreturn;
import com.zhkjoa.model.zhreturnExample.Criteria;
import com.zhkjoa.model.zhreturnExample.Criterion;
import com.zhkjoa.model.zhreturnExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class zhreturnSqlProvider {

    public String countByExample(zhreturnExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("zhreturn");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(zhreturnExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("zhreturn");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(zhreturn record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("zhreturn");
        
        if (record.getrId() != null) {
            sql.VALUES("r_id", "#{rId,jdbcType=INTEGER}");
        }
        
        if (record.getrName() != null) {
            sql.VALUES("r_name", "#{rName,jdbcType=CHAR}");
        }
        
        if (record.getrTitle() != null) {
            sql.VALUES("r_title", "#{rTitle,jdbcType=CHAR}");
        }
        
        if (record.getrData() != null) {
            sql.VALUES("r_data", "#{rData,jdbcType=VARCHAR}");
        }
        
        if (record.getrTime() != null) {
            sql.VALUES("r_time", "#{rTime,jdbcType=CHAR}");
        }
        
        if (record.getrState() != null) {
            sql.VALUES("r_state", "#{rState,jdbcType=INTEGER}");
        }
        
        if (record.getrDepartment() != null) {
            sql.VALUES("r_department", "#{rDepartment,jdbcType=CHAR}");
        }
        
        if (record.getrManagername() != null) {
            sql.VALUES("r_managername", "#{rManagername,jdbcType=CHAR}");
        }
        
        if (record.getrReason() != null) {
            sql.VALUES("r_reason", "#{rReason,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(zhreturnExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("r_id");
        } else {
            sql.SELECT("r_id");
        }
        sql.SELECT("r_name");
        sql.SELECT("r_title");
        sql.SELECT("r_data");
        sql.SELECT("r_time");
        sql.SELECT("r_state");
        sql.SELECT("r_department");
        sql.SELECT("r_managername");
        sql.SELECT("r_reason");
        sql.FROM("zhreturn");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        zhreturn record = (zhreturn) parameter.get("record");
        zhreturnExample example = (zhreturnExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("zhreturn");
        
        if (record.getrId() != null) {
            sql.SET("r_id = #{record.rId,jdbcType=INTEGER}");
        }
        
        if (record.getrName() != null) {
            sql.SET("r_name = #{record.rName,jdbcType=CHAR}");
        }
        
        if (record.getrTitle() != null) {
            sql.SET("r_title = #{record.rTitle,jdbcType=CHAR}");
        }
        
        if (record.getrData() != null) {
            sql.SET("r_data = #{record.rData,jdbcType=VARCHAR}");
        }
        
        if (record.getrTime() != null) {
            sql.SET("r_time = #{record.rTime,jdbcType=CHAR}");
        }
        
        if (record.getrState() != null) {
            sql.SET("r_state = #{record.rState,jdbcType=INTEGER}");
        }
        
        if (record.getrDepartment() != null) {
            sql.SET("r_department = #{record.rDepartment,jdbcType=CHAR}");
        }
        
        if (record.getrManagername() != null) {
            sql.SET("r_managername = #{record.rManagername,jdbcType=CHAR}");
        }
        
        if (record.getrReason() != null) {
            sql.SET("r_reason = #{record.rReason,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("zhreturn");
        
        sql.SET("r_id = #{record.rId,jdbcType=INTEGER}");
        sql.SET("r_name = #{record.rName,jdbcType=CHAR}");
        sql.SET("r_title = #{record.rTitle,jdbcType=CHAR}");
        sql.SET("r_data = #{record.rData,jdbcType=VARCHAR}");
        sql.SET("r_time = #{record.rTime,jdbcType=CHAR}");
        sql.SET("r_state = #{record.rState,jdbcType=INTEGER}");
        sql.SET("r_department = #{record.rDepartment,jdbcType=CHAR}");
        sql.SET("r_managername = #{record.rManagername,jdbcType=CHAR}");
        sql.SET("r_reason = #{record.rReason,jdbcType=VARCHAR}");
        
        zhreturnExample example = (zhreturnExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(zhreturn record) {
        SQL sql = new SQL();
        sql.UPDATE("zhreturn");
        
        if (record.getrName() != null) {
            sql.SET("r_name = #{rName,jdbcType=CHAR}");
        }
        
        if (record.getrTitle() != null) {
            sql.SET("r_title = #{rTitle,jdbcType=CHAR}");
        }
        
        if (record.getrData() != null) {
            sql.SET("r_data = #{rData,jdbcType=VARCHAR}");
        }
        
        if (record.getrTime() != null) {
            sql.SET("r_time = #{rTime,jdbcType=CHAR}");
        }
        
        if (record.getrState() != null) {
            sql.SET("r_state = #{rState,jdbcType=INTEGER}");
        }
        
        if (record.getrDepartment() != null) {
            sql.SET("r_department = #{rDepartment,jdbcType=CHAR}");
        }
        
        if (record.getrManagername() != null) {
            sql.SET("r_managername = #{rManagername,jdbcType=CHAR}");
        }
        
        if (record.getrReason() != null) {
            sql.SET("r_reason = #{rReason,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("r_id = #{rId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, zhreturnExample example, boolean includeExamplePhrase) {
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