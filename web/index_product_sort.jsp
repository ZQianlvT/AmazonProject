<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="p_category">
	<h2>商品分类</h2>

	<c:forEach items="${sessionScope.parentTypeList }" var="parentType">
		<dl>
			<dt>
				<a href="#">${parentType.type_name  }</a>
			</dt>
			<c:forEach items="${parentType.childTypeList }" var="childType">
				<dd>
					<a href="#">${childType.type_name }</a>
				</dd>
			</c:forEach>
		</dl>
	</c:forEach>


</div>

