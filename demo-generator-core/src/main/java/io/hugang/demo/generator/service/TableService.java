package io.hugang.demo.generator.service;

import io.hugang.demo.generator.common.page.PageResult;
import io.hugang.demo.generator.common.query.Query;
import io.hugang.demo.generator.common.service.BaseService;
import io.hugang.demo.generator.entity.TableEntity;

/**
 * 数据表
 */
public interface TableService extends BaseService<TableEntity> {

    PageResult<TableEntity> page(Query query);

    TableEntity getByTableName(String tableName);

    void deleteBatchIds(Long[] ids);

    /**
     * 导入表
     *
     * @param datasourceId 数据源ID
     * @param tableName    表名
     */
    void tableImport(Long datasourceId, String tableName);

    /**
     * 同步数据库表
     *
     * @param id 表ID
     */
    void sync(Long id);
}
