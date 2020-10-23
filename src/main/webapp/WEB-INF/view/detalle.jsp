<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix = "x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Detalle Factura - Alvaro Alvarez</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.12.0/css/all.css">
    <link rel="stylesheet" href="assets/css/Highlight-Phone.css">
    <link rel="stylesheet" href="assets/css/Lista-Productos-Canito.css">
    <link rel="stylesheet" href="assets/css/styles.css">   
	<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
    
    <body>
    <div style="margin: 30px;">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <h2 style="width: 343px;"><b>Detalle Factura</b></h2>
                </div>
                <div class="col-md-4 col-xl-4 offset-xl-0 d-inline-block justify-content-end align-self-start">
                    <h5><b>Nombre:</b> <c:if test="${factu != ''}"><c:out value="${factu.cliente}"></c:out></c:if></h5> 
                    <h5><b>Fecha:</b> <c:if test="${factu != ''}"><c:out value="${factu.fecha}"></c:out></c:if></h5>
                </div>
                <div class="col-md-4 d-flex flex-grow-0 flex-shrink-1 justify-content-center align-items-center"><input value="Volver" class="btn btn-primary d-flex align-items-center align-self-center" type="button" style="height: 38px;background-color: rgb(21,221,4);" onclick="location.href='${pageContext.request.contextPath}/index';"></div>
            </div><br><br>
            <div class="row">
                <div class="col-md-12"><table id="example" class="table table-striped table-bordered" >
        <thead>
            <tr>
                <th>Producto</th>
                <th>Precio</th>
                <th>Cantidad</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${detalleFactura}" var="detalle">
				<tr>
					<td><c:out value="${detalle.getProducto().getNombre()}"/></td>
					<td><c:out value="${detalle.getProducto().getValor()}"/></td>
					<td><c:out value="${detalle.getCantidad()}"/></td>	
				</tr>
			</c:forEach>         
        </tbody>
    </table></div>
            </div>
        </div>
    </div>
    <div style="margin: 30px;">
        <div class="container">
            <div class="row">
                <div class="col">
                    <h4><b>Subtotal: $</b> <c:if test="${subtotal != ''}"><c:out value="${subtotal}"></c:out></c:if></h4>
                </div>
            </div><br>
            <div class="row">
                <div class="col">
                    <h4><b>Impuestos: $</b> <c:if test="${subtotal != ''}"><c:out value="${total-subtotal}"></c:out></c:if></h4>
                </div>
            </div><br>
            <div class="row">
                <div class="col">
                    <h4><b>Total: $</b> <c:if test="${total != ''}"><c:out value="${total}"></c:out></c:if></h4>
                </div>
            </div><br>
        </div>
    </div>
     <section class="showcase"></section>
    <footer class="footer bg-light">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 my-auto h-100 text-center text-lg-left">
                    <ul class="list-inline mb-2">
                        <li class="list-inline-item"><a href="http://localhost:8585/Simulacion02/categoria/1">Json Electrónica</a></li>
                        <li class="list-inline-item"><span></span></li>
                        <li class="list-inline-item"><a href="http://localhost:8585/Simulacion02/categoria/2">Json Dormitorio</a></li>
                        <li class="list-inline-item"><span></span></li>
                        <li class="list-inline-item"><a href="http://localhost:8585/Simulacion02/categoria/3">Json Tecno</a></li>
                     </ul>
                    <p class="text-muted small mb-4 mb-lg-0">© Alvaro Alvarez</p>
                </div>
                <div class="col-lg-6 my-auto h-100 text-center text-lg-right">
                    <ul class="list-inline mb-0">
                        <li class="list-inline-item"><a href="#"><i class="fa fa-facebook fa-2x fa-fw"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-twitter fa-2x fa-fw"></i></a></li>
                        <li class="list-inline-item"><a href="#"><i class="fa fa-instagram fa-2x fa-fw"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>