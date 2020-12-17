package com.homework.trans;

import cn.hutool.http.HttpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TransController {

    @RequestMapping("trans")
    @ResponseBody
    public String translate(@RequestBody String requestBody) {
        String url = "http://free.niutrans.com/NiuTransServer/translation";
        return HttpUtil.post(url, requestBody);
    }

    @RequestMapping("trans2")
    @ResponseBody
    public ResultVO translate() {
        return new ResultVO();
    }
}
