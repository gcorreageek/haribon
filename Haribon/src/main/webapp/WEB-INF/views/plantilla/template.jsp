<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> --%>
<!DOCTYPE html>
<html lang="es"> 
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<head>
<jsp:include page="header.jsp"></jsp:include>
</head>

 <body>  
<jsp:include page="menu-header.jsp"></jsp:include>
    
	<section>
        <div class="principal">  
				<sitemesh:write property='body'/>
        </div>
    </section> 
 
<jsp:include page="footer.jsp"></jsp:include>
  </body>
</html>