package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.Dict;
import cn.ileng.modules.sys.mapper.DictMapper;
import cn.ileng.modules.sys.service.IDictService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("dictService")
public class DictServiceImpl extends CommonServiceImpl<DictMapper, Dict> implements IDictService {

	@Override
	public List<Dict> selectDictList() {
		return baseMapper.selectDictList();
	}

}
