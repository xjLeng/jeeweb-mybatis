package cn.jeeweb.modules.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.jeeweb.core.common.controller.BaseCRUDController;
import cn.jeeweb.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.jeeweb.modules.test.entity.TestOrderTicket;

/**   
 * @Title: 机票信息
 * @Description: 机票信息
 * @author xuejian
 * @date 2017-08-06 17:44:09
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/test/testorderticket")
@RequiresPathPermission("test:testorderticket")
public class TestOrderTicketController extends BaseCRUDController<TestOrderTicket, String> {

}
