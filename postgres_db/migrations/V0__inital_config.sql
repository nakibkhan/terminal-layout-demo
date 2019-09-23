CREATE SCHEMA terminal;

ALTER ROLE terminal_layout_demo WITH NOCREATEDB NOCREATEROLE NOINHERIT;

GRANT USAGE ON SCHEMA terminal TO terminal_layout_demo;

ALTER DEFAULT PRIVILEGES IN SCHEMA terminal GRANT SELECT, INSERT, UPDATE, DELETE ON TABLES TO terminal_api;
