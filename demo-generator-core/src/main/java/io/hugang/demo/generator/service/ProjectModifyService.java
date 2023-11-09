package io.hugang.demo.generator.service;

import io.hugang.demo.generator.common.page.PageResult;
import io.hugang.demo.generator.common.query.Query;
import io.hugang.demo.generator.common.service.BaseService;
import io.hugang.demo.generator.entity.ProjectModifyEntity;

import java.io.IOException;

/**
 * 项目名变更
 */
public interface ProjectModifyService extends BaseService<ProjectModifyEntity> {

    PageResult<ProjectModifyEntity> page(Query query);

    byte[] download(ProjectModifyEntity project) throws IOException;

}
