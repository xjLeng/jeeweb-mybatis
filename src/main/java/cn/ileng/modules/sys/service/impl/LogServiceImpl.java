package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.Log;
import cn.ileng.modules.sys.mapper.LogMapper;
import cn.ileng.modules.sys.service.ILogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;

@Transactional
@Service("logService")
public class LogServiceImpl extends CommonServiceImpl<LogMapper,Log> implements ILogService {
	@Override
	public Page<Log> selectPage(Page<Log> page, Wrapper<Log> wrapper) {
		wrapper.eq("1", "1");
		page.setRecords(baseMapper.selectLogPage(page, wrapper));
		return page;
	}
}
