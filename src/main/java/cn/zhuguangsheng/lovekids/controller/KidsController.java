package cn.zhuguangsheng.lovekids.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhuguangsheng on 2018/4/10.
 */
@RestController
public class KidsController {
    @RequestMapping("/")
    public String hello(){
        Date date = new Date();

        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr =formatter.format(date);
        return "hello lovekids, " + dateStr;
    }
}
