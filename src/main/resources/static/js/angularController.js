"use strict";
var app = angular.module('ReservationList', []);

app.config(function ($interpolateProvider) {
    // Hello spring, meet angular
    $interpolateProvider.startSymbol('{|{');
    $interpolateProvider.endSymbol('}|}');
});

app.controller('ReservationListController', function ReservationListController($scope, $http) {

    //  Function to retrieve all the posts
    $scope.allReservations = function () {
        $http.get('/reservation').success(function (data) {
            $scope.reservations = data._embedded.reservation;
        });
    };

    //  Function to delete the post
    $scope.deleteItem = function (url) {
        $http.delete(url).success(function () {
            $scope.allReservations();
        })
    };

    //  Populate the list on first load, otherwise page would be empty
    $scope.allReservations();

});