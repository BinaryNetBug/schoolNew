package cn.com.entity;

import java.io.Serializable;

public class Apply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer applyId;//报名信息id
	private String ID;//身份证号
	private String name;//学生姓名
	private String sex;//学生性别
	private String brithday;//出生日期
	private String nation;//民族
	private String education;//学历
	private String graduate;//毕业院校
	private String tall;//身高
	private String politics;//政治面貌
	private String address;//地址
	private String tel;//电话
	private String tel2;//电话2
	private String qq;//QQ
	private Integer postcode;//邮编
	private String message;//留言
	private Major major;//专业
	private String nickName;//昵称
	private String email;//电子邮件
	private String isMassage;//判断是否是报名信息
	
	
	
	
	/**
	 * @return the isMassage
	 */
	public String getIsMassage() {
		return isMassage;
	}
	/**
	 * @param isMassage the isMassage to set
	 */
	public void setIsMassage(String isMassage) {
		this.isMassage = isMassage;
	}
	/**
	 * @return the applyId
	 */
	public Integer getApplyId() {
		return applyId;
	}
	/**
	 * @param applyId the applyId to set
	 */
	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the brithday
	 */
	public String getBrithday() {
		return brithday;
	}
	/**
	 * @param brithday the brithday to set
	 */
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	/**
	 * @return the nation
	 */
	public String getNation() {
		return nation;
	}
	/**
	 * @param nation the nation to set
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @return the graduate
	 */
	public String getGraduate() {
		return graduate;
	}
	/**
	 * @param graduate the graduate to set
	 */
	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}
	/**
	 * @return the tall
	 */
	public String getTall() {
		return tall;
	}
	/**
	 * @param tall the tall to set
	 */
	public void setTall(String tall) {
		this.tall = tall;
	}
	/**
	 * @return the politics
	 */
	public String getPolitics() {
		return politics;
	}
	/**
	 * @param politics the politics to set
	 */
	public void setPolitics(String politics) {
		this.politics = politics;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the tel2
	 */
	public String getTel2() {
		return tel2;
	}
	/**
	 * @param tel2 the tel2 to set
	 */
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	/**
	 * @return the qq
	 */
	public String getQq() {
		return qq;
	}
	/**
	 * @param qq the qq to set
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
	/**
	 * @return the postcode
	 */
	public Integer getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the major
	 */
	public Major getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(Major major) {
		this.major = major;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @param applyId
	 * @param iD
	 * @param name
	 * @param sex
	 * @param brithday
	 * @param nation
	 * @param education
	 * @param graduate
	 * @param tall
	 * @param politics
	 * @param address
	 * @param tel
	 * @param tel2
	 * @param qq
	 * @param postcode
	 * @param message
	 * @param major
	 * @param nickName
	 * @param email
	 */
	public Apply(Integer applyId, String iD, String name, String sex, String brithday, String nation, String education,
			String graduate, String tall, String politics, String address, String tel, String tel2, String qq,
			Integer postcode, String message, Major major, String nickName, String email) {
		super();
		this.applyId = applyId;
		ID = iD;
		this.name = name;
		this.sex = sex;
		this.brithday = brithday;
		this.nation = nation;
		this.education = education;
		this.graduate = graduate;
		this.tall = tall;
		this.politics = politics;
		this.address = address;
		this.tel = tel;
		this.tel2 = tel2;
		this.qq = qq;
		this.postcode = postcode;
		this.message = message;
		this.major = major;
		this.nickName = nickName;
		this.email = email;
	}
	/**
	 * 
	 */
	public Apply() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Apply [applyId=" + applyId + ", ID=" + ID + ", name=" + name + ", sex=" + sex + ", brithday=" + brithday
				+ ", nation=" + nation + ", education=" + education + ", graduate=" + graduate + ", tall=" + tall
				+ ", politics=" + politics + ", address=" + address + ", tel=" + tel + ", tel2=" + tel2 + ", qq=" + qq
				+ ", postcode=" + postcode + ", message=" + message + ", major=" + major + ", nickName=" + nickName
				+ ", email=" + email + "]";
	}
	

}
