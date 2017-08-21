package cn.ileng.modules.codegen.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.core.query.wrapper.EntityWrapper;
import cn.ileng.modules.codegen.entity.Column;
import cn.ileng.modules.codegen.mapper.ColumnMapper;
import cn.ileng.modules.codegen.service.IColumnService;

@Transactional
@Service("columnService")
public class ColumnServiceImpl extends CommonServiceImpl<ColumnMapper, Column> implements IColumnService {

	@Override
	public List<Column> selectListByTableId(String tableId) {
		EntityWrapper<Column> columnWrapper = new EntityWrapper<Column>(Column.class);
		columnWrapper.eq("table.id", tableId);
		columnWrapper.orderBy("sort");
		List<Column> oldColumnList = selectList(columnWrapper);
		return oldColumnList;
	}

}
