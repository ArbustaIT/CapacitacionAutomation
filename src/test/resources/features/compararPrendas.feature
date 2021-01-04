#Author: Abel Cejas
# encoding: utf-8

Feature: Comparar Prendas

	Como usuario 
	quiero comparar prendas
	Para visualizar su información.

  Scenario: Comparar una prenda
    
	Given que el usuario seleccionó una prenda para comparar
	When ingreso al comparador
	Then se visualiza un cartel advirtiendo que falta otra prenda

  Scenario: Comparar dos prendas
    
	Given que el usuario seleccionó dos prendas para comparar
	When ingreso al comparador
	Then se visualiza una columna por prenda con la información respectiva

  Scenario: Comparar tres prendas
    
	Given que el usuario seleccionó tres prendas para comparar
	When ingreso al comparador
	Then se visualiza una columna por prenda con la información respectiva

  Scenario: Seleccionar mas de tres prendas para comparar
    
	Given que el usuario seleccionó tres prendas para comparar
	When selecciono una cuarta prenda
	Then se impide agregar la prenda y se despliega un cartel de advertencia


	