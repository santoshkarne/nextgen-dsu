	#Pull base image
    FROM ubuntu:latest
    #Install Apache
    RUN apt-get update -y && apt-get install apache2 apache2-utils unzip -y
	#Define default port
    EXPOSE 80
	# Copy this repo into place.
    ENTRYPOINT [ "/usr/sbin/apache2ctl" ]
	#Define default command
	ADD *.zip /var/www/html/bandh/
	RUN unzip /var/www/html/bandh/account-balanaces-apache-0.0.1-SNAPSHOT-docs.zip -d /var/www/html/bandh
    CMD [ "-D", "FOREGROUND" ]