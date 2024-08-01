package com.yupi.yuoj.judge.codesandbox.model;

import com.yupi.yuoj.model.dto.questionsubmit.JudgeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeResponse {

    /**
     * * 输出
     */
    private List<String> outputList;


    /**
     * * 错误信息
     */
    private String message;


    /**
     * * 状态码
     */
    private Integer status;


    /**
     * * 评测信息
     */
    private JudgeInfo judgeInfo;
}
