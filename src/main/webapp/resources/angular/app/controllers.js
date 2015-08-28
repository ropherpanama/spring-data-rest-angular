var appControllers = angular.module('Controllers', [ 'Services', 'angularModalService' ]);

appControllers.controller('TarifasListController', [ '$http', '$scope', 'TarifasService',
            function($http, $scope, TarifasService) {

			$scope.description = "Tarifas existentes";
			
			$scope.loadData = function() {
				$scope.buscando = true;
				TarifasService.query({}, function(data, status) {
					$scope.codigos = data
					$scope.buscando = false;
				});
			}
			
		} ]);

appControllers.controller('EstadosController', [ '$http', '$scope', 'EstadosService', function($http, $scope, EstadosService) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		EstadosService.query({}, function(data, status) {
			$scope.estados = data
			$scope.buscando = false;
		});
	}
}]);

appControllers.controller('CategoriasController', [ '$http', '$scope', 'CategoriasService', function($http, $scope, CategoriasService) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		CategoriasService.query({}, function(data, status) {
			$scope.categorias = data
			$scope.buscando = false;
		});
	}
}]);

appControllers.controller('DepartamentosController', [ '$http', '$scope', 'DepartamentosService', function($http, $scope, DepartamentosService) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		DepartamentosService.query({}, function(data, status) {
			$scope.departamentos = data
			$scope.buscando = false;
		});
	}
}]);

appControllers.controller('CargosController', [ '$http', '$scope', 'CargosService', function($http, $scope, CargosService) {
	$scope.loadData = function() {
		$scope.buscando = true;
		
		CargosService.query({}, function(data, status) {
			$scope.cargos = data
			$scope.buscando = false;
		});
	}
}]);