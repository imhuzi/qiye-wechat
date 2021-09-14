package chat.qiye.wechat.sdk.api.contact.resp;

public class DepartmentListItem{
	private String departmentId;
	private String departmentName;
	private String parentid;
	private int order;

	public String getDepartmentId(){
		return departmentId;
	}

	public String getDepartmentName(){
		return departmentName;
	}

	public String getParentid(){
		return parentid;
	}

	public int getOrder(){
		return order;
	}
}
