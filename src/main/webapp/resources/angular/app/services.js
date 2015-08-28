var services = angular.module('Services', ['ngResource']);

services.factory('TarifasService', function($resource) {

	return $resource('tarifas/list/:id', {
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