-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: cmsshoppingcart
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pages`
--

DROP TABLE IF EXISTS `pages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `slug` varchar(45) NOT NULL,
  `content` text NOT NULL,
  `sorting` int(3) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pages`
--

LOCK TABLES `pages` WRITE;
/*!40000 ALTER TABLE `pages` DISABLE KEYS */;
INSERT INTO `pages` VALUES (1,'Home','home','<h2>Home Page</h2><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vel metus vel nisl tempus suscipit. Praesent a varius elit. Cras accumsan ultricies vestibulum. Sed aliquam tellus sollicitudin purus cursus placerat. Suspendisse et vestibulum purus. Phasellus nisi orci, lobortis in mattis blandit, lacinia non lorem. Cras ex nulla, pulvinar vulputate justo eu, ultrices ullamcorper dui. Nulla sed urna venenatis lacus vestibulum accumsan. Vestibulum facilisis libero id mauris bibendum sodales. Suspendisse sit amet dignissim nisl, eget hendrerit est. Ut fringilla semper sollicitudin. Pellentesque sed porta eros, ut ultrices eros. Praesent porttitor sem est.</p>',0),(2,'Services','services','<h2>Services&nbsp;</h2><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vel metus vel nisl tempus suscipit. Praesent a varius elit. Cras accumsan ultricies vestibulum. Sed aliquam tellus sollicitudin purus cursus placerat. Suspendisse et vestibulum purus. Phasellus nisi orci, lobortis in mattis blandit, lacinia non lorem. Cras ex nulla, pulvinar vulputate justo eu, ultrices ullamcorper dui. Nulla sed urna venenatis lacus vestibulum accumsan. Vestibulum facilisis libero id mauris bibendum sodales. Suspendisse sit amet dignissim nisl, eget hendrerit est. Ut fringilla semper sollicitudin. Pellentesque sed porta eros, ut ultrices eros. Praesent porttitor sem est.</p>',2),(4,'About Us','about-us','<h2>About Us</h2><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vel metus vel nisl tempus suscipit. Praesent a varius elit. Cras accumsan ultricies vestibulum. Sed aliquam tellus sollicitudin purus cursus placerat. Suspendisse et vestibulum purus. Phasellus nisi orci, lobortis in mattis blandit, lacinia non lorem. Cras ex nulla, pulvinar vulputate justo eu, ultrices ullamcorper dui. Nulla sed urna venenatis lacus vestibulum accumsan. Vestibulum facilisis libero id mauris bibendum sodales. Suspendisse sit amet dignissim nisl, eget hendrerit est. Ut fringilla semper sollicitudin. Pellentesque sed porta eros, ut ultrices eros. Praesent porttitor sem est.</p>',1),(6,'Contact ','contact','<h2>Contact</h2><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vel metus vel nisl tempus suscipit. Praesent a varius elit. Cras accumsan ultricies vestibulum. Sed aliquam tellus sollicitudin purus cursus placerat. Suspendisse et vestibulum purus. Phasellus nisi orci, lobortis in mattis blandit, lacinia non lorem. Cras ex nulla, pulvinar vulputate justo eu, ultrices ullamcorper dui. Nulla sed urna venenatis lacus vestibulum accumsan. Vestibulum facilisis libero id mauris bibendum sodales. Suspendisse sit amet dignissim nisl, eget hendrerit est. Ut fringilla semper sollicitudin. Pellentesque sed porta eros, ut ultrices eros. Praesent porttitor sem est.</p>',100);
/*!40000 ALTER TABLE `pages` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-12 21:13:06
