
package com.sooncode.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class RuleLibrary implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 规则库编号 */ 
	 private String ruleLibraryId; 
	 /** 短信组编号 */
	 private String smsGroup ;
	 /** 业务系统编号 */
	 private String businessSystemId ;
	 /** 规则编号 */
	 private String ruleId ;
	 /** 规则类型 */
	 private String ruleType ;
	 /** 规则库名称 */
	 private String ruleLibraryName ;
	 /** 邮件组编号 */
	 private String emailGroup ;
	 /** 创建时间 */
	 private java.util.Date createTime ;
	 /** 更新时间 */
	 private java.util.Date updateTime ;
	 /** 处理方案 */
	 private String remark ;

	 /** 短信组编号 */
	 public String getSmsGroup() { 
	 	 return smsGroup;
	 }
	 /** 短信组编号 */
	 public void setSmsGroup(String smsGroup) {
	 	 this.smsGroup = smsGroup;
	 }

	 /** 业务系统编号 */
	 public String getBusinessSystemId() { 
	 	 return businessSystemId;
	 }
	 /** 业务系统编号 */
	 public void setBusinessSystemId(String businessSystemId) {
	 	 this.businessSystemId = businessSystemId;
	 }

	 /** 规则编号 */
	 public String getRuleId() { 
	 	 return ruleId;
	 }
	 /** 规则编号 */
	 public void setRuleId(String ruleId) {
	 	 this.ruleId = ruleId;
	 }

	 /** 规则类型 */
	 public String getRuleType() { 
	 	 return ruleType;
	 }
	 /** 规则类型 */
	 public void setRuleType(String ruleType) {
	 	 this.ruleType = ruleType;
	 }

	 /** 规则库名称 */
	 public String getRuleLibraryName() { 
	 	 return ruleLibraryName;
	 }
	 /** 规则库名称 */
	 public void setRuleLibraryName(String ruleLibraryName) {
	 	 this.ruleLibraryName = ruleLibraryName;
	 }

	 /** 规则库编号 */
	 public String getRuleLibraryId() { 
	 	 return ruleLibraryId;
	 }
	 /** 规则库编号 */
	 public void setRuleLibraryId(String ruleLibraryId) {
	 	 this.ruleLibraryId = ruleLibraryId;
	 }

	 /** 邮件组编号 */
	 public String getEmailGroup() { 
	 	 return emailGroup;
	 }
	 /** 邮件组编号 */
	 public void setEmailGroup(String emailGroup) {
	 	 this.emailGroup = emailGroup;
	 }

	 /** 创建时间 */
	 public java.util.Date getCreateTime() { 
	 	 return createTime;
	 }
	 /** 创建时间 */
	 public void setCreateTime(java.util.Date createTime) {
	 	 this.createTime = createTime;
	 }

	 /** 更新时间 */
	 public java.util.Date getUpdateTime() { 
	 	 return updateTime;
	 }
	 /** 更新时间 */
	 public void setUpdateTime(java.util.Date updateTime) {
	 	 this.updateTime = updateTime;
	 }

	 /** 处理方案 */
	 public String getRemark() { 
	 	 return remark;
	 }
	 /** 处理方案 */
	 public void setRemark(String remark) {
	 	 this.remark = remark;
	 }

}
