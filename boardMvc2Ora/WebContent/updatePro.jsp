<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<c:if test="${check==1}">
	<meta http-equiv="Refresh" content="0;url=/boardMvc2Ora/list.do?pageNum=${pageNum}">
</c:if>
<c:if test="${check==0}">
	��й�ȣ�� �ٸ��ϴ�.
<br>
<a href="javascript:history.go(-1)">[�� ���� ������ ���ư���]</a></c:if>

<body>
</body>
</html>