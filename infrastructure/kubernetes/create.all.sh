#!/usr/bin/env bash
kubectl create -f eureka-server-controller.yaml
kubectl create -f eureka-server-service.yaml
kubectl create -f config-server-controller.yaml
kubectl create -f config-server-service.yaml
kubectl create -f weather-service-controller.yaml
kubectl create -f weather-service-service.yaml
kubectl create -f webapp-controller.yaml
kubectl create -f webapp-service.yaml