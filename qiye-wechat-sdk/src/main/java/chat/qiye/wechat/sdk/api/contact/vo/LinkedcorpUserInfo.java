package chat.qiye.wechat.sdk.api.contact.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LinkedcorpUserInfo {

	@JsonProperty("corpid")
	private String corpid;

	@JsonProperty("name")
	private String name;

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("extattr")
	private UserExtattrVo extattr;

	@JsonProperty("telephone")
	private String telephone;

	@JsonProperty("position")
	private String position;

	@JsonProperty("department")
	private List<String> department;

	@JsonProperty("userid")
	private String userid;

	@JsonProperty("email")
	private String email;
}