
# Course Microservice : Spring Boot & Spring Cloud

## Requirements

- Java 11 
- Spring Boot 2
- Gradle 
- CURL
- JQ
- Docker

## Services


### Config Service
http://localhost:8090/customer-service/default

### Discovery  Service (Eureka)
    
http://localhost:8099/


### Microservice Product
GET

    curl -X GET http://localhost:8091/products  -H 'Accept: application/json' | jq '.'

POST

    curl  --request POST 'localhost:8091/products' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "name":"Wallabee Men'\''s Suede Shoe",
    "description":"Comfort and tendency do not have to be at odds. This suede wallabee style shoe is all you need for marathon work days. With soft suede design and stitched details, it is perfect to combine with jeans",
    "stock":4,
    "price":30,
    "category":{"id":1,"name": "shoes"}
    }'
### Microservice Customer
GET

    curl -X GET http://localhost:8092/customers    -H 'Accept: application/json' | jq '.'

POST

    curl --request POST 'localhost:8092/customers' \
    --header 'Content-Type: application/json' \
    --data-raw '
        {
            "numberID":"40408083",
            "firstName": "Luis",
            "lastName": "rodriguez",
            "email": "profesor@digitallab.academy",
            "photoUrl": "",
            "region": {
                "id": 1
            }
        }
    '

### Microservice Shopping
GET
    curl -X GET http://localhost:8093/invoices/1 -H 'Accept: application/json' | jq '.'

POST

    curl  --request POST 'localhost:8093/invoices' \
    --header 'Content-Type: application/json' \
    --data-raw '{

        "numberInvoice": "002",
        "description": "invoice store",
        "customerId": 1,
        "items": [
            {
                "quantity": 1,
                "priceItem": 178.89,
                "productId": 1
            },
    
            {
                "quantity": 2,
                "priceItem": 40.06,
                "productId": 3
            }
        ]
    }'

### Gateway Service 

Customer

    curl -X GET http://localhost:8080/customers    -H 'Accept: application/json' | jq '.'

Products

    curl -X GET http://localhost:8080/products  -H 'Accept: application/json' | jq '.'


Invoices

    curl -X GET http://localhost:8080/invoices/1 -H 'Accept: application/json' | jq '.'




