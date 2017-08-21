package cn.ileng.modules.sys.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.sys.entity.UserLastOnline;
import cn.ileng.modules.sys.mapper.UserLastOnlineMapper;
import cn.ileng.modules.sys.service.IUserLastOnlineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: 最后在线情况
 * @Description: 最后在线情况
 * @author ileng
 * @date 2017-05-15 08:18:21
 * @version V1.0
 *
 */
@Transactional
@Service("userLastOnlineService")
public class UserLastOnlineServiceImpl  extends CommonServiceImpl<UserLastOnlineMapper,UserLastOnline> implements  IUserLastOnlineService {

}
