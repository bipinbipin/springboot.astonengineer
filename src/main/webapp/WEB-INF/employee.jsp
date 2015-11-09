<%@include file="includes/header.jsp" %>
<%@include file="includes/navbar.jsp" %>

<%@include file="includes/subnav_employee.jsp" %>


<div>
    <div class="container form-container">
        <form:form class="form-horizontal" modelAttribute="employee" action="/employee" method="post">
            <fieldset>
                <legend>Employee Details</legend>
                <form:input type="hidden" path="id"/>
                <form:input type="hidden" path="version"/>
                <form:input type="hidden" path="person.id"/>
                <form:input type="hidden" path="person.version"/>


                <!-- ATTEMPT TO ALIGN INPUT BOXES HORIZONTALLY -->
                <!--
                <div class="row">
                    <div class="col-xs-4">
                        <div class="form-group">
                            <%--<label for="inputFirstName" class="col-sm-2 control-label">First Name</label>--%>

                            <div class="col-sm-10">
                                <form:input type="text" class="form-control" id="inputFirstName" placeholder="First Name"
                                            path="person.firstname" value="${employee.person.firstname}"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-4">
                        <div class="form-group">
                            <%--<label for="inputMiddleName" class="col-sm-2 control-label">Middle Name</label>--%>

                            <div class="col-sm-10">
                                <form:input type="text" class="form-control" id="inputMiddleName" placeholder="Middle Name"
                                            path="person.middlename" value="${employee.person.middlename}"/>
                            </div>
                        </div>
                    </div>
                </div>
                -->

                <div class="form-group">
                    <label for="inputFirstName" class="col-sm-2 control-label">First Name</label>

                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="inputFirstName" placeholder="First Name"
                                    path="person.firstname" value="${employee.person.firstname}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputMiddleName" class="col-sm-2 control-label">Middle Name</label>

                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="inputMiddleName" placeholder="Middle Name"
                                    path="person.middlename" value="${employee.person.middlename}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputLastName" class="col-sm-2 control-label">Last Name</label>

                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="inputLastName" placeholder="Last Name"
                                    path="person.lastname" value="${employee.person.lastname}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputBirthDate" class="col-sm-2 control-label">Birthdate</label>

                    <div class="col-sm-10">
                            <%--Used to convert string to allow for use in a date input field--%>
                        <fmt:formatDate value="${employee.person.birthdate}" var="birthdateString"
                                        pattern="dd/MM/yyyy"/>
                        <form:input type="text" class="form-control" id="inputBirthDate" placeholder="dd/mm/yyyy"
                                    path="person.birthdate" value="${birthdateString}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputSSN" class="col-sm-2 control-label">SSN</label>

                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="inputSSN" placeholder="Social Security Number"
                                    path="person.socialsecuritynumber" value="${employee.person.socialsecuritynumber}"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="Category" class="col-lg-2 control-label">Category</label>
                    <div class="col-lg-10">
                        <select class="form-control" id="Category">
                            <option value="0">(Select Category)</option>
                            <c:forEach var="category" items="${EmployeeCategory}">
                                <c:choose>
                                    <c:when test="${category.id == employee.category.id}">
                                        <option value="${category.id}" selected="true">${category.entityTypeValue}</option>
                                    </c:when>
                                    <c:otherwise>
                                        <option value="${category.id}">${category.entityTypeValue}</option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="textArea" class="col-sm-2 control-label">Background</label>

                    <div class="col-sm-10">
                        <form:textarea class="form-control" rows="3" id="textArea"
                                       path="background" value="${employee.background}"/>
                        <span class="help-block">A short description of the employee's background.</span>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <button type="reset" class="btn btn-default">Cancel</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </fieldset>
        </form:form>
    </div>
</div>


<%@include file="includes/footer.jsp" %>
