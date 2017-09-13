<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/webpage/common/taglibs.jspf"%>
<!DOCTYPE html>
<html>
<head>
  <title>短信模版列表</title>
  <meta name="decorator" content="list"/>
</head>
<body title="短信模版">
<grid:grid id="smsTemplateGridId" url="${adminPath}/sms/smstemplate/ajaxList">
	<grid:column label="sys.common.key" hidden="true"   name="id" width="100"/>
	<grid:column label="sys.common.opt"  name="opt" formatter="button" width="100"/>
	<grid:button groupname="opt" function="delete" />
    <grid:column label="模版ID"  name="templateId" />
    <grid:column label="模版编码"  name="code" />
    <grid:column label="模版名称"  name="name" />
    <grid:column label="业务类型"  name="businessType"  dict="businesstype"/>
    <grid:column label="模版内容"  name="templateContent" />
    <grid:column label="备注信息"  name="remarks" />
    <grid:column label="创建者"  name="createBy" />
    <grid:column label="创建时间"  name="createDate" />
    <grid:column label="更新者"  name="updateBy" />
    <grid:column label="更新时间"  name="updateDate" />
    <grid:column label="删除标记（0：正常；1：删除）"  name="delFlag" />
	<grid:toolbar function="create"/>
	<grid:toolbar function="update"/>
	<grid:toolbar function="delete"/>
	
	<grid:toolbar function="search"/>
	<grid:toolbar function="reset"/>
</grid:grid>
</body>
</html>