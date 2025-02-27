package com.yupi.yuoj.model.dto.questionsubmit;

import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 程序执行内存限制
     */
    private Long memory;

    /**
     * 程序执行时间限制
     */
    private Long time;
}
