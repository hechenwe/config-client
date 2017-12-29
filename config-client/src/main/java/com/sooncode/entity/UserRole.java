
package com.sooncode.entity;
import java.io.Serializable;
/**
*
* @author hechen 
* 
*/ 
public class UserRole implements Serializable{ 
	 private static final long serialVersionUID = 1L;
	 /** 角色_编号 */ 
	 private String roleId; 
	 /** 角色名称 */
	 private String roleName ;
	 /** 创建时间 */
	 private java.util.Date createTime ;
	 /** 更新时间 */
	 private java.util.Date updateTime ;
	 /** 角色代码 */
	 private String roleCode ;

	 /** 角色_编号 */
	 public String getRoleId() { 
	 	 return roleId;
	 }
	 /** 角色_编号 */
	 public void setRoleId(String roleId) {
	 	 this.roleId = roleId;
	 }

	 /** 角色名称 */
	 public String getRoleName() { 
	 	 return roleName;
	 }
	 /** 角色名称 */
	 public void setRoleName(String roleName) {
	 	 this.roleName = roleName;
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

	 /** 角色代码 */
	 public String getRoleCode() { 
	 	 return roleCode;
	 }
	 /** 角色代码 */
	 public void setRoleCode(String roleCode) {
	 	 this.roleCode = roleCode;
	 }

}
