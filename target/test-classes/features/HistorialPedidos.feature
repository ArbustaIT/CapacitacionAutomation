#Author: Jhorman Villalva
# encoding: utf-8
@tag
Feature: Historial de pedidos
       como usuario
       quiero acceder a cuenta de cliente
       para ver historial de pedidos y detalles
       
  Background:
  Given que el usuario se encuentra en la pagina de autopractice
  @tag1    
  Scenario: PDF de orden de compra
  When  accedo al PDF de una orden
  Then  se descarga la orden en PDF
 @tag2
  Scenario: Detalle de una orden de compra
  When  selecciono el detalle de una orden
  Then  se despliega la información de la orden
  @tag3
 Scenario: Reordenar una compra
  When  selecciono reordenar en una orden
  Then  me redirecciona al proceso de compra
  
  