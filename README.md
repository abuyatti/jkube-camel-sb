# jkube-camel-sb
Eclipse JKube :: Quickstarts :: Camel - Spring Boot

--------------------------------------------------
# src/main/jkube/
configmap.yml deployment.yml service.yml

--------------------------------------------------
# Building Docker image
mvn k8s:build -Pkubernetes

# Generating Kubernetes Manifests
mvn k8s:resource -Pkubernetes

# Deploying application onto Kubernetes
mvn k8s:apply -Pkubernetes

# Deploying on Kubernetes (Plain Docker Build)
mvn k8s:build k8s:resource k8s:apply -Pkubernetes

--------------------------------------------------
# Once everything is done, clean up using undeploy goal:
mvn k8s:undeploy -Pkubernetes
