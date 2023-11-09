package io.hugang.demo.generator.dao;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.hugang.demo.generator.entity.DataSourceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源管理
 */
@Mapper
@InterceptorIgnore(tenantLine = "true")
public interface DataSourceDao extends BaseMapper<DataSourceEntity> {

}
