# SpringBootExample with docker container

Clone the app
	./gradlew bootRun

Open the browser and try the below
	http://localhost:8080/
	http://localhost:8080/greet

# Docker setup

1) Create a docker-machine 
	Docker machine is a combination of a docker host and a configuration client.
	docker-machine create -d <driver>  <machineName>
    docker-machine create -d virtualbox dev

	Machine created and set up a new VM called dev and started it running with VirtualBox. It installed a lightweight Linux distribution (boot2docker) to host the Docker daemon. Images you use with dev will be stored in the VM and any containers you start will run inside it as well.

2) Setup the docker environment variables
	docker-machine env dev => It displays the list of commands to setup the environment
	eval $(docker-machine env dev)
	*** You will need to repeat this each time you open a new shell.

3) Verify the environment
	docker-machine ls 
	docker-machine help

4) Verify the docker images running on the docker-machine
	docker images
	docker help

# Dockerizing the SpringBootExample 

1) open a new terminal
	Setup the docker environment veriables (step 2 of docker setup)
	docker-machine active (if it returns dev means your machine is active)
	$ cd springBootExample
	$ ./gradlew buildDocker (you will see the build succesful msg)
	$ docker-machine ip dev (you wll see the ip address of dev machine)
	$ docker images (You will see the docker images for the active docker machine)
	$ docker image run -p 8080:8080 -t nagarajujavvaji/spring-boot-docker (to run the docker image)

2) Open the browser and type the <ip>:8080/
	$ docker rmi -f <IMAGE-ID> or <IMAGE-NAME> It remove images from docker-machine
	$ docker ps (It will display the list of containers which are in running)
	$ docker kill <containerId>

	How to stop and delete the docker-machine?
	$ docker-machine stop dev
	$ docker-machine rm dev

 