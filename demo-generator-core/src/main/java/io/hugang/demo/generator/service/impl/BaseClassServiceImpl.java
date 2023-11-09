package io.hugang.demo.generator.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.hugang.demo.generator.common.page.PageResult;
import io.hugang.demo.generator.common.query.Query;
import io.hugang.demo.generator.common.service.impl.BaseServiceImpl;
import io.hugang.demo.generator.dao.BaseClassDao;
import io.hugang.demo.generator.entity.BaseClassEntity;
import io.hugang.demo.generator.service.BaseClassService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 基类管理
 */
@Service
public class BaseClassServiceImpl extends BaseServiceImpl<BaseClassDao, BaseClassEntity> implements BaseClassService {

    @Override
    public PageResult<BaseClassEntity> page(Query query) {
        IPage<BaseClassEntity> page = baseMapper.selectPage(
                getPage(query), getWrapper(query)
        );

        return new PageResult<>(page.getRecords(), page.getTotal());
    }

    @Override
    public List<BaseClassEntity> getList() {
        return baseMapper.selectList(null);
    }

    @Override
    public boolean save(BaseClassEntity entity) {
        entity.setCreateTime(new Date());
        return super.save(entity);
    }
}
