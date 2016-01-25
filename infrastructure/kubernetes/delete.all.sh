#!/usr/bin/env bash
kubectl delete -f eureka-server-controller.yaml
kubectl delete -f eureka-server-service.yaml
kubectl delete -f config-server-controller.yaml
kubectl delete -f config-server-service.yaml
kubectl delete -f weather-service-controller.yaml
kubectl delete -f weather-service-service.yaml
kubectl delete -f webapp-controller.yaml
kubectl delete -f webapp-service.yaml