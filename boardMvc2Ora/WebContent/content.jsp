<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@  include file="/view/color.jspf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title> �Խ��� </title>
<link href = "style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="${bodyback_c}">
<center><b>�۳��뺸��</b></center>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c}">�۹�ȣ</td>
		<td align="center" width="125" align="center">${article.num}</td>
		<td align="center" width="125" bgcolor="${value_c}">��ȸ��</td>
		<td align="center" width="125" align="center">${article.readcount}</td>
	</tr>
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c}">�ۼ���</td>
		<td align="center" width="125" align="center">${article.writer}</td>
		<td align="center" width="125" bgcolor="${value_c}">�ۼ���</td>
		<td align="center" width="125" align="center">${article.reg_date}</td>
	</tr>
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c}">������</td>
		<td align="center" width="375" align="center" colspan="3">${article.subject}</td>
	</tr>
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c}">�۳���</td>
		<td align="left" width="375" colspan="3"><pre>${article.content}</pre></td>
	</tr>
	<tr height="30">
		<td colspan="4" bgcolor="${value_c}" align="right">
		  <input type="button" value="�ۼ���"
		   onclick="document.location.href='/boardMvc2Ora/updateForm.do?num=${article.num}&pageNum=${pageNum }'">
		  &nbsp;&nbsp;&nbsp;&nbsp;
		  <input type="button" value="�ۻ���"
		   onclick="document.location.href='/boardMvc2Ora/deleteForm.do?num=${article.num}&pageNum=${pageNum }'">
		  &nbsp;&nbsp;&nbsp;&nbsp;
		  <input type="button" value="��۾���"
		   onclick="document.location.href='/boardMvc2Ora/wrtieForm.do?num=${article.num}&ref=${article.ref}
		   &re_step=${article.re_step}&re_level=${article.re_level}'">
		  &nbsp;&nbsp;&nbsp;&nbsp;
		  <input type="button" value="�۸��"
		   onclick="document.location.href='/boardMvc2Ora/list.do?pageNum=${pageNum}'">
		</td>
	</tr>
</table>
</form>
</body>
</html>