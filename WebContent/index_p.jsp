<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="menu-box">
	<ul id="menu">
		<li><a id="moveAdmin">ADMIN</a></li>
	</ul>
</div>
<script>
document.getElementById('moveAdmin')	
.addEventListener('click', function (x){
	location.href =
        "/GMS2-PRACTICE/"
        +"admin"
    ;
	});
</script>