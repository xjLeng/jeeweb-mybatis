package cn.ileng.modules.test.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.test.mapper.TestOrderTicketMapper;
import cn.ileng.modules.test.entity.TestOrderTicket;
import cn.ileng.modules.test.service.ITestOrderTicketService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: 机票信息
 * @Description: 机票信息
 * @author xuejian
 * @date 2017-08-16 15:43:11
 * @version V1.0
 *
 */
@Transactional
@Service("testOrderTicketService")
public class TestOrderTicketServiceImpl  extends CommonServiceImpl<TestOrderTicketMapper,TestOrderTicket> implements  ITestOrderTicketService {

}
