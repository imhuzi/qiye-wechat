package chat.qiye.wechat.sdk.api.wedrive.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeDriveFileInfoVo {

	@JsonProperty("create_userid")
	private String createUserid;

	@JsonProperty("file_status")
	private int fileStatus;

	@JsonProperty("update_userid")
	private String updateUserid;

	@JsonProperty("file_name")
	private String fileName;

	@JsonProperty("mtime")
	private int mtime;

	@JsonProperty("sha")
	private String sha;

	@JsonProperty("file_size")
	private int fileSize;

	@JsonProperty("url")
	private String url;

	@JsonProperty("spaceid")
	private String spaceid;

	@JsonProperty("file_type")
	private int fileType;

	@JsonProperty("fatherid")
	private String fatherid;

	@JsonProperty("ctime")
	private int ctime;

	@JsonProperty("fileid")
	private String fileid;

	@JsonProperty("md5")
	private String md5;
}