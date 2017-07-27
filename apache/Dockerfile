	#Pull base image
    FROM ubuntu:latest
    #Install Apache
    RUN apt-get update -y && apt-get install apache2 apache2-utils -y
	#Define default port
    EXPOSE 80
	# Copy this repo into place.
	VOLUME ["/var/www", ""]
    ENTRYPOINT [ "/usr/sbin/apache2ctl" ]
	#Define default command
    CMD [ "-D", "FOREGROUND" ]