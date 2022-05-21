# Movie API

## Project structure
This project contains 4 main folders such as: controllers, entities, repos, and svcs
- controllers are where the api endpoints live.
- svcs are where the business logics live.
- entities are the location of the table models
- repos are the place to put interfaces for interactions with database such as CRUD

## RUN WITH DOCKER


You can just execute *run.sh* which is my custom shell script file and then it will start up mysql version 5.7.35 and movie project which will be running
on port **8080**.

When running movie project with docker it takes 5 environment variabless **DB_USER, DB_PW, DB_PORT, DB_URL, DB_NAME**
- DB_USER your mysql username
- DB_PW your mysql password
- DB_PORT your mysql port
- DB_URL your mysql database url
- DB_NAME your mysql database name

## API ENDPOINT

After successfully running the project you can access available endpoints like mentioned below:

**Please note that you need to create category first before you can precess to create movie.**

### Category API
- GET : /api/category  will list all available category
- POST: /api/category  will be used for creating category. it takes name and des as a json body


### Movie API
- GET: /api/movie will list all available movie
- GET: /api/movie/{id} will list one movie base on its id
- POST: /api/movie create a movie (title,rating, and cat_id)
- PUT: /api/movie update a movie (id, title,rating, and cat_id)
- DELETE: /api/movie/{id} delete a movie by id

**Thank you !!! ;)**


In case you want to know about me you can find out more about me at [Check me out](https://.lyhengtep.com)


**HAPPY CODING**
