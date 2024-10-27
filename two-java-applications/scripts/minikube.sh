#!/bin/bash

minikube delete
minikube start
minikube addons enable ingress
#minikube addons enable registry
skaffold config set --global local-cluster true
#skaffold config set --global default-repo localhost:5000
eval $(minikube -p custom docker-env)
