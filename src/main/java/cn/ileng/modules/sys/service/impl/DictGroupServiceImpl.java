package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.DictGroup;
import cn.ileng.modules.sys.mapper.DictGroupMapper;
import cn.ileng.modules.sys.service.IDictGroupService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("dictGroupService")
public class DictGroupServiceImpl extends CommonServiceImpl<DictGroupMapper,DictGroup> implements IDictGroupService {
}
