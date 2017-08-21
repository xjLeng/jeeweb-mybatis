package cn.ileng.modules.codegen.service;

import java.util.List;
import cn.ileng.core.common.service.ICommonService;
import cn.ileng.modules.codegen.entity.Column;

public interface IColumnService extends ICommonService<Column> {
	List<Column> selectListByTableId(String tableId);
}
