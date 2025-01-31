# Docker-Assignment
Install wsl docker, mongodb database and redis on your system
Open wsl commond prompt
Stop all running containers + Remove All Containers and images with below docker commands
docker stop $(docker ps -aq)
docker rm $(docker ps -aq)
docker rmi $(docker images -q)
Run docker images and container with below command in docker_assignment path 
docker-compose up -d or docker-compose up
Stop docker images and docker container with below command
docker-compose down


