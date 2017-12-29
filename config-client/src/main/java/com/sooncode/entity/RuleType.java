
package com.sooncode.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class RuleType implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 监控规则类型编号 */ 
	 private String ruleTypeId; 
	 /** 业务系统编号 */
	 private String businessSystemId ;
	 /** 监控规则类型名称 */
	 private String ruleTypeName ;
	 /** 监控规则类型代码 */
	 private String ruleTypeCode ;
	 /** 创建时间 */
	 private java.util.Date createTime ;
	 /** 更新时间 */
	 private java.util.Date updateTime ;

	 /** 业务系统编号 */
	 public String getBusinessSystemId() { 
	 	 return businessSystemId;
	 }
	 /** 业务系统编号 */
	 public void setBusinessSystemId(String businessSystemId) {
	 	 this.businessSystemId = businessSystemId;
	 }

	 /** 监控规则类型编号 */
	 public String getRuleTypeId() { 
	 	 return ruleTypeId;
	 }
	 /** 监控规则类型编号 */
	 public void setRuleTypeId(String ruleTypeId) {
	 	 this.ruleTypeId = ruleTypeId;
	 }

	 /** 监控规则类型名称 */
	 public String getRuleTypeName() { 
	 	 return ruleTypeName;
	 }
	 /** 监控规则类型名称 */
	 public void setRuleTypeName(String ruleTypeName) {
	 	 this.ruleTypeName = ruleTypeName;
	 }

	 /** 监控规则类型代码 */
	 public String getRuleTypeCode() { 
	 	 return ruleTypeCode;
	 }
	 /** 监控规则类型代码 */
	 public void setRuleTypeCode(String ruleTypeCode) {
	 	 this.ruleTypeCode = ruleTypeCode;
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

}
