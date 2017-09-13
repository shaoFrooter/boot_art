package boot.art.controller;

import boot.art.dao.UserInfoMapper;
import boot.art.model.UserInfo;
import boot.art.service.GooglerService;
import boot.art.controller.general.GeneralController;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by shaofeng on 2017/9/8.
 */
@Controller
@RequestMapping
public class IndexController extends GeneralController {

    private static final Logger LOGGER= LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private GooglerService googlerService;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping("/")
    @ResponseBody
    public String indexPage(){
        LOGGER.info("index start");
        LOGGER.error("index error");
        return JSONObject.toJSONString(googlerService.createGooglerDao());
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public String saveUser(){
        UserInfo ui=new UserInfo();
        ui.setAge(20);
        ui.setName("邵锋");
        userInfoMapper.insert(ui);
        LOGGER.info("index start");
        LOGGER.error("index error");
        return JSONObject.toJSONString(setOkMsg(""));
    }

    @RequestMapping(value = "/select.json")
    @ResponseBody
    public Message selectUser(@RequestParam Long queryId){
        Map<String,Object> queryParam= Maps.newHashMap();
        queryParam.put("queryId",queryId);
        UserInfo ui=userInfoMapper.selectById(queryParam);
        return setOkMsg(ui);
    }


}
