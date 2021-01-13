package com.yaoyuec.demo.service.impl;

import com.yaoyuec.demo.dao.PaperMapper;
import com.yaoyuec.demo.entity.Paper;
import com.yaoyuec.demo.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaoyuec
 * (╯' - ')╯︵ ┻━┻
 */
@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;

    public List<Paper> getPaperInfo() {
        return paperMapper.getPaperInfo();
    }
}
