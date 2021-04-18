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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `slug` varchar(45) NOT NULL,
  `description` text NOT NULL,
  `image` varchar(45) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `category_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL,
  `updated_at` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `category_id_fk` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (14,'Apples','apples','Nice apples','apples.jpg',1.99,4,'2019-07-02 08:52:17','2019-07-02 09:10:03'),(15,'Bananas','bananas','Tasty bananas','bananas.jpg',3.99,4,'2019-07-02 08:52:48','2019-07-02 09:01:31'),(16,'Black shirt','black-shirt','A black shirt','black shirt.jpg',5.99,1,'2019-07-02 08:53:08','2019-07-02 08:53:08'),(17,'Blue shirt','blue-shirt','A blue shirt','blue shirt.jpg',6.99,1,'2019-07-02 08:53:26','2019-07-02 08:53:26'),(18,'Graperuit','graperuit','Juicy grapefruit','grapefruit.jpg',3.99,4,'2019-07-02 08:53:57','2019-07-02 08:53:57'),(19,'Grapes','grapes','Great grapes','grapes.jpg',2.50,4,'2019-07-02 08:54:19','2019-07-02 08:54:19'),(20,'Grey shirt','grey-shirt','A grey shirt','grey shirt.jpg',3.99,1,'2019-07-02 08:54:35','2019-07-02 08:54:35'),(21,'Kiwi','kiwi','Fresh kiwi','kiwi.jpg',4.99,4,'2019-07-02 08:54:57','2019-07-02 08:54:57'),(22,'Pink shirt','pink-shirt','A pink shirt','pink shirt.jpg',7.99,1,'2019-07-02 08:55:21','2019-07-02 08:55:21'),(23,'Watermelon','watermelon','Juicy watermelon','watermelon.jpg',1.50,4,'2019-07-02 08:55:53','2019-07-02 08:55:53'),(24,'White shirt','white-shirt','A white shirt','white shirt.jpg',4.50,1,'2019-07-02 08:56:11','2019-07-02 08:56:11'),(25,'Yellow shirt','yellow-shirt','A yellow shirt','yellow shirt.jpg',3.50,1,'2019-07-02 08:56:31','2019-07-02 08:56:31');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-12 21:13:05
