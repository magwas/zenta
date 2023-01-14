FROM ubuntu:bionic

#RUN locale-gen en_US en_US.UTF-8 && \
#    dpkg-reconfigure locales

RUN apt-get update

RUN apt-get -o Dpkg::Options::="--force-confold" --force-yes -fuy upgrade

RUN apt-get -y install software-properties-common 
RUN add-apt-repository ppa:openjdk-r/ppa -y
RUN apt-get update
RUN apt-get -y install openjdk-8-jdk maven git firefox libwebkitgtk-3.0-0 tightvncserver debhelper devscripts sudo
RUN apt-get -y install vim
RUN mkdir -p /usr/local/toolchain/features
COPY sudoers /etc/sudoers
RUN  chown root.root /etc/sudoers && \
	chmod 440 /etc/sudoers && \
	touch /usr/local/toolchain/features/sudoers
RUN apt-get -y --purge remove openjdk-11-jre-headless && \
	touch /usr/local/toolchain/features/nojava11
COPY entrypoint /usr/local/toolchain/tools/entrypoint
RUN git config --global user.email "mag+zentabuld@magwas.rulez.org"
RUN git config --global user.name "magwas/edemotest:zentabuild docker image"

ENTRYPOINT ["/usr/local/toolchain/tools/entrypoint"]

