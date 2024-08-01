package com.yupi.yuoj.judge;

import com.yupi.yuoj.model.entity.QuestionSubmit;

public interface JudgeService {

    /**
     * 执行判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
