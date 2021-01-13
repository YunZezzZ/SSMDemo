package com.yaoyuec.demo.entity;

import lombok.Data;

/**
 * @author yaoyuec
 * (╯' - ')╯︵ ┻━┻
 */
@Data
public class Paper {

    /**
     * id,唯一值
     */
    private int paperId;

    /**
     * 名称
     */
    private String name;

    /**
     * 数量
     */
    private int number;

    /**
     * 详情
     */
    private String detail;
}
