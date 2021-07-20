<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
			/*表格样式*/			
			table {
				width: 90%;
				background: #ccc;
				margin: 10px auto;
				border-collapse: collapse;/*border-collapse:collapse合并内外边距(去除表格单元格默认的2个像素内外边距*/	
			}				
			th,td {
				height: 25px;
				line-height: 25px;
				text-align: center;
				border: 1px solid #ccc;
			}		
			th {
				background: #eee;
				font-weight: normal;
			}		
			tr {
				background: #fff;
			}		
			tr:hover {
				background: #cc0;
			}		
			td a {
				color: #06f;
				text-decoration: none;
			}		
			td a:hover {
				color: #06f;
				text-decoration: underline;
			}
		</style>
  </head>
  
  <body>
    <form action="/liuyanban02/user/insert" method="post">
    Title:<input type="text" name="title"><br>
    Author:<input type="text" name="name"><br>
    Context:<br><textarea rows="10" cols="20" name="context"></textarea><br>
    <input type="submit" value="Submit">
  	<input type="reset" value="Cancel">
  	
    <hr> 
    <h3>共15条留言，共3页，第1页</h3>
    <a href="">上一页</a>
    <a href="">下一页</a>
     
    <table>
    <c:forEach items="${sessionScope.user }" var="user">
    	<tr>
    		<td>${user.id } 楼</td>
    		<td>作者：${user.name }</td>
    		<td>ip已记录</td>
    		<td>时间</td>
    	</tr>
    	<tr>
    		<td >标题： ${user.title }</td>
    	</tr>
    	<tr>
    		<td>内容： ${user.context }</td>
    	</tr>
    	</c:forEach>
    	
    </table>
    </form>
    
  </body>
</html>
