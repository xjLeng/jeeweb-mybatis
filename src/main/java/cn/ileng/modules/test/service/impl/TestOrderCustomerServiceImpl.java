package cn.ileng.modules.test.service.impl;

import cn.ileng.core.common.service.impl.CommonServiceImpl;
import cn.ileng.modules.test.mapper.TestOrderCustomerMapper;
import cn.ileng.modules.test.entity.TestOrderCustomer;
import cn.ileng.modules.test.service.ITestOrderCustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: 客户信息
 * @Description: 客户信息
 * @author xuejian
 * @date 2017-08-16 15:43:11
 * @version V1.0
 *
 */
@Transactional
@Service("testOrderCustomerService")
public class TestOrderCustomerServiceImpl  extends CommonServiceImpl<TestOrderCustomerMapper,TestOrderCustomer> implements  ITestOrderCustomerService {

}
