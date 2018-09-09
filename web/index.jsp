<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Information Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/angular.js" type="text/javascript"></script>
        <script src="js/app.js" type="text/javascript"></script>
        <style type="text/css">
            .header, .footer-area{
                border: 1px solid #DDD;
                padding: 20px;
                margin-top: 10px;
                box-shadow: 0px 0px 10px #DDD;
            }
            .content-area, .menu{
                margin-top: 10px;
            }
            .sidebar, .content{
                border: 1px solid #DDD;
                padding: 20px;
                box-shadow: 0px 0px 10px #DDD;
            }

        </style>
    </head>
    <body ng-controller="myCtrl">

        <div class="container">
            <div class="row">

                <div class="header col-md-12">
                    <center><h1>Employee Information Form</h1></center>
                </div>

                <div class="menu col-md-12">
                    <div class="row">
                        <div class="sidebar col-md-8"></div>
                        <div>
                        <nav class="navbar navbar-default">
                            <div class="container-fluid">
                                <ul class="nav navbar-nav">
                                    <li class="active"><a href="index.jsp">Home</a></li>
                                    <li><a href="#">Employee</a></li>
                                    <li><a href="#">About Us</a></li>
                                    <li><a href="#">Blog</a></li>
                                </ul>
                            </div>
                        </nav>
                        </div>
                    </div>
                </div>

                <div class="col-md-12 content-area">
                    <div class="row">
                        <div class="sidebar col-md-3">
                            <ul class="">
                                <li class="active"><a href="#">Home</a></li>
                                <li><a href="#">Search Employee</a></li>
                                <li><a href="#">Calculate Salary</a></li>
                                <li><a href="#">Feedback</a></li>
                            </ul>
                        </div>

                        <div class="content col-md-9">

                            <button data-toggle="modal" data-target="#myModalSave" type="button" class="btn btn-success">Add New Employee</button>
                            <br/>
                            <br/>
                            <div class="alert alert-success alert-dismissable" ng-show="message">
                                <a href="#" class="close" ng-click="messageClose()">&times;</a>
                                <strong>Success!</strong> {{message}}
                            </div>
                            <table class="table table-striped table-bordered">
                                <thead>
                                    <tr>
                                        <th>Employee ID</th>
                                        <th>Employee Name</th>
                                        <th>Salary</th>
                                        <th>Contact No</th>
                                        <th colspan="2">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr ng-repeat="employee in employees">
                                        <td>{{$index + 1}}</td>
                                        <td>{{employee.emp_name|uppercase}}</td>
                                        <td>{{employee.salary}}</td>
                                        <td>{{employee.cell}}</td>
                                        <td><button data-toggle="modal" data-target="#myModalEdit" type="button" class="btn btn-primary" ng-click="selectEmployee(employee)">Edit</button></td>
                                        <td><button data-toggle="modal" data-target="#myModalDelete" type="button" class="btn btn-danger" ng-click="selectEmployee(employee)">Delete</button></td>
                                    </tr>
                                </tbody>
                            </table>

                            <!-- Save Modal -->
                            <div id="myModalSave" class="modal fade" role="dialog">
                                <div class="modal-dialog">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title">Insert Employee</h4>
                                        </div>
                                        <div class="modal-body">

                                            <form>
                                                <div class="form-group">
                                                    <label for="emp_name">Employee Name:</label>
                                                    <input ng-model="newEmployee.emp_name" type="text" class="form-control" id="emp_name">
                                                </div>
                                                <div class="form-group">
                                                    <label for="salary">Salary:</label>
                                                    <input ng-model="newEmployee.salary" type="text" class="form-control" id="salary">
                                                </div>
                                                <div class="form-group">
                                                    <label for="cell">Contact No: </label>
                                                    <input ng-model="newEmployee.cell" type="text" class="form-control" id="cell">
                                                </div>

                                                <button ng-click="saveEmployee()" data-dismiss="modal" type="submit" class="btn btn-success">Submit</button>
                                            </form>

                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        <!-- Edit Modal -->
                            <div id="myModalEdit" class="modal fade" role="dialog">
                                <div class="modal-dialog">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title">Update Employee</h4>
                                        </div>
                                        <div class="modal-body">

                                            <form>
                                                <div class="form-group">
                                                    <label for="emp_name">Employee Name:</label>
                                                    <input ng-model="clickedEmployee.emp_name" type="text" class="form-control" id="emp_name">
                                                </div>
                                                <div class="form-group">
                                                    <label for="salary">Salary:</label>
                                                    <input ng-model="clickedEmployee.salary" type="text" class="form-control" id="salary">
                                                </div>
                                                <div class="form-group">
                                                    <label for="cell">Contact No: </label>
                                                    <input ng-model="clickedEmployee.cell" type="text" class="form-control" id="cell">
                                                </div>

                                                <button ng-click="updateEmployee()" data-dismiss="modal" type="submit" class="btn btn-success">Submit</button>
                                            </form>

                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>

                                </div>
                            </div>

                            <!-- Delete Modal -->
                            <div id="myModalDelete" class="modal fade" role="dialog">
                                <div class="modal-dialog">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title">Delete Employee</h4>
                                        </div>
                                        <div class="modal-body">

                                            You are now delete {{clickedEmployee.emp_name}}

                                        </div>
                                        <div class="modal-footer">
                                            <button ng-click="deleteEmployee()" type="button" class="btn btn-success" data-dismiss="modal">Ok</button>
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-12 footer-area">
                    <center>&COPY Copyright by Jakir</center>
                </div>
                
            </div>
        </div>
    </body>
</html>
