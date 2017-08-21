package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.DataSource;
import cn.ileng.modules.sys.mapper.DataSourceMapper;
import cn.ileng.modules.sys.service.IDataSourceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: 数据源
 * @Description: 数据源
 * @author ileng
 * @date 2017-05-10 12:01:57
 * @version V1.0
 *
 */
@Transactional
@Service("dataSourceService")
public class DataSourceServiceImpl  extends CommonServiceImpl<DataSourceMapper,DataSource> implements  IDataSourceService {

}
