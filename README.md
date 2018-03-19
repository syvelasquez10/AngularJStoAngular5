# Conversor de AngularJs a Angular5

Es un proyecto de Ingeniería basada en modelos (MDE por sus siglas en ingles). 
Se define un metamodelo que abstrae una aplicación AngularJs con el objetivo de aplicar transformaciones sobre dicho modelo, para actualizar dicha aplicación a Angular5.

## Alcance 

El alcance del proyecto, es sobre aplicaciones AngularJs bien definidas, es decir, que no esten en un solo archivo y maneje las buenas practicas de definicion de contoladores y templates. No como esto. 

~~~~
angular.
  module('phonecatApp').
  component('phoneList', {
    template:
        '<ul>' +
          '<li ng-repeat="phone in $ctrl.phones">' +
            '<span>{{phone.name}}</span>' +
            '<p>{{phone.snippet}}</p>' +
          '</li>' +
        '</ul>',
    controller: function PhoneListController() {
      this.phones = [
        {
          name: 'Nexus S',
          snippet: 'Fast just got faster with Nexus S.'
        }, {
          name: 'Motorola XOOM™ with Wi-Fi',
          snippet: 'The Next, Next Generation tablet.'
        }, {
          name: 'MOTOROLA XOOM™',
          snippet: 'The Next, Next Generation tablet.'
        }
      ];
    }
  });

 ~~~~

## Tiempo invertido

El presupuesto de (meta)desarollo fue 3 ingenieros, cada uno que le invirtio 5 horas a esta iteración. Dando un total de 15 horas.
Se utilizo aproximadamente 2 horas para levantamiento de documentación y entendimiento del dominio. 1 hora para creación de una primera versión del modelo (por cada ingeniero) y 2 horas para construir la versión final del metamodelo a partir de lo que cada uno abstrajo. 

## Autores

Wendell Arias, Jairo Bautista, Sergio Velasquez, 