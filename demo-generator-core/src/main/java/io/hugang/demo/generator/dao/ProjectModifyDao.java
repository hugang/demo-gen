package io.hugang.demo.generator.dao;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import io.hugang.demo.generator.common.dao.BaseDao;
import io.hugang.demo.generator.entity.ProjectModifyEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 项目名变更
 */
@Mapper
@InterceptorIgnore(tenantLine = "true")
public interface ProjectModifyDao extends BaseDao<ProjectModifyEntity> {

}
