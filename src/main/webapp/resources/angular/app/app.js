// Wrapping your Javascript in a closure is a good habit!
'use strict';

var app = angular.module('hotel-app', ['Controllers', 'ngRoute', 'ui.bootstrap']);

var urlBase="http://localhost:8080/hoteleria-app/api/";

var alertMessage = 'No pasa nada';

app.config(['$routeProvider', function($routeProvider) {
	
				$routeProvider.when('/', {
					templateUrl: 'views/public/welcome.html'
				});
	
				$routeProvider.when('/dashboard', {
					templateUrl: 'views/secure/partials/dashboard.html',
					controller: 'DashboardController'
				});
	
				$routeProvider.when('/tarifas', {
					templateUrl: 'views/secure/partials/tarifas-dashboard.html',
					controller: 'TarifasListController'
				});
				
				$routeProvider.when('/estados', {
					templateUrl: 'views/secure/partials/estados-dashboard.html',
					controller: 'EstadosController'
				});
				
				$routeProvider.when('/categorias', {
					templateUrl: 'views/secure/partials/categorias-dashboard.html',
					controller: 'CategoriasController'
				});
				
				$routeProvider.when('/departamentos', {
					templateUrl: 'views/secure/partials/rhdeptos-dashboard.html',
					controller: 'DepartamentosController'
				});
				
				$routeProvider.when('/cargos', {
					templateUrl: 'views/secure/partials/rhcargos-dashboard.html',
					controller: 'CargosController'
				});
				
				$routeProvider.when('/habitaciones', {
					templateUrl: 'views/secure/partials/habitaciones-dashboard.html',
					controller: 'RoomsController'
				});
				
				$routeProvider.when('/clientes', {
					templateUrl: 'views/secure/partials/clientes-dashboard.html',
					controller: 'ClientesController'
				});
				
				$routeProvider.when('/inf_reservas', {
					templateUrl: 'views/secure/partials/informe-reserva.html',
					controller: 'InfReservaController'
				});
				
				$routeProvider.otherwise({
					redirectTo: '/'
				});

}]);

