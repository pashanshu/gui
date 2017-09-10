package com.zc.gui;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

import com.zc.gui.bean.UiidReq;
import com.zc.gui.bean.UiidResp;
import com.zc.gui.controller.TestController;

public class Test {

	private static Logger logger = Logger.getLogger(Test.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.go();
	}
	
	public void go() {
		RestTemplate rest = new RestTemplate(); 
		UiidReq req = new UiidReq();
/*		req.setUiid("222");
		req.setLimit(25);
		req.setPage(25);*/
		req.setPageNo("1");
		req.setPageSize("25");
//		req.setSearchTxt("222");
//		req.setStart(0);
		
		UiidResp uiidResp = rest.postForObject("http://localhost:8080/gui/rest/test/invoke1", req,UiidResp.class);
		logger.info(uiidResp.getResultList());
	}

}
