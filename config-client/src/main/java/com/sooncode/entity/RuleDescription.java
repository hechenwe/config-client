
package com.sooncode.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class RuleDescription implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 规则描述编号 */ 
	 private String ruleDescriptionId; 
	 /** 规则描述名称 */
	 private String ruleDescriptionName ;
	 /** 规则编号 */
	 private String ruleId ;
	 /** 规则描述内容 */
	 private String ruleDescriptionContent ;
	 /** 规则类型编号 */
	 private String ruleTypeId ;
	 /** 创建时间 */
	 private java.util.Date createTime ;
	 /** 更新时间 */
	 private java.util.Date updateTime ;
	 /** 规则描述序号 */
	 private Integer ruleDescription ;
	 /** 规则描述代码 */
	 private String ruleDescriptionCode ;

	 /** 规则描述名称 */
	 public String getRuleDescriptionName() { 
	 	 return ruleDescriptionName;
	 }
	 /** 规则描述名称 */
	 public void setRuleDescriptionName(String ruleDescriptionName) {
	 	 this.ruleDescriptionName = ruleDescriptionName;
	 }

	 /** 规则编号 */
	 public String getRuleId() { 
	 	 return ruleId;
	 }
	 /** 规则编号 */
	 public void setRuleId(String ruleId) {
	 	 this.ruleId = ruleId;
	 }

	 /** 规则描述内容 */
	 public String getRuleDescriptionContent() { 
	 	 return ruleDescriptionContent;
	 }
	 /** 规则描述内容 */
	 public void setRuleDescriptionContent(String ruleDescriptionContent) {
	 	 this.ruleDescriptionContent = ruleDescriptionContent;
	 }

	 /** 规则类型编号 */
	 public String getRuleTypeId() { 
	 	 return ruleTypeId;
	 }
	 /** 规则类型编号 */
	 public void setRuleTypeId(String ruleTypeId) {
	 	 this.ruleTypeId = ruleTypeId;
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

	 /** 规则描述序号 */
	 public Integer getRuleDescription() { 
	 	 return ruleDescription;
	 }
	 /** 规则描述序号 */
	 public void setRuleDescription(Integer ruleDescription) {
	 	 this.ruleDescription = ruleDescription;
	 }

	 /** 规则描述编号 */
	 public String getRuleDescriptionId() { 
	 	 return ruleDescriptionId;
	 }
	 /** 规则描述编号 */
	 public void setRuleDescriptionId(String ruleDescriptionId) {
	 	 this.ruleDescriptionId = ruleDescriptionId;
	 }

	 /** 规则描述代码 */
	 public String getRuleDescriptionCode() { 
	 	 return ruleDescriptionCode;
	 }
	 /** 规则描述代码 */
	 public void setRuleDescriptionCode(String ruleDescriptionCode) {
	 	 this.ruleDescriptionCode = ruleDescriptionCode;
	 }

}
