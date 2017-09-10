package com.zc.gui.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.zc.gui.bean.GrInfo;
import com.zc.gui.bean.UiidReq;
import com.zc.gui.bean.UiidResp;

/**
 * test controller
 * 
 * @author zhanchang
 * 
 **/

@Controller
@RequestMapping(value = "/test")
public class TestController {

	private static Logger logger = Logger.getLogger(TestController.class);

/*	@RequestMapping(value = "/querymemberinfo")
	public String queryMemberInfo() {
		logger.info("we begin here");
		return "success";
	}

	@RequestMapping(value = "/getname/{name}/{age}")
	public String getName(@PathVariable("name") String name, @PathVariable("age") String age) {
		logger.info("name is " + name);
		logger.info("age is " + age);
		return "success";
	}*/
	
	
	@ResponseBody
	@RequestMapping(value = "/invoke2")
	public UiidResp getName(@RequestBody String requestBody) {
		logger.info(requestBody);
		String[] a = requestBody.split("&");
//		for (String x:a) {
//			String x1 = x.split("=")[0];
//			String x2 = x.split("=")[1];
//			if("searchTxt".equals(x1)) {
//				logger.info(x1);
				UiidResp uiidResp = new UiidResp();
				uiidResp.setSuccess(true);
				uiidResp.setMessage("good");
				List list = new ArrayList<GrInfo>();
				
				GrInfo grInfo = new GrInfo();
				grInfo.setGrId("339781329333780480");
				grInfo.setGrGrantoraddr("0x000003");
				grInfo.setGrAmount(25000);
//				grInfo.setGrCreatetime(new Date(1501051785000L));
//				grInfo.setGrAcceptdeadline(new Date(1501051785000L));
//				grInfo.setGrApplydeadline(new Date(1501051785000L));
				
				list.add(grInfo);
				
				grInfo = new GrInfo();
				grInfo.setGrId("339697298491572224");
				grInfo.setGrGrantoraddr("0x000001");
				grInfo.setGrAmount(2000);
//				grInfo.setGrCreatetime(new Date(1501290947000L));
//				grInfo.setGrAcceptdeadline(new Date(1501290947000L));
//				grInfo.setGrApplydeadline(new Date(1501290947000L));
				
				list.add(grInfo);
				
				uiidResp.setResultList(list);
				return uiidResp;
//			}
//		}
//		return null;
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "/invoke3")
	public UiidResp getName2(@RequestBody String requestBody) {
		logger.info(requestBody);
		String[] a = requestBody.split("&");
		for (String x:a) {
			String x1 = x.split("=")[0];
			String x2 = x.split("=")[1];
			if("searchTxt".equals(x1)) {
				logger.info(x1);
				if("22".equals(x2)) {
				UiidResp uiidResp = new UiidResp();
				uiidResp.setSuccess(true);
				uiidResp.setMessage("good");
				List list = new ArrayList<GrInfo>();
				
				GrInfo grInfo = new GrInfo();
				grInfo.setGrId("339781329333780480");
				grInfo.setGrGrantoraddr("0x000003");
				grInfo.setGrAmount(25000);
//				grInfo.setGrCreatetime(new Date(1501051785000L));
//				grInfo.setGrAcceptdeadline(new Date(1501051785000L));
//				grInfo.setGrApplydeadline(new Date(1501051785000L));
				
				list.add(grInfo);
				

				
				uiidResp.setResultList(list);
				return uiidResp;
				}
			}
		}
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/invoke1")
	public UiidResp getGrInfo(@RequestBody UiidReq req,BindingResult result) {
		logger.info("we begin here");
		logger.info(req.getUiid());
		UiidResp uiidResp = new UiidResp();
		uiidResp.setSuccess(true);
		uiidResp.setMessage("good");
		uiidResp.setRowCount(100);
		List list = new ArrayList<GrInfo>();
		
		GrInfo grInfo = new GrInfo();
		grInfo.setGrId("339781329333780480");
		grInfo.setGrGrantoraddr("0x000003");
		grInfo.setGrAmount(25000);
		grInfo.setGrCreatetime(new Date(1501051785000L));
		grInfo.setGrAcceptdeadline(new Date(1501051785000L));
		grInfo.setGrApplydeadline(new Date(1501051785000L));
		
		list.add(grInfo);
		
		grInfo = new GrInfo();
		grInfo.setGrId("339697298491572224");
		grInfo.setGrGrantoraddr("0x000001");
		grInfo.setGrAmount(2000);
		grInfo.setGrCreatetime(new Date(1501290947000L));
		grInfo.setGrAcceptdeadline(new Date(1501290947000L));
		grInfo.setGrApplydeadline(new Date(1501290947000L));
		
		list.add(grInfo);
		
		uiidResp.setResultList(list);
		return uiidResp;
	}
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/getobject") public User getObject(){
	 * logger.info("we begin here"); User user = new User();
	 * user.setUserName("zhanchang"); user.setUserAge("100"); return user; }
	 * 
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/retobject", method = RequestMethod.POST) public User
	 * retObject(@Valid @RequestBody User user,BindingResult result){
	 * 
	 * if (result.hasErrors()) { return user; } logger.info("we begin here");
	 * user.setUserName(user.getUserName()+"001"); user.setUserAge("200"); return
	 * user; }
	 * 
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/getuserinfo", method = RequestMethod.GET) public User
	 * getUserInfo(){ logger.info("we begin here"); return
	 * testService.queryByName("abcd"); }
	 * 
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/getmytestinfo", method = RequestMethod.GET)
	 * 
	 * @PerformanceLog(RequestClass="com.citic.test",RequestMethod="myTestMethod",
	 * ResponseClass="123",ResponseMethod="456") public MyTest getMytestInfo(){
	 * logger.info("mytest is begin!"); MyTest m =
	 * myTestMapper.selectByName("zc").get(0); return m; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value="/gettestserverinfo", method = RequestMethod.GET)
	 * 
	 * @PerformanceLog(RequestClass="com.citic.test",RequestMethod="myTestMethod",
	 * ResponseClass="123",ResponseMethod="456") public User
	 * getTestserverInfo(HttpServletRequest request){
	 * logger.info("gettestserverinfo is begin!"); RestTemplate rest = new
	 * RestTemplate(); User user
	 * =rest.postForObject("http://127.0.0.1:8080/testserver/info/getobject",
	 * null,User.class); return user; }
	 */

}
