var appControllers = angular.module('Controllers', [ 'Services' ]);
	
appControllers.controller('TarifasListController', function($http, $scope) {

	$http.defaults.headers.post["Content-Type"] = "application/json";

	$scope.description = "Tarifas registradas en el sistema";

	$scope.loadData = function() {
		$scope.buscando = true;
		$http.get(urlBase + 'tarifas').success(function(data) {

			if (data._embedded != undefined) {
				$scope.tarifas = data._embedded.tarifas;
				$scope.buscando = false;
			} else {
				$scope.tarifas = [];
			}
		});
	}

});

appControllers.controller('EstadosController', function($http, $scope) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		$http.get(urlBase + 'estados').success(function(data) {

			if (data._embedded != undefined) {
				$scope.estados = data._embedded.estados;
				$scope.buscando = false;
			} else {
				$scope.estados = [];
				$scope.buscando = false;
			}
		});
	}
});

appControllers.controller('CategoriasController', function($http, $scope) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		$http.get(urlBase + 'categorias').success(function(data) {

			if (data._embedded != undefined) {
				$scope.categorias = data._embedded.categorias;
				$scope.buscando = false;
			} else {
				$scope.categorias = [];
				$scope.buscando = false;
			}
		});
	}
});

appControllers.controller('DepartamentosController', function($http, $scope) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		$http.get(urlBase + 'rhareas').success(function(data) {

			if (data._embedded != undefined) {
				$scope.departamentos = data._embedded.rhareas;
				$scope.buscando = false;
			} else {
				$scope.departamentos = [];
				$scope.buscando = false;
			}
		});
	}
});

appControllers.controller('CargosController', function($http, $scope) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		$http.get(urlBase + 'rhcargos').success(function(data) {

			if (data._embedded != undefined) {
				$scope.cargos = data._embedded.rhcargos;
				$scope.buscando = false;
			} else {
				$scope.cargos = [];
				$scope.buscando = false;
			}
		});
	}
});

appControllers.controller('RoomsController', function($http, $scope) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		$http.get(urlBase + 'habitaciones').success(function(data) {

			if (data._embedded != undefined) {
				$scope.rooms = data._embedded.habitaciones;
				$scope.buscando = false;
			} else {
				$scope.rooms = [];
				$scope.buscando = false;
			}
		});
	}
});

appControllers.controller('ClientesController', function($http, $scope) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		$http.get(urlBase + 'clientes').success(function(data) {

			if (data._embedded != undefined) {
				$scope.clientes = data._embedded.clientes;
				$scope.buscando = false;
			} else {
				$scope.clientes = [];
				$scope.buscando = false;
			}
		});
	}
});

appControllers.controller('indexController', function($http, $scope) {

	$http.get(urlBase + 'info').success(function(data) {

		if (data._embedded != undefined) {
			$scope.data = data._embedded.info;
		} else {
			$scope.data = "";
		}
	});
});

appControllers.controller('DashboardController', function($http, $scope) {
	$scope.fecha = new Date();
	$scope.rooms_in_use = 14;
	$scope.rooms_available = 6;
	$scope.checkins = 10;
	$scope.checkouts = 3;
});

appControllers.controller('InfReservaController', function($http, $scope, $filter, alertService) {
	
	//Ini.Control for datepickers
	$scope.dateFrom = new Date();
	$scope.dateTo = new Date();
	
	$scope.dateOptions = {
		formatYear : 'yy',
		startingDay : 1
	};
	
	$scope.formats = [ 'dd-MMMM-yyyy', 'yyyy-MM-dd' ];
	$scope.format = $scope.formats[0];
				
	$scope.statusCalFrom = {
		opened : false
	};
	
	$scope.openCalFrom = function($event) {
		$scope.statusCalFrom.opened = true;
	};
	
	$scope.statusCalTo = {
		opened : false
	};
	
	$scope.openCalTo = function($event) {
		$scope.statusCalTo.opened = true;
	};
	//Fin.Control for datepickers
	
	//Despliega las reservas del dia (implementar con la fecha de hoy)
	$scope.reservasDeHoy = function() {
		$http.get(urlBase + 'reservas').success(function(data) {

			if (data._embedded != undefined) {
				$scope.reservas = data._embedded.reservas;
				$scope.buscando = false;
			} else {
				$scope.reservas = [];
				$scope.buscando = false;
			}
		});
	};
	
	$scope.findByfilter = function() {
		var from = $filter('date')(new Date($scope.dateFrom), $scope.formats[1]);
		var to = $filter('date')(new Date($scope.dateTo), $scope.formats[1]);
		
		$http.get(urlBase + 'reservas/search/findByDateRange?dateFrom=' + from + '&dateTo=' + to).success(function(data) {

			if (data._embedded != undefined) {
				$scope.reservas = data._embedded.reservas;
				$scope.buscando = false;
				alertService.reset();
				
				if($scope.reservas.length <= 0) {
					alertService.add("error", "No existen datos para la consulta");
				}
			} else {
				$scope.reservas = [];
				$scope.buscando = false;
			}
		});
	};
});
