# mil-geial521ml - Database Systems MSc

## Project setup
1. Downloaded [spring](https://start.spring.io/) with Java 17 version
2. Configured Docker with Mongodb and Mongo express
3. Created previously xml homework with objects
![geial521_ml_er (1)](https://github.com/plummogo/mil-geial521ml/assets/16595977/6f18cb1d-6649-458e-ab41-6045ab781dbb)

4. Created controller, service and repositories
5. Handle Create, Update, Delete rest requests
6. Tested with Postman

## Rest URL
API test helper for POSTMAN (FIDLER OR etc) for testing CRUD functionalities.

Method | URL example | Body
---|---|---
GET | http://localhost:8080/api/v1/map | -
POST | http://localhost:8080/api/v1/map/post | {"Id":1234,"Description":"2023.map-object_ddm:23112","Coordinates":{"Id":1,"X":12.12312,"Y":23.23423,"Format":"DDM"},"Cages":[{"Id":4,"CageNumber":"C1","ComponentType":{"Id":2,"Type":"cage"},"ConnectedRing":{"Id":1,"SerialNumber":"2023v4","ComponentType":{"Id":3,"Type":"ring"},"Radius":0.2,"ConnectedCageId":4}},{"Id":5,"CageNumber":"C2","ComponentType":{"Id":2,"Type":"cage"},"ConnectedRing":{"Id":2,"SerialNumber":"2023v5","ComponentType":{"Id":3,"Type":"ring"},"Radius":0.223,"ConnectedCageId":5}},{"Id":6,"CageNumber":"C3","ComponentType":{"Id":2,"Type":"cage"},"ConnectedRing":{"Id":3,"SerialNumber":"2023v6","ComponentType":{"Id":3,"Type":"ring"},"Radius":0.2432,"ConnectedCageId":6}}],"Buoys":[{"Id":5,"Description":"B1","ComponentType":{"Id":1,"Type":"buoy"}},{"Id":6,"Description":"B2","ComponentType":{"Id":1,"Type":"buoy"}},{"Id":7,"Description":"B3","ComponentType":{"Id":1,"Type":"buoy"}},{"Id":8,"Description":"B4","ComponentType":{"Id":1,"Type":"buoy"}}]}
PUT | http://localhost:8080/api/v1/map/put | {"Id":1234,"Description":"Changed_DESCRIPTION","Coordinates":{"Id":1,"X":12.12312,"Y":23.23423,"Format":"DDM"},"Cages":[{"Id":4,"CageNumber":"C1","ComponentType":{"Id":2,"Type":"cage"},"ConnectedRing":{"Id":1,"SerialNumber":"2023v4","ComponentType":{"Id":3,"Type":"ring"},"Radius":0.2,"ConnectedCageId":4}},{"Id":5,"CageNumber":"C2","ComponentType":{"Id":2,"Type":"cage"},"ConnectedRing":{"Id":2,"SerialNumber":"2023v5","ComponentType":{"Id":3,"Type":"ring"},"Radius":0.223,"ConnectedCageId":5}},{"Id":6,"CageNumber":"C3","ComponentType":{"Id":2,"Type":"cage"},"ConnectedRing":{"Id":3,"SerialNumber":"2023v6","ComponentType":{"Id":3,"Type":"ring"},"Radius":0.2432,"ConnectedCageId":6}}],"Buoys":[{"Id":5,"Description":"B1","ComponentType":{"Id":1,"Type":"buoy"}},{"Id":6,"Description":"B2","ComponentType":{"Id":1,"Type":"buoy"}},{"Id":7,"Description":"B3","ComponentType":{"Id":1,"Type":"buoy"}},{"Id":8,"Description":"B4","ComponentType":{"Id":1,"Type":"buoy"}}]}
DELETE | http://localhost:8080/api/v1/map/delete/1234 | 
