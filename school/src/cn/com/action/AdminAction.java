package cn.com.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.http.HttpRequest;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.Admin;
import cn.com.service.AdminService;

public class AdminAction extends ActionSupport{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Admin admin;
		private  AdminService adminService;
		private String loginFlag;
		
		public String getLoginFlag() {
			return loginFlag;
		}

		public void setLoginFlag(String loginFlag) {
			this.loginFlag = loginFlag;
		}

		@JSON(serialize=false)
		public AdminService getAdminService() {
			return adminService;
		}

		public void setAdminService(AdminService adminService) {
			this.adminService = adminService;
		}

		public Admin getAdmin() {
			return admin;
		}

		public void setAdmin(Admin admin) {
			this.admin = admin;
		}
		//登录
		public String loginAdmin(){
			Admin a = this.adminService.login(admin);
			if(a==null){ //登陆失败;
				loginFlag="0";
			}else{
				loginFlag="1";
				ServletActionContext.getRequest().getSession().setAttribute("admin", a);
			}
			return SUCCESS;
		}
		
		public String exitAdmin(){
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpServletResponse response = ServletActionContext.getResponse();
			request.getSession().removeAttribute("admin");
			try {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			return SUCCESS;
		}
}
