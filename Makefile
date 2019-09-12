MAKEFLAGS += --silent
all=docker-image
.PHONY: all
.ONESHELL: all

VERSION = $(shell git rev-parse --short HEAD)

default:
    echo No default Rule

start-db:
    docker-compose up --build -d && sleep 5 && ./scripts/flyway-migrate.sh


