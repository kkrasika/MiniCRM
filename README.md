# MiniCRM
MiniCRM

# To Build the Spring Boot Project
gradle build

# To create the docker image 
docker build --build-arg JAR_FILE=build/libs/*.jar -t minicrm-api-docker-img .

# To run the image with docker 
docker run -p 8102:8080 -t minicrm-api-docker-img
cocker-compose up

# Kubernetes 

# To generate a sanbox cluster with minikube
minikube start

# Transfer the docker installation of host OS to minikube cluster
eval $(minikube docker-env)

# Rebuild docker image (same old command)
docker build --build-arg JAR_FILE=build/libs/*.jar -t minicrm-api-docker-img .

# Deploy into Kubernetes-Minikube cluster 
kubectl apply -f minicrm-kube-deployment.yaml

# List the minikube services (to get the accessible url)
minikube service list