# Car Management System

## Overview

The Car Management System is a web-based application built using Spring Boot that allows users to perform CRUD operations (Create, Read, Update, Delete) on car information. It supports additional features like global search, pagination, sorting, and API documentation with Swagger.

## Features

- **CRUD Operations**: 
  - Add new cars with details like name, model, year, price, color, and fuel type.
  - View a list of all cars and filter them by name, model, year, color, or fuel type.
  - Update the details of an existing car.
  - Delete a car from the database.
  
- **Additional Features**:
  - **Global Search**: Search cars by name, model, year, color, or fuel type.
  - **Pagination & Sorting**: Display large datasets efficiently with pagination and sorting.
  - **Validation**: Input validation to ensure correct data is submitted.
  - **API Documentation**: API endpoints are documented using Swagger.
  - **API Hosting**: The APIs can be deployed to a cloud platform such as AWS, Azure, or others.

## Technologies Used

- **Backend**: Spring Boot
- **Database**: MySQL or PostgreSQL
- **API Documentation**: Swagger
- **Cloud Deployment**: (AWS, Azure, etc.)

## API Endpoints

### 1. Create a Car
- **POST** `/api/cars`
- **Request Body**:
  ```json
  {
    "carName": "Toyota Camry",
    "model": "2023",
    "year": 2023,
    "price": 30000,
    "color": "Black",
    "fuelType": "Petrol"
  }
