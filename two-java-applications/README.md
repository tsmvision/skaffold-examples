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

Open new terminal

$ minikube tunnel

Move to the other terminal

testing app01 (Java Spring Boot)

```
$ curl http://localhost:8080
```
testing app02 (Java Spring Boot)

```
$ curl http://localhost:8081
```

testing app03 (Kotlin Spring Boot)

```
$ curl http://localhost:8082
```

testing app04 (Vite React Nginx)

```
$ curl http://localhost:8083
```

These testings with sub urls are not working at this time (ingress not working correctly)

```
$ curl http://192.168.49.2/app01

$ curl http://192.168.49.2/app02

$ curl http://192.168.49.2/app03

$ curl http://192.168.49.2/app04
```

### How to debug applications using IntelliJ

- Go to Run / Debug Configuration
- add "Cloud Code: Kubernetes" by pressing "+" button in the left
- Setup correctly

- Run debug button
- add breakpoint in the code line

- Make sure the breakpoint works as expected

