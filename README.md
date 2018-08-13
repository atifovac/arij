# arij
Ticket Managing System

### How to start without docker-compose
Before to start the application run the command

`docker run --name arij-core-db -e POSTGRES_PASSWORD=postgres -p 5002:5432 -d postgres`

It runs a postgres image configured as the one used by docker-compose
