-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: Test
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `exceltable`
--

DROP TABLE IF EXISTS `exceltable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exceltable` (
  `id` int NOT NULL AUTO_INCREMENT,
  `company` varchar(20) DEFAULT NULL,
  `fact_qliq_01_03_2022` int NOT NULL,
  `fact_qliq_02_03_2022` int NOT NULL,
  `fact_qoil_01_03_2022` int NOT NULL,
  `fact_qoil_02_03_2022` int NOT NULL,
  `forecast_qliq_01_03_2022` int NOT NULL,
  `forecast_qliq_02_03_2022` int NOT NULL,
  `forecast_qoil_01_03_2022` int NOT NULL,
  `forecast_qoil_02_03_2022` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exceltable`
--

LOCK TABLES `exceltable` WRITE;
/*!40000 ALTER TABLE `exceltable` DISABLE KEYS */;
INSERT INTO `exceltable` VALUES (1,'company1',10,20,30,40,12,22,15,25),(2,'company2',11,21,31,41,13,23,20,30),(3,'company1',12,22,32,42,14,24,25,35),(4,'company2',13,23,33,43,15,25,30,40),(5,'company1',14,24,34,44,16,26,35,45),(6,'company2',15,25,35,45,17,27,40,50),(7,'company1',16,26,36,46,18,28,45,55),(8,'company2',17,27,37,47,19,29,50,60),(9,'company1',18,28,38,48,20,30,55,65),(10,'company2',19,29,39,49,21,31,60,70),(11,'company1',20,30,40,50,22,32,65,75),(12,'company2',21,31,41,51,23,33,70,80),(13,'company1',22,32,42,52,24,34,75,85),(14,'company2',23,33,43,53,25,35,80,90),(15,'company1',24,34,44,54,26,36,85,95),(16,'company2',25,35,45,55,27,37,90,100),(17,'company1',26,36,46,56,28,38,95,105),(18,'company2',27,37,47,57,29,39,100,110),(19,'company1',28,38,48,58,30,40,105,115),(20,'company2',29,39,49,59,31,41,110,120);
/*!40000 ALTER TABLE `exceltable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-02 16:44:33
