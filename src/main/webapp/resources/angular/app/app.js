// creacion de modulo principal
// Wrapping your Javascript in a closure is a good habit!
(function() {
//define logic here ...			 
	var app = angular.module('hotel-app', []);
	app.controller('MainController', function(){
	//Only puts a title in the view 
		this.description = "Tarifas en el sistema";	
	});
	
	app.controller('RestController', ['$http', function($http){
		var actual = this;
		actual.codigos = [];
		
		$http.get('http://localhost:8080/hoteleria-app/tarifas/list').success(function(data){
			actual.codigos = data;
		});
	}]);
// logic end
})();
