# hibernate-envers-sample

An example of how to use Hibernate Envers.

Basically we need the AuditConfigClass, add @Audited to the desired entities and look at the [documentation](https://docs.jboss.org/hibernate/orm/current/userguide/html_single/Hibernate_User_Guide.html#envers-queries) to find out how to create our queries.

# Test requests:

## Create
```
curl -d '{"name":"value","childs":[{"name":"batatinha"}]}' -H "Content-Type: application/json" -X POST http://localhost:8080/test

```

## Update
```
curl -d '{"name":"value","id":"1","childs":[{"name":"batatinha2","id":"1"}]}' -H "Content-Type: application/json" -X PUT http://localhost:8080/test

```

## Obtain the versions
```
curl  http://localhost:8080/test/audit

```
