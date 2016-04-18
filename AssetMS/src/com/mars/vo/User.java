package com.mars.vo;

/**用户
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer uid;                //用户id
	private Role role;                  //角色
	private Department department;      //部门
	private String uname;               //用户姓名
	private String upwd;                //用户密码
	private Integer ustate;             //用户状态
	private Integer usex;               //用户性别

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Role role, Department department, String uname, String upwd,
			Integer ustate, Integer usex) {
		this.role = role;
		this.department = department;
		this.uname = uname;
		this.upwd = upwd;
		this.ustate = ustate;
		this.usex = usex;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Integer getUstate() {
		return this.ustate;
	}

	public void setUstate(Integer ustate) {
		this.ustate = ustate;
	}

	public Integer getUsex() {
		return this.usex;
	}

	public void setUsex(Integer usex) {
		this.usex = usex;
	}

}