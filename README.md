# Microservices playground

This is a simple weather app. It demonstrates solutions for common microservice architecture related problems:
- local development and testing
- configuration management
- service discovery
- log management

## Deployment

### Supported deployment scenarios
- dev environment with docker compose
- EC2 Container Service
- Google Container Engine (Kubernetes)
- TODO: Mesos with Marathon

### Running locally with docker compose
1. Build fat jars:
```mvn clean package```
2. Run eureka-server and config-server:
```docker-compose --file docker-compose-deps.yml up```
3. Run webapp and weather service:
```docker-compose --file docker-compose.yml up```

### Running on EC2 Container Service
Create CloudFormation stack from /infrastructure/aws/ecs.template
