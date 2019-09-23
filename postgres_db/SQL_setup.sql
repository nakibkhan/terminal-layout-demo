CREATE ROLE flyway LOGIN PASSWORD 'flyway_ps' SUPERUSER CREATEDB CREATEROLE REPLICATION;
CREATE ROLE terminal_layout_demo PASSWORD 'terminal_layout_demo_ps' CREATEDB CREATEROLE INHERIT;
CREATE ROLE terminal_layout_demo_readonly LOGIN PASSWORD 'terminal_layout_demo_readonly_ps';

CREATE DATABASE terminal_layout_demo;
