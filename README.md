# Project2-Compose

# ISEC6000 Assignment 2 - Docker Compose Configuration
KAZI ABDUR RAKIB - 22345440

This repository contains Docker Compose configuration for Jenkins with Docker-in-Docker (DinD) setup.

## Components

- **Jenkins Master**: Main Jenkins instance with web interface
- **Docker-in-Docker**: Secure container for building Docker images
- **Security Configuration**: Automated user setup and security hardening

## Usage

```bash
# Start the services
docker-compose up -d

# Check status
docker-compose ps

# View logs
docker-compose logs jenkins

# Stop services
docker-compose down
## Security Features

- Disabled anonymous access
- Custom user accounts (admin/pipeline-user)
- TLS-secured Docker daemon communication
- Isolated container networking