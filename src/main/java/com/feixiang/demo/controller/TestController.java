package com.feixiang.demo.controller;

import com.feixiang.demo.dto.TestDTO;
import com.feixiang.demo.vo.TestVO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lidaofei on 2019/2/20.
 */
@Controller
@RequestMapping("/testClass")
public class TestController {
    private final Log logger = LogFactory.getLog(TestController.class);

    @RequestMapping("/testM")
    @ResponseBody
    public TestVO testM(@RequestBody TestDTO param){
        System.out.println("===testM start===");
        String str = "";
        TestVO vo = new TestVO();
        BeanUtils.copyProperties(param,vo);
        return vo;
    }

    @RequestMapping("/testRb")
    @ResponseBody
    public TestVO testRb(@RequestBody TestDTO e) {
        System.out.println("===testRb start===");
        TestVO vo = new TestVO();
        BeanUtils.copyProperties(e,vo);
        return vo;
    }

    @RequestMapping("/testCustomObj")
    @ResponseBody
    public TestVO testCustomObj(TestDTO e) {
        System.out.println("===testCustomObj start===");
        TestVO vo = new TestVO();
        BeanUtils.copyProperties(e,vo);
        return vo;
    }
}
