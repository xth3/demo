package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chingyu Mo
 * @create 2016-07-23-20:20
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
public class HomeController {
    //添加一个日志器
//    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
//        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        System.out.println("sdfsdf");
        return "index";
    }
}
