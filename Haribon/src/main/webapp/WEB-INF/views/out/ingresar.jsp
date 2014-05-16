<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es"> 
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<head>
<jsp:include page="../plantilla/header.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../plantilla/menu-header.jsp"></jsp:include>
<section>
       <div class="principal"> 
        <!-- Codigo Body Inicio -->
        <div id="map" class="map"> </div>
            <div  class="innerIngresar">  
               <p class="tituloo4"  style="font-size: 40px;">Iniciar sesión en Haribon</p>
            	<form role="form"style="margin-left: 320px;margin-right: 320px;"  >
				  <div class="form-group">
				    <label for="exampleInputEmail1" style="font-size: 16px" >Usuario</label>
				    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Usuario">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1" style="font-size: 16px" >Password&nbsp;&nbsp;<span style="font-weight: bold;color: black" >(Olvidates el <a href="olvido_password.html" ><span style="color:white">Password</span></a>)</span></label>
				    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
				  </div> 
				  <div class="checkbox">
				    <label>
				      <input type="checkbox">No cerrar sesi&oacute;n
				    </label>
				  </div>
				  <button type="button"  onclick="javascript:location='in_registrar_punto_d.html'" class="btn btn-default">Iniciar Sesi&oacute;n</button>
				</form>
            </div>
        <!-- Codigo Body Fin -->
       </div>
</section>
			
<jsp:include page="../plantilla/footer.jsp"></jsp:include>
</body>
</html>