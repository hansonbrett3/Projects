<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DVD Library</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
              rel="stylesheet">
        <link rel="shortcut icon"
              href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>DVD Library</h1>
            <hr/>
        </div>
        <div class="container">
            <h1>New DVD Form</h1>
            <a href="displayDvdLibraryNoAjax">DVD Library (No Ajax)</a><br/>
            <hr/>
            <sf:form class="form-horizontal" role="form" modelAttribute="dvd" action="editDvdNoAjax"
                     method="POST">
                <div class="form-group">
                    <label for="add-title" class="col-md-4 control-label">Title:</label>
                    <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-title" path="title"
                                  placeholder="Title"/>
                        <sf:errors path="title" cssclass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-released" class="col-md-4 control-label">Release Date:</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-released" path="released" 
                                  placeholder="Release Date" />
                        <sf:errors path="released" cssclass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-mpaa" class="col-md-4 control-label">MPAA Rating:</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-mpaa" path="mpaa" 
                                  placeholder="MPAA Rating" />
                        <sf:errors path="mpaa" cssclass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-director" class="col-md-4 control-label">Director Name:</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-director" path="director" 
                                  placeholder="Director Name" />
                        <sf:errors path="director" cssclass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-studio" class="col-md-4 control-label">Studio:</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-studio" path="studio" 
                                  placeholder="Studio" />
                        <sf:errors path="studio" cssclass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-rating" class="col-md-4 control-label">User Rating:</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-rating" path="rating" 
                                  placeholder="User Rating" />
                        <sf:errors path="rating" cssclass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add-note" class="col-md-4 control-label">Note:</label>
                        <div class="col-md-8">
                        <sf:input type="text" class="form-control" id="add-note" path="note" 
                                  placeholder="Note" />
                        <sf:errors path="note" cssclass="error"></sf:errors>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="add-button" class="btn btn-default">Add New DVD</button>
                        </div>
                    </div>
            </sf:form>
        </div>     
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>