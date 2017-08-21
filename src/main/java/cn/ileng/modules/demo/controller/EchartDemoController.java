package cn.ileng.modules.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ileng.core.common.controller.BaseController;

/**
 *
 * All rights Reserved, Designed By www.ileng.cn
 *
 * @title: FormDemoController.java
 * @package cn.ileng.modules.demo.controller
 * @description: 统计报表DEMO
 * @author: ileng
 * @date: 2017年5月18日 下午6:17:24
 * @version V1.0
 * @copyright: 2017 www.ileng.cn Inc. All rights reserved.
 *
 */

@Controller
@RequestMapping("${admin.url.prefix}/demo/echart")
public class EchartDemoController extends BaseController {

	/**
	 *
	 * @title: echart
	 * @description: 统计
	 * @return
	 * @return: String
	 */
	@RequestMapping("/index")
	public String echart() {
		return display("index");
	}

}
