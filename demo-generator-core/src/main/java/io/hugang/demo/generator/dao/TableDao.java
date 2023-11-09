package io.hugang.demo.generator.dao;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.hugang.demo.generator.entity.TableEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据表
 */
@Mapper
@InterceptorIgnore(tenantLine = "true")
public interface TableDao extends BaseMapper<TableEntity> {

}
