package com.dongnao.jack.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dongnao.jack.service.CommonService;
import com.dongnao.jack.service.CommonServiceImpl;
import com.dongnao.jck.bean.ConsultContent;

/**
 * 
 * @ClassName: JckController
 * @Description: 控制器
 * @author: cash
 * @date: 2018年12月18日 上午10:28:33
 */
@Controller
@RestController
public class JckController {
	private static final Logger logger = LoggerFactory.getLogger(JckController.class);

	@Value("${application.hello:Hello jack}")
	private String hello = "";

	@Autowired
	private CommonServiceImpl commonSrevice;

	@RequestMapping(value = { "/", "/index" })
	public String index(Map<String, Object> model) {
		logger.info("method index excute begin ");
		model.put("time", new Date());
		model.put("message", this.hello);
		logger.info("method index excute end ");
		return "index";

	}

	@RequestMapping("/freemarker")
	public String freemarker(Map<String, Object> map) {
		logger.info("method freemarker excute begin");
		map.put("name", "[Angel -- 守护天使]");
		map.put("gender", 1);// gender:性别，1：男；0：女；

		List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
		Map<String, Object> friend = new HashMap<String, Object>();
		friend.put("name", "jack");
		friend.put("age", 30);
		friends.add(friend);
		friend = new HashMap<String, Object>();
		friend.put("name", "jeff");
		friend.put("age", 36);
		friends.add(friend);
		map.put("friends", friends);
		logger.info("method freemarker excute end");
		return "freemarker";
	}

	@RequestMapping("/queryContent")
	public @ResponseBody List<ConsultContent> queryContent() {

		logger.info("查询开始");
		List<ConsultContent> queryContent = commonSrevice.queryContent(new HashMap());
		logger.info("查询结束");
		return queryContent;
	}
}
