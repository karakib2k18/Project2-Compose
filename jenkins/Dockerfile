
FROM jenkins/jenkins:lts-jdk17

USER root
# Install Docker CLI + handy tools for scripts/pipelines
RUN apt-get update \
 && apt-get install -y docker.io jq curl \
 && rm -rf /var/lib/apt/lists/*

USER jenkins
