# 介绍
争取 做最好用的 企业微信 SDK, 帮助开发者 以最方便 最省时间的方式接入企业微信。qiye-wechat-sdk 基于 Figen 封装, 覆盖 企业微信 所有API

## Quick Start


### Spring Boot 项目


### 普通java项目 配置
普通 的Java 项目使用步骤如下： 
1. 引入maven依赖
```xml
  <dependency>
            <groupId>chat.qiye.wechat</groupId>
            <artifactId>qiye-wechat-sdk</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>

        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-1.2-api</artifactId>
            <optional>true</optional>
        </dependency>

        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j-impl</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
        </dependency>
```
2. 在 resources 目录下 放一个 qiye-wechat.properties 配置文件
```properties
# 应用配置
qiye.wecaht.appId=1000015
qiye.wecaht.agentId=1000015
qiye.wecaht.secret=VYa3q7u-XkhQno-ROferY3mD16eFy_-h62pHJ0qM58I
qiye.wecaht.corpId=ww5f09c98e13dfce02
qiye.wecaht.homeUrl=http://baidu.com
qiye.wecaht.eventToken=ss
qiye.wecaht.eventEncodingAesKey=sddd

# 系统 应用配置格式, 系统应用ID参考 chat.qiye.wechat.sdk.constant.SysAppIdEnum
# qiye.wecaht.系统应用ID.appId=contact
# qiye.wecaht.系统应用ID.agentId=88
# qiye.wecaht.系统应用ID.secret=okDLF2M1tkQRGfAQ2cENzNUxfLd3c-_vn60etURj0SY
# qiye.wecaht.系统应用ID.corpId=ww5f09c98e13dfce02   # 可选,未配置使用  qiye.wecaht.corpId
# qiye.wecaht.系统应用ID.homeUrl=http://baidu.com
# qiye.wecaht.系统应用ID.eventToken=ss
# qiye.wecaht.系统应用ID.eventEncodingAesKey=sddd

# 系统-通讯录应用
qiye.wecaht.contact.appId=contact
qiye.wecaht.contact.agentId=88
qiye.wecaht.contact.secret=okDLF2MXt3QRGfAQ2cENzNUxfLd3c-_vn60etURj0SY
qiye.wecaht.contact.corpId=ww5f09c98e13dfce02
qiye.wecaht.contact.homeUrl=http://baidu.com
qiye.wecaht.contact.eventToken=ss
qiye.wecaht.contact.eventEncodingAesKey=sddd

```
3. API调用 
```java
public class MainClass {
    public static void main(String[] args) {
        // 获取Api实例， 所有封装的Api 都在 chat.qiye.wechat.sdk.api 包下，并以Api结尾
        ContactDeptApi contactDeptApi = ApiFactory.getApiBean(ContactDeptApi.class, new ApiConfigurationDefaultProvider());
        // 查询 通讯录 部门列表
        List<ContactDeptVo> deptVoList = contactDeptApi.list(0).getDepartment();
        System.out.println("DeptList:" + deptVoList);
        // 创建部门
        ContactDeptVo contactDeptVo = new ContactDeptVo();
        contactDeptVo.setId(2);
        contactDeptVo.setName("测试部");
        contactDeptVo.setNameEn("test");
        contactDeptVo.setParentid(1);
        ContactDeptCreateResp resp = contactDeptApi.create(contactDeptVo);

        if (resp.success()) {
            RespStatus ret = contactDeptApi.delete(resp.getId());
            System.out.println("delete result:" + ret);
        }
    }
}
```

## 进阶配置


## 多个企业微信内部应用


## 多个企业微信服务商应用


## 系统应用ID
系统应用 默认是 没有应用ID 但是 系统应用有单独的 secret,为了能够识别 系统应用的 secret 特此 对系统应用的id 进行统一定义，在配置文件中 配置时，需遵守如下名称
```java
 DEFAULT("app", "自建应用"),
 APP_CONTACT("contact", "通讯录"),
 APP_CUSTOMER("customer", "客户关系"),
 APP_CUSTOMER_SERVICE("customer_service", "微信客服"),
 APP_MEETING("meeting", "会议"),
 APP_SCHEDULE("schedule", "日程"),
 APP_PUBLIC_PHONE("public_phone", "公费电话"),
 APP_WX_DRIVE("wx_drive", "微盘"),
 APP_LIVING("living", "直播"),
 APP_CHECK_IN("check_in", "打卡"),
 APP_APPROVAL("approval", "审批"),
 APP_REPORT("report", "汇报"),
 APP_MEETING_ROOM("meeting_room", "会议室"),
 APP_PSTNCC("pstncc", "紧急通知"),
 APP_SCHOOL_CONTACT("school_contact", "家校通讯录");
```