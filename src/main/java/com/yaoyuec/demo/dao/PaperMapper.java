package com.yaoyuec.demo.dao;

import com.yaoyuec.demo.entity.Paper;

import java.util.List;

/**
 * @author yaoyuec
 * (╯' - ')╯︵ ┻━┻
 */
public interface PaperMapper {
    /**
     * 查询信息
     * @return list
     */
    List<Paper> getPaperInfo();

}
