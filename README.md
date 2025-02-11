# ParkingLot System

## Overview
This project is a simple **multi-level parking lot system** built in Java. It simulates vehicle parking and exiting based on predefined rules for different vehicle sizes.

## Features
- **Entry & Exit Gates**: Vehicles enter and exit through designated gates.
- **Vehicle Size-Based Parking**:
    - **S (Small)** vehicles can park in **M (Medium)** or **L (Large)** spots if S is full.
    - **M (Medium)** vehicles can park in **L (Large)** spots if M is full.
    - **L (Large)** vehicles can only park in L spots.
- **Multi-threading**: Simulates concurrent vehicle entry and exit.

## Project Structure

```
parking-lot/
├── src/
│   ├── main/
│   │   ├── java/org/ag/practice/
│   │   │   ├── gates/    # Entry & Exit Gates
│   │   │   ├── model/    # Vehicle & Parking Models
│   │   │   ├── implementation/  # ParkingLot Logic
│   │   ├── resources/
│   ├── test/
│   │   ├── java/org/ag/practice/tests/ # Unit Tests
├── pom.xml (Maven Dependencies)
├── Dockerfile (Containerization)
├── README.md
```
## Installation & Setup

### Prerequisites
- **Java 17** or higher
- **Maven 3.9.9**
- **Docker (optional)**

### Clone the Repository
```sh
git clone https://github.com/aloksguha/ParkingLot.git
cd ParkingLot
```
### Running Tests
```
mvn clean test
mvn clean package
java -jar target/ParkingLot-1.0.jar
```
### Docker Integration

```
<--- working now ---->
docker build -t parking-lot .
docker run 
```

## Future Improvements

- Implement database storage for parked vehicles.

- Add REST API for parking management.

- Introduce Web UI for easy interaction.

# Author

## Alok Guha
#### aloksguha@gmail.com



