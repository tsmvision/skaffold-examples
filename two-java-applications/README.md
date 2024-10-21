## Skaffold with two spring boot services

### Prerequisites

[Skaffold](https://skaffold.dev/)

[minikube](https://minikube.sigs.k8s.io/docs/)

### How to run

Run minikube

```
$ minikube start
```
Run skaffold in dev mode
```
$ skaffold dev
```

Make sure that two spring boot services are up and running

```
$ curl http://192.168.49.2/app01

$ curl http://192.168.49.2/app02
```

### How to debug applications using IntelliJ

- Go to Run / Debug Configuration
- add "Cloud Code: Kubernetes" by pressing "+" button in the left
- Setup correctly

- Run debug button
- add breakpoint in the code line

- Make sure the breakpoint works as expected

