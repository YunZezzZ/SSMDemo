package com.yaoyuec.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yaoyuec.demo.entity.Paper;
import com.yaoyuec.demo.service.PaperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yaoyuec
 * (╯' - ')╯︵ ┻━┻
 */
@Controller
@RequestMapping(value = "paper")
public class PaperController {

    private Logger logger = LoggerFactory.getLogger(PaperController.class);

    @Autowired
    private PaperService paperService;

    @ResponseBody
    @RequestMapping(value = "getPaperInfo", method = RequestMethod.GET)
    public String getPaperInfo() {
        List<Paper> papers;
        try {
            papers = paperService.getPaperInfo();
        } catch (Exception e) {
            logger.error("getPaperInfo error>>>>> ",e);
            return null;
        }
        return JSON.toJSONString(papers, SerializerFeature.DisableCircularReferenceDetect);
    }
}
