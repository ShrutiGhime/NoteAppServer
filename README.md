# NoteAppServer


http://localhost:8081/v1/users/register
{
    "name":"vanita",
    "email":"sai@gmail.com",
    "password":"baba"
}
{
    "success": true,
    "message": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJOT3RlQXV0aGVudGljYXRpb24iLCJpc3MiOiJub3RlU2VydmVyIiwiZW1haWwiOiJzYWlAZ21haWwuY29tIn0.n3HbZOF9NjeTiLqfckc4WEKwdKKg0v3lCeHVXrdYv-TqjSY-whVB7rL_InEhKtYSoObp9m_5pTtJCF_mgdaeDw"
}

{
    "name":"krishna",
    "email":"krishna@gmail.com",
    "password":"1234"
}
{
    "success": true,
    "message": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJOT3RlQXV0aGVudGljYXRpb24iLCJpc3MiOiJub3RlU2VydmVyIiwiZW1haWwiOiJrcmlzaG5hQGdtYWlsLmNvbSJ9.Nj0BlYD7C-pOZvwZEbd7eEa4_x2SaxJk0RjHMirPfP-RiqZV1vJrOiphTH4fwy9zNQouVLvFNCtJLW6BKrbOgg"
}

{
    "name":"om",
    "email":"om@gmail.com",
    "password":"om"
}
{
    "success": true,
    "message": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJOT3RlQXV0aGVudGljYXRpb24iLCJpc3MiOiJub3RlU2VydmVyIiwiZW1haWwiOiJvbUBnbWFpbC5jb20ifQ.FeO7o5Bj9cE8i9aqiFLID0EpqAK8jFnyN47u-D0vJEisfw_1O-2GMILBzNA52x25r9alOMUDWcldXjnqjvuECg"
}
———————————————————
———————————————————
http://localhost:8081/v1/users/login
{
    "email":"sai@gmail.com",
    "password":"baba"
}
{
    "success": true,
    "message": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJOT3RlQXV0aGVudGljYXRpb24iLCJpc3MiOiJub3RlU2VydmVyIiwiZW1haWwiOiJzYWlAZ21haWwuY29tIn0.n3HbZOF9NjeTiLqfckc4WEKwdKKg0v3lCeHVXrdYv-TqjSY-whVB7rL_InEhKtYSoObp9m_5pTtJCF_mgdaeDw"
}
———————————————————
———————————————————
Now copy that above message token 
eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJOT3RlQXV0aGVudGljYXRpb24iLCJpc3MiOiJub3RlU2VydmVyIiwiZW1haWwiOiJzYWlAZ21haWwuY29tIn0.n3HbZOF9NjeTiLqfckc4WEKwdKKg0v3lCeHVXrdYv-TqjSY-whVB7rL_InEhKtYSoObp9m_5pTtJCF_mgdaeDw

http://localhost:8081/v1/notes/create
{
    "id":"1",
    "noteTitle":"Sangeet",
    "description":"Sangeet must have music and songs",
    "date":12345
}

——————————
—————
now dont remove the bearer token
GET
http://localhost:8081/v1/notes
[
    {
        "id": "1",
        "noteTitle": "Sangeet",
        "description": "Sangeet must have music and songs",
        "date": 12345
    },
    {
        "id": "2",
        "noteTitle": "Haldi",
        "description": "Smoke gun plus lights",
        "date": 12345
    },
    {
        "id": "3",
        "noteTitle": "Mehendi",
        "description": "Food must be provided",
        "date": 12345
    }
]

—————————————————
————————————————

UPDATE
POST
http://localhost:8081/v1/notes/update
{
        "id": "2",
        "noteTitle": "Haldi",
        "description": "Smoke gun plus lights and also bring haldi and vicco turmeric",
        "date": 12345
}

{
    "success": true,
    "message": "Note Updated Successfully!"
}

—————————————————
————————————————

DELETE
http://localhost:8081/v1/notes/delete?id=1
{
    "success": true,
    "message": "Note Deleted Successfully!"
}

