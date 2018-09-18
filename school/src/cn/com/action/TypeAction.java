package cn.com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.com.entity.Type;
import cn.com.service.TypeService;

public class TypeAction extends ActionSupport{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Type type;
		private Boolean flag;
		private List<Type> typeList;
		private TypeService typeService;
		
		
		/**
		 * @param typeService the typeService to set
		 */
		public void setTypeService(TypeService typeService) {
			this.typeService = typeService;
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
			this.typeService.insertType(type);
			return SUCCESS;
		}
		
		public String updateType(){
			this.typeService.updateType(type);
			return SUCCESS;
		}
		
		public String deleteType(){
			this.typeService.deleteType(this.type.getTypeId());
			return SUCCESS;
		}
		public String selectType(){
			System.out.println(typeService);
			this.typeList = this.typeService.selectType();
			return SUCCESS;
		}
		public String selectOneType(){
			this.type = this.typeService.selectType(this.type.getTypeId());
			return SUCCESS;
		}
}
