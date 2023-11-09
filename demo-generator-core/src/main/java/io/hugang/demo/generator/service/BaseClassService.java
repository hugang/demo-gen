package io.hugang.demo.generator.service;

import io.hugang.demo.generator.common.page.PageResult;
import io.hugang.demo.generator.common.query.Query;
import io.hugang.demo.generator.common.service.BaseService;
import io.hugang.demo.generator.entity.BaseClassEntity;

import java.util.List;

/**
 * 基类管理
 */
public interface BaseClassService extends BaseService<BaseClassEntity> {

    PageResult<BaseClassEntity> page(Query query);

    List<BaseClassEntity> getList();
}
