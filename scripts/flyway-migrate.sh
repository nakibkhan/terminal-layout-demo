#!/usr/bin/env bash

flyway_script_path=$(cd "$(dirname "${0}")" ; cd .. ; pwd -P)

flyway migrate -user=flyway -password=flyway_ps -url='jdbc:postgresql://localhost:5432/terminal_layout_demo' -locations=filesystem:${flyway_script_path}/postgres-db/migrations
