package cn.com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.Type;
import cn.com.serviceImpl.TypeServiceImpl;

public class TypeAction extends ActionSupport{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Type type;
		private Boolean flag;
		private List<Type> typeList;
		private TypeServiceImpl service;
		
		
		/**
		 * @param service the service to set
		 */
		public void setService(TypeServiceImpl service) {
			this.service = service;
		}
		/**
		 * @return the type
		 */
		public Type getType() {
			return type;
		}
		/**
		 * @param type the type to set
		 */
		public void setType(Type type) {
			this.type = type;
		}
		/**
		 * @return the flag
		 */
		public Boolean getFlag() {
			return flag;
		}
		/**
		 * @param flag the flag to set
		 */
		public void setFlag(Boolean flag) {
			this.flag = flag;
		}
		/**
		 * @return the typeList
		 */
		public List<Type> getTypeList() {
			return typeList;
		}
		/**
		 * @param typeList the typeList to set
		 */
		public void setTypeList(List<Type> typeList) {
			this.typeList = typeList;
		}
		
		
		public String insertType(){
			this.service.insertType(type);
			return SUCCESS;
		}
		
		public String updateType(){
			this.service.updateType(type);
			return SUCCESS;
		}
		
		public String deleteType(){
			this.service.deleteType(this.type.getTypeId());
			return SUCCESS;
		}
		public String selectType(){
			this.typeList = this.service.selectType();
			return SUCCESS;
		}
		public String selectTypeOne(){
			this.type = this.service.selectType(this.type.getTypeId());
			return SUCCESS;
		}
}
