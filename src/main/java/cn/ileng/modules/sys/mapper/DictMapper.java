package cn.ileng.modules.sys.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.ileng.modules.sys.entity.Dict;

public interface DictMapper extends BaseMapper<Dict> {
	List<Dict> selectDictList();
}