package cn.ileng.modules.email.entity;

import cn.ileng.core.common.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import cn.ileng.modules.sys.entity.User;
import java.util.Date;

/**
 * @Title: 邮件发送模板
 * @Description: 邮件发送模板
 * @author xuejian
 * @date 2017-08-16 11:25:44
 * @version V1.0
 *
 */
@TableName("email_template")
@SuppressWarnings("serial")
public class EmailTemplate extends AbstractEntity<String> {

    /**id*/
    @TableId(value = "id", type = IdType.UUID)
	private String id;
    /**模版名称*/
    @TableField(value = "name")
	private String name;
    /**模版编码*/
    @TableField(value = "code")
	private String code;
    /**业务类型*/
    @TableField(value = "business_type")
	private String businessType;
    /**模版主题*/
    @TableField(value = "template_subject")
	private String templateSubject;
    /**模版内容*/
    @TableField(value = "template_content")
	private String templateContent;
    /**备注信息*/
    @TableField(value = "remarks")
	private String remarks;
    /**创建者*/
    @TableField(value = "create_by",el="createBy.id", fill = FieldFill.INSERT)
	private User createBy;
    /**创建时间*/
    @TableField(value = "create_date", fill = FieldFill.INSERT)
	private Date createDate;
    /**更新者*/
    @TableField(value = "update_by",el="updateBy.id", fill = FieldFill.INSERT_UPDATE)
	private User updateBy;
    /**更新时间*/
    @TableField(value = "update_date", fill = FieldFill.INSERT_UPDATE)
	private Date updateDate;
    /**删除标记（0：正常；1：删除）*/
    @TableField(value = "del_flag")
	private String delFlag;

	/**
	 * 获取  id
	 *@return: String  id
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * 设置  id
	 *@param: id  id
	 */
	public void setId(String id){
		this.id = id;
	}
	/**
	 * 获取  name
	 *@return: String  模版名称
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * 设置  name
	 *@param: name  模版名称
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * 获取  code
	 *@return: String  模版编码
	 */
	public String getCode(){
		return this.code;
	}

	/**
	 * 设置  code
	 *@param: code  模版编码
	 */
	public void setCode(String code){
		this.code = code;
	}
	/**
	 * 获取  businessType
	 *@return: String  业务类型
	 */
	public String getBusinessType(){
		return this.businessType;
	}

	/**
	 * 设置  businessType
	 *@param: businessType  业务类型
	 */
	public void setBusinessType(String businessType){
		this.businessType = businessType;
	}
	/**
	 * 获取  templateSubject
	 *@return: String  模版主题
	 */
	public String getTemplateSubject(){
		return this.templateSubject;
	}

	/**
	 * 设置  templateSubject
	 *@param: templateSubject  模版主题
	 */
	public void setTemplateSubject(String templateSubject){
		this.templateSubject = templateSubject;
	}
	/**
	 * 获取  templateContent
	 *@return: String  模版内容
	 */
	public String getTemplateContent(){
		return this.templateContent;
	}

	/**
	 * 设置  templateContent
	 *@param: templateContent  模版内容
	 */
	public void setTemplateContent(String templateContent){
		this.templateContent = templateContent;
	}
	/**
	 * 获取  remarks
	 *@return: String  备注信息
	 */
	public String getRemarks(){
		return this.remarks;
	}

	/**
	 * 设置  remarks
	 *@param: remarks  备注信息
	 */
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	/**
	 * 获取  createBy
	 *@return: User  创建者
	 */
	public User getCreateBy(){
		return this.createBy;
	}

	/**
	 * 设置  createBy
	 *@param: createBy  创建者
	 */
	public void setCreateBy(User createBy){
		this.createBy = createBy;
	}
	/**
	 * 获取  createDate
	 *@return: Date  创建时间
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 * 设置  createDate
	 *@param: createDate  创建时间
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	/**
	 * 获取  updateBy
	 *@return: User  更新者
	 */
	public User getUpdateBy(){
		return this.updateBy;
	}

	/**
	 * 设置  updateBy
	 *@param: updateBy  更新者
	 */
	public void setUpdateBy(User updateBy){
		this.updateBy = updateBy;
	}
	/**
	 * 获取  updateDate
	 *@return: Date  更新时间
	 */
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 * 设置  updateDate
	 *@param: updateDate  更新时间
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 * 获取  delFlag
	 *@return: String  删除标记（0：正常；1：删除）
	 */
	public String getDelFlag(){
		return this.delFlag;
	}

	/**
	 * 设置  delFlag
	 *@param: delFlag  删除标记（0：正常；1：删除）
	 */
	public void setDelFlag(String delFlag){
		this.delFlag = delFlag;
	}

}
