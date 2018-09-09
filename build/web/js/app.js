var myApp = angular.module('myApp', []);


myApp.controller('myCtrl', function ($scope, $http) {
    $scope.message = "";
    $scope.error_message = "";

    //get All employee
    $scope.getAllemployee = function () {
        $http({
            mehtod: "GET",
            url: 'http://localhost:8084/Employee_Management_System/webresources/employees'
        }).then(
                function (response) {
                    $scope.employees = response.data;
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );

    };

    $scope.getAllemployee();


    //save employee
    $scope.newEmployee = {};
    $scope.saveEmployee = function () {
        $http({
            method: 'POST',
            url: 'http://localhost:8084/Employee_Management_System/webresources/employees',
            data: angular.toJson($scope.newEmployee),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Employee Saved Successfully";
                    $scope.getAllemployee();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };



    //select employee by click
    $scope.clickedEmployee = {};
    $scope.selectEmployee = function (employee) {
        $scope.clickedEmployee = employee;
    };


    //updte employee
    $scope.updateEmployee = function () {
        $http({
            method: 'PUT',
            url: 'http://localhost:8084/Employee_Management_System/webresources/employees',
            data: angular.toJson($scope.clickedEmployee),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(
                function (response) {
                    $scope.message = "Employee Update Successfully";
                    $scope.getAllemployee();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };

    //delete employee
    $scope.deleteEmployee = function () {
        $http({
            method: 'DELETE',
            url: 'http://localhost:8084/Employee_Management_System/webresources/employees/' + $scope.clickedEmployee.emp_id
        }).then(
                function (response) {
                    $scope.message = "Employee deleted Successfully";
                    $scope.getAllemployee();
                },
                function (reason) {
                    $scope.error_message = reason.data;
                }
        );
    };


    //clear message
    $scope.messageClose = function () {
        $scope.message = "";
        $scope.error_message = "";
    };
});

