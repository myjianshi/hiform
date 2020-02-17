package edu.gyc.hiform.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ls
 * @since 2020-02-17
 */
public class SysFeedback implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 反馈编号
     */
    @TableId(value = "feedbackid", type = IdType.AUTO)
    private Integer feedbackid;

    /**
     * 所属表单编号
     */
    private Integer formid;

    /**
     * 所在行数
     */
    private Integer rownumber;

    /**
     * 反馈时间
     */
    private String feedbacktime;

    /**
     * 反馈状态:0表示待处理,1表示已处理
     */
    private Integer feedbackstatus;


    public Integer getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(Integer feedbackid) {
        this.feedbackid = feedbackid;
    }

    public Integer getFormid() {
        return formid;
    }

    public void setFormid(Integer formid) {
        this.formid = formid;
    }

    public Integer getRownumber() {
        return rownumber;
    }

    public void setRownumber(Integer rownumber) {
        this.rownumber = rownumber;
    }

    public String getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(String feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public Integer getFeedbackstatus() {
        return feedbackstatus;
    }

    public void setFeedbackstatus(Integer feedbackstatus) {
        this.feedbackstatus = feedbackstatus;
    }

    @Override
    public String toString() {
        return "SysFeedback{" +
        "feedbackid=" + feedbackid +
        ", formid=" + formid +
        ", rownumber=" + rownumber +
        ", feedbacktime=" + feedbacktime +
        ", feedbackstatus=" + feedbackstatus +
        "}";
    }
}
