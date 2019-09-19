package com.milkz.crashreport.client;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crash/v1")
public class CrashReceive {

    @PostMapping("/record")
    public void doRecord(JSONObject jsonpObject){
        
        System.out.printf("test");
    }

}
