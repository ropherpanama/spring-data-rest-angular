var services = angular.module('Services', [ 'ngResource' ]);

//services.factory('globalService', function() {
//	return {
//		styles : ['alert alert-error alert-dismissible']
//	  };
//});

services.factory('alertService', function($rootScope) {
	
	var alertService = {};

	$rootScope.alerts = [];

	alertService.add = function(type, msg) {
		$rootScope.alerts.push({
			'type' : type,
			'msg' : msg
		});
	};
	
	alertService.reset = function() {
		//reset the array alerts :(
		$rootScope.alerts = [];
	};

	return alertService;
});

services.factory('TarifasService', function($resource) {

	return $resource('api/tarifas/:id', {
		id : '@id'
	});
});

services.factory('EstadosService', function($resource) {

	return $resource('estados/list/:id', {
		id : '@id'
	});
});

services.factory('CategoriasService', function($resource) {

	return $resource('categorias/list/:id', {
		id : '@id'
	});
});

services.factory('DepartamentosService', function($resource) {

	return $resource('rh_deptos/list/:id', {
		id : '@id'
	});
});

services.factory('CargosService', function($resource) {

	return $resource('rh_cargos/list/:id', {
		id : '@id'
	});
});

services.factory('RoomsService', function($resource) {

	return $resource('rooms/list/:id', {
		id : '@id'
	});
});

services.factory('ClientesService', function($resource) {

	return $resource('clientes/list/:id', {
		id : '@id'
	});
});
