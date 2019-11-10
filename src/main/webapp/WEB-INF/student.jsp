<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    <!-- Bootstrap core CSS -->
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>学生管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">学生信息管理</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="stu/page">Home</a></li>
                <li><a href="stu/page">About</a></li>
                <li><a href="stu/page">Contact</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<div class="container">
    <form class="input-group form col-md-5" style="margin: 10px;"
          action="stu/page?pageNum=${pageinfo.pageNum}">
        <input type="text" class="form-control" name="keyword" placeholder="Search...">
        <span class="input-group-btn">
                        <button class="btn btn-primary" type="submit">Search</button>
                </span>
    </form>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th>#</th>
            <th>学生姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>联系方式</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="table-body">
        <c:forEach items="${pageinfo.list}" var="stu" varStatus="a">
            <tr>
                <td>${a.count}</td>
                <td>${stu.stuName}</td>
                <td>${stu.stuSex}</td>
                <td>${stu.stuAge}</td>
                <td>${stu.stuPhone}</td>
                <td>${stu.stuRemark}</td>
                <td>
                    <div class="btn-group btn-group-xs" role="group" aria-label="...">
                        <a href="to/stu/edit/${article.id}" type="button" class="btn btn-info btn-modify">修改</a>
                        <a href="to/stu/delete/${article.id}" type="button" class="btn btn-danger btn-delete">删除</a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <%-- 判断当前页是否是第一页 --%>
            <c:if test="${pageinfo.isFirstPage}">
                <li class="disabled">
                    <a href="javascript:void(0);" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            </c:if>
            <c:if test="${!pageinfo.isFirstPage}">
                <li>
                    <a href="stu/page?pageNum=${pageinfo.pageNum-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            </c:if>

            <%-- 分页页码显示判断 --%>
            <c:choose>
                <%-- 当总页数不足6页时,显示所有页码 --%>
                <c:when test="${pageinfo.pages<=10}">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="${pageinfo.pages}"/>
                </c:when>
                <%-- 当总页数大于6页时，通过公式算出begin和end --%>
                <c:otherwise>
                    <c:set var="begin" value="${pageinfo.pageNum-4}"/>
                    <c:set var="end" value="${pageinfo.pageNum+5}"/>
                    <%-- 头溢出 --%>
                    <c:if test="${begin<1}">
                        <c:set var="begin" value="1"/>
                        <c:set var="end" value="10"/>
                    </c:if>
                    <%-- 尾溢出 --%>
                    <c:if test="${end>pageinfo.pages}">
                        <c:set var="begin" value="${pageinfo.pages-9}"/>
                        <c:set var="end" value="${pageinfo.pages}"/>
                    </c:if>
                </c:otherwise>
            </c:choose>
            <c:forEach begin="${begin}" end="${end}" var="i" step="1">
                <c:choose>
                    <c:when test="${i eq pageinfo.pageNum}">
                        <li class="active"><a href="?pageNum=${i}">${i}</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="stu/page?pageNum=${i}">${i}</a></li>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <%-- 判断当前页是否是最后一页 --%>
            <c:if test="${pageinfo.isLastPage}">
                <li class="disabled">
                    <a href="javascript:void(0);" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </c:if>
            <c:if test="${!pageinfo.isLastPage}">
                <li>
                    <a href="stu/page?pageNum=${pageinfo.pageNum+1}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </c:if>
        </ul>
    </nav>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>
