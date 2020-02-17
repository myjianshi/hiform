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
public class SysForm implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 表单编号
     */
    @TableId(value = "formid", type = IdType.AUTO)
    private Integer formid;

    /**
     * 表单序列号
     */
    private String uuid;

    /**
     * 表单名
     */
    private String formname;

    /**
     * 表单路径
     */
    private String formpath;

    /**
     * 表单状态:0表示允许填写,1表示拒绝填写
     */
    private Integer formstatus;

    /**
     * 表单描述
     */
    private String formdesc;

    /**
     * 开始时间
     */
    private String begintime;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * 创建用户编号
     */
    private Integer userid;

    /**
     * 填写密码
     */
    private String password;


    public Integer getFormid() {
        return formid;
    }

    public void setFormid(Integer formid) {
        this.formid = formid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        this.formname = formname;
    }

    public String getFormpath() {
        return formpath;
    }

    public void setFormpath(String formpath) {
        this.formpath = formpath;
    }

    public Integer getFormstatus() {
        return formstatus;
    }

    public void setFormstatus(Integer formstatus) {
        this.formstatus = formstatus;
    }

    public String getFormdesc() {
        return formdesc;
    }

    public void setFormdesc(String formdesc) {
        this.formdesc = formdesc;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysForm{" +
        "formid=" + formid +
        ", uuid=" + uuid +
        ", formname=" + formname +
        ", formpath=" + formpath +
        ", formstatus=" + formstatus +
        ", formdesc=" + formdesc +
        ", begintime=" + begintime +
        ", endtime=" + endtime +
        ", userid=" + userid +
        ", password=" + password +
        "}";
    }
}
