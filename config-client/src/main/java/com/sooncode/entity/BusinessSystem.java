
package com.sooncode.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class BusinessSystem implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 业务系统编号 */ 
	 private String businessSystemId; 
	 /** 业务系统代码 */
	 private String businessSystemCode ;
	 /** 创建时间 */
	 private java.util.Date createTime ;
	 /** 更新时间 */
	 private java.util.Date updateTime ;
	 /** 业务系统名称 */
	 private String businessSystemName ;

	 /** 业务系统编号 */
	 public String getBusinessSystemId() { 
	 	 return businessSystemId;
	 }
	 /** 业务系统编号 */
	 public void setBusinessSystemId(String businessSystemId) {
	 	 this.businessSystemId = businessSystemId;
	 }

	 /** 业务系统代码 */
	 public String getBusinessSystemCode() { 
	 	 return businessSystemCode;
	 }
	 /** 业务系统代码 */
	 public void setBusinessSystemCode(String businessSystemCode) {
	 	 this.businessSystemCode = businessSystemCode;
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

	 /** 业务系统名称 */
	 public String getBusinessSystemName() { 
	 	 return businessSystemName;
	 }
	 /** 业务系统名称 */
	 public void setBusinessSystemName(String businessSystemName) {
	 	 this.businessSystemName = businessSystemName;
	 }

}
