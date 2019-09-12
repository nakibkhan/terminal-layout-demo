FROM postgres:9.6.10-alpine

ADD SQL_setup.sql /docker-entrypoint-initdb.d/

EXPOSE 5432

CMD ["postgres"]