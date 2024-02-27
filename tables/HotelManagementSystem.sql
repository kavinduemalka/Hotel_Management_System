-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: hotelmanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `customer_id` varchar(5) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone_number` varchar(15) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES ('CS001','Pasan','Perera','pasan@gmail.com','712345656','No23,Araliya mawatha,Horana','M'),('CS009','Akila','Fonseka','akila123@gmail.com','765678897','No34,Ukwatta road,Ganemulla','M'),('CS012','Kasun','Samarasinghe','Kasun95@gmail.com','778912000','No75,Godigamuwa,Batuwita','M'),('CS020','Kanthi','Jayakody','jaya88@gmail.com','755523431','No234/2,Ella road,Maharagama','F'),('CS030','Malki','Herath','malkijayashani1996@gmail.com','770456450','No22,Vijaya mawatha,Kaduwela','F'),('CS035','Amal','Perera','amal675@gmail.com','789090345','No223,Hena mawatha,Kurunegala','M');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservations` (
  `ReservationID` varchar(5) NOT NULL,
  `RoomID` varchar(5) DEFAULT NULL,
  `CustomerID` varchar(5) DEFAULT NULL,
  `ReservationDate` date DEFAULT NULL,
  `ReservationTime` time DEFAULT NULL,
  `Package` varchar(20) DEFAULT NULL,
  `ReservationAmount` decimal(10,2) DEFAULT NULL,
  `IsCancelled` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ReservationID`),
  KEY `RoomID` (`RoomID`),
  KEY `CustomerID` (`CustomerID`),
  CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`RoomID`) REFERENCES `rooms` (`RoomID`),
  CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`CustomerID`) REFERENCES `customers` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
INSERT INTO `reservations` VALUES ('RS001','R001','CS001','2024-02-26','23:03:31',NULL,2000.00,1),('RS003','R045','CS012','2024-02-27','18:11:08',NULL,5000.00,0),('RS032','R062','CS020','2024-02-27','18:14:30',NULL,7500.00,0);
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roomcategory`
--

DROP TABLE IF EXISTS `roomcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roomcategory` (
  `CategoryID` varchar(5) NOT NULL,
  `CategoryName` varchar(50) NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `Capacity` int DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  `Facilities` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CategoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roomcategory`
--

LOCK TABLES `roomcategory` WRITE;
/*!40000 ALTER TABLE `roomcategory` DISABLE KEYS */;
INSERT INTO `roomcategory` VALUES ('CT01','Single','Non A/C',1,2000.00,NULL),('CT02','Single','A/C',1,3500.00,NULL),('CT03','Double','Non A/C',2,3500.00,NULL),('CT04','Double','A/C',2,5000.00,NULL),('CT05','Triple','Non A/C',3,5000.00,NULL),('CT06','Triple','A/C',3,6500.00,NULL),('CT07','Family','Non A/C',5,7500.00,NULL),('CT08','Family','A/C',5,9000.00,NULL);
/*!40000 ALTER TABLE `roomcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rooms`
--

DROP TABLE IF EXISTS `rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rooms` (
  `RoomID` varchar(5) NOT NULL,
  `RoomNumber` varchar(50) DEFAULT NULL,
  `CategoryID` varchar(5) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `OtherRelevantDetails` text,
  PRIMARY KEY (`RoomID`),
  KEY `CategoryID` (`CategoryID`),
  CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`CategoryID`) REFERENCES `roomcategory` (`CategoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooms`
--

LOCK TABLES `rooms` WRITE;
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` VALUES ('R001','101','CT01','Available',NULL),('R011','111','CT02','Available',NULL),('R045','145','CT05','Available',NULL),('R062','162','CT07','Available',NULL),('R069','169','CT08','Available',NULL);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `nic` varchar(15) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Kavindu Emalka','970792345V','emalka@gmail.com','0772020201','Emalka','1234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-27 21:49:44
