package cn.ileng.modules.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.ileng.core.common.controller.BaseCRUDController;
import cn.ileng.core.model.AjaxJson;
import cn.ileng.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.ileng.core.utils.JeewebPropertiesUtil;
import cn.ileng.modules.sys.entity.UserOnline;
import cn.ileng.modules.sys.security.shiro.session.mgt.OnlineSession;
import cn.ileng.modules.sys.security.shiro.session.mgt.eis.OnlineSessionDAO;
import cn.ileng.modules.sys.service.IUserOnlineService;

/**
 * @Title: 在线用户
 * @Description: 在线用户
 * @author ileng
 * @date 2017-05-15 08:18:21
 * @version V1.0
 *
 */
@Controller
@RequestMapping(value = "${admin.url.prefix}/sys/online")
@RequiresPathPermission("sys:online")
public class UserOnlineController extends BaseCRUDController<UserOnline, String> {

	@Autowired
	private IUserOnlineService userOnlineService;
	@Autowired
	private OnlineSessionDAO onlineSessionDAO;

	public UserOnlineController() {
	}

	@RequestMapping("/forceLogout")
	@ResponseBody
	public AjaxJson forceLogout(@RequestParam(value = "ids") String[] ids) {
		AjaxJson ajaxJson = new AjaxJson();
		ajaxJson.setMsg("强制退出成功");
		if (JeewebPropertiesUtil.getProperties().getBoolean("demoMode")) {
			ajaxJson.fail("演示模式，不允许强制退出用户！");
			return ajaxJson;
		}
		for (String id : ids) {
			UserOnline online = userOnlineService.selectById(id);
			if (online == null) {
				continue;
			}
			OnlineSession onlineSession = (OnlineSession) onlineSessionDAO.readSession(online.getId());
			if (onlineSession == null) {
				continue;
			}
			onlineSession.setStatus(OnlineSession.OnlineStatus.force_logout);
			online.setStatus(OnlineSession.OnlineStatus.force_logout.toString());
			userOnlineService.insertOrUpdate(online);
		}
		return ajaxJson;
	}

}
