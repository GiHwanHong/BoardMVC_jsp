<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@  include file="/view/color.jspf" %>  

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>게시판</title>
<link href = "style.css" rel="stylesheet" type="text/css">

<script language="JavaScript">
<!--
	function deleteSave(){
		if(document.delForm.passwd.value==''){
			alert("비밀번호를 입력하세요.");
			document.delForm.passwd.focus();
			return false;
		}
}
-->
</script>
</head>
<body bgcolor="${bodyback_c}">
<center><b>글삭제</b></center>
<br>
<form method="POST" name="delForm" action="/boardMvc2Ora/deletePro.do?pageNum=${pageNum}"
   onsubmit="return deleteSave()">
<table width="360" border="1" cellspacing="0" cellpadding="0" align="center">
 <tr height="30">
 	<td align="center" bgcolor ="${value_c}">
     <b>비밀번호를 입력해 주세요.</b></td>
 </tr>
 <tr height="30">
 	<td align="center">비밀번호 :
     <input type="password" name="passwd" size="8" maxlength="12">
     <input type="hidden" name="num" value="${num}"></td> 
 </tr>
 <tr height="30">
 	<td align="center" bgcolor ="${value_c}">
     <input type="submit" value="글 삭제">
     <input type="button" value="글 목록"
      onclick="document.location.href='/boardMvc2Ora/list.do?pageNum=${pageNum}'"></td> 
 </tr>
</table>
</form>
</body>
</html>