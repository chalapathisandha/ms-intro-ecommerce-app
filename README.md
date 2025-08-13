# ms-intro-ecommerce-app

<img width="1668" height="896" alt="image" src="https://github.com/user-attachments/assets/888cd06b-a2c1-4874-86ef-74c809616117" />


application running urls:

Products API:  8050
Relational database (Local H2)

H2 console:
http://localhost:8050/h2-console/
jdbc:h2:mem:product

(Relational db) Tables:
SELECT * FROM PRODUCT 
SELECT * FROM CATEGORY 


List of direct apis urls: 

to get all products from product databse.
GET 
http://localhost:8050/api/v1/products      (gatw way ====  http://localhost:8222/api/v1/products  )

to get specifi product by product id.
GET 
http://localhost:8050/api/v1/products/{product-id}
GET 
http://localhost:8050/api/v1/products/51  (gateway ==== http://localhost:8222/api/v1/products/51 )

Create product :
---------------------

POST   
http://localhost:8050/api/v1/products      (gateway ==== http://localhost:8222/api/v1/products)
{
    "name": "New Wireless Compact Keyboard 1",
    "description": "new Wireless compact keyboard",
    "availableQuantity": 20.0,
    "price": 81.99,
    "categoryId": 1
}

To Purchase a product: 
POST   
http://localhost:8050/api/v1/products/purchase (gate way== http://localhost:8222/api/v1/products/purchase)
[
    {
        "productId": 1,
        "quantity": 2
    },
    {
        "productId": 51,
        "quantity": 5
    }
]


Customer:

customer APi : 8090
mongo db:
use monogo local compass app.


To create new customer.
POST :
http://localhost:8090/api/v1/customers  (gateway === http://localhost:8222/api/v1/customers)

{
    "firstname": "chalapathi",
    "lastname": "Davala",
    "email": "chalapathi.davala@gmail.com",
    "address": {
        "street": "patan cheruvu name",
        "houseNumber": "123",
        "zipCode": "50001"
    }
}

{
    "firstname": "Dhananjayan",
    "lastname": "Santhakumar",
    "email": "dhananjayan.santhakumar@gmail.com",
    "address": {
        "street": "chennai",
        "houseNumber": "123",
        "zipCode": "51001"
    }
}

{
    "firstname": "Sindhu",
    "lastname": "Sundararajanushanandhini",
    "email": "sindhu.sundararajanushanandhini@gmail.com",
    "address": {
        "street": "chennai2",
        "houseNumber": "1233",
        "zipCode": "51041"
    }
}


update customer:
PUT 
http://localhost:8090/api/v1/customers   (gate way = http://localhost:8222/api/v1/customers)
{
    "id": "689ae5df41ee11d5ff7c9188",
    "firstname": "chalapathiRao",
    "lastname": "Davala",
    "email": "chalapathi.davala@gmail.com",
    "address": {
        "street": "patan cheruvu name",
        "houseNumber": "123",
        "zipCode": "50001"
    }
}

customer exists or not:
GET

To check customer exists by id :
GET
http://localhost:8090/api/v1/customers/exists/689ae5df41ee11d5ff7c9188



to get the customer by Id: 
GET
http://localhost:8090/api/v1/customers/689ae5df41ee11d5ff7c9188

To get all customers: 
GET
http://localhost:8090/api/v1/customers (gate way == http://localhost:8222/api/v1/customers)




Payments : 8060
Relational database (Local H2)
H2 console:
http://localhost:8060/h2-console/
jdbc:h2:mem:payment

you should not call payment api, directly as it is depenedent on order api.


Notification: 8040
Mongo db :
you should not call Notification api directly as it is depenedent on order api.




Order : 8070
Relational database (Local H2)
H2 console:
http://localhost:8070/h2-console/
jdbc:h2:mem:order

order apis

create order: 
POST
http://localhost:8070/api/v1/orders (gate way == http://localhost:8222/api/v1/orders )

{
  "reference": "ORD-20250812-XYZ",
  "amount": 1250.50,
  "paymentMethod": "CREDIT_CARD",
  "customerId": "689ae5df41ee11d5ff7c9188",
  "products": [
    {
      "productId": 1,
      "quantity": 2
    },
    {
      "productId": 51,
      "quantity": 1
    }
  ]
}
