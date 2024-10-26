#!/bin/bash

minikube start
minikube addons enable ingress
skaffold config set --global local-cluster true
eval $(minikube -p custom docker-env)
