-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.47-0ubuntu0.14.04.1 - (Ubuntu)
-- Server OS:                    debian-linux-gnu
-- HeidiSQL Version:             9.0.0.4865
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for RelationalDB
CREATE DATABASE IF NOT EXISTS `RelationalDB` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `RelationalDB`;


-- Dumping structure for table RelationalDB.Geo_Codes
CREATE TABLE IF NOT EXISTS `Geo_Codes` (
  `hotel_id` int(11) NOT NULL,
  `langitude` int(11) NOT NULL,
  `latitude` int(11) NOT NULL,
  `lastupdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`hotel_id`),
  CONSTRAINT `FK_Geo_Codes_Hotel_Details` FOREIGN KEY (`hotel_id`) REFERENCES `Hotel_Details` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table RelationalDB.Geo_Codes: ~1 rows (approximately)
DELETE FROM `Geo_Codes`;
/*!40000 ALTER TABLE `Geo_Codes` DISABLE KEYS */;
INSERT INTO `Geo_Codes` (`hotel_id`, `langitude`, `latitude`, `lastupdate`) VALUES
	(1, 123, 123, '2017-12-26 09:48:02');
/*!40000 ALTER TABLE `Geo_Codes` ENABLE KEYS */;


-- Dumping structure for table RelationalDB.Hotel_Details
CREATE TABLE IF NOT EXISTS `Hotel_Details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `lastupdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table RelationalDB.Hotel_Details: ~1 rows (approximately)
DELETE FROM `Hotel_Details`;
/*!40000 ALTER TABLE `Hotel_Details` DISABLE KEYS */;
INSERT INTO `Hotel_Details` (`id`, `name`, `lastupdate`) VALUES
	(1, 'mahesh', '2017-12-26 09:47:44');
/*!40000 ALTER TABLE `Hotel_Details` ENABLE KEYS */;


-- Dumping structure for table RelationalDB.Packages
CREATE TABLE IF NOT EXISTS `Packages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `room_id` int(11) NOT NULL,
  `lastupdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_Packages_Room` (`room_id`),
  CONSTRAINT `FK_Packages_Room` FOREIGN KEY (`room_id`) REFERENCES `Room` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table RelationalDB.Packages: ~1 rows (approximately)
DELETE FROM `Packages`;
/*!40000 ALTER TABLE `Packages` DISABLE KEYS */;
INSERT INTO `Packages` (`id`, `name`, `room_id`, `lastupdate`) VALUES
	(1, 'hrs', 1, '2018-01-04 21:19:22');
/*!40000 ALTER TABLE `Packages` ENABLE KEYS */;


-- Dumping structure for table RelationalDB.Package_Has_Validity
CREATE TABLE IF NOT EXISTS `Package_Has_Validity` (
  `packageId` int(11) NOT NULL,
  `validityId` int(11) NOT NULL,
  PRIMARY KEY (`packageId`,`validityId`),
  KEY `FK_Package_Has_Validity_Validity` (`validityId`),
  CONSTRAINT `FK_Package_Has_Validity_Packages` FOREIGN KEY (`packageId`) REFERENCES `Packages` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_Package_Has_Validity_Validity` FOREIGN KEY (`validityId`) REFERENCES `Validity` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table RelationalDB.Package_Has_Validity: ~1 rows (approximately)
DELETE FROM `Package_Has_Validity`;
/*!40000 ALTER TABLE `Package_Has_Validity` DISABLE KEYS */;
INSERT INTO `Package_Has_Validity` (`packageId`, `validityId`) VALUES
	(1, 1);
/*!40000 ALTER TABLE `Package_Has_Validity` ENABLE KEYS */;


-- Dumping structure for table RelationalDB.Room
CREATE TABLE IF NOT EXISTS `Room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `lastupdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table RelationalDB.Room: ~1 rows (approximately)
DELETE FROM `Room`;
/*!40000 ALTER TABLE `Room` DISABLE KEYS */;
INSERT INTO `Room` (`id`, `name`, `lastupdate`) VALUES
	(1, 'single', '2018-01-04 21:17:09');
/*!40000 ALTER TABLE `Room` ENABLE KEYS */;


-- Dumping structure for table RelationalDB.Validity
CREATE TABLE IF NOT EXISTS `Validity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start` date NOT NULL,
  `end` date NOT NULL,
  `lastupdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table RelationalDB.Validity: ~1 rows (approximately)
DELETE FROM `Validity`;
/*!40000 ALTER TABLE `Validity` DISABLE KEYS */;
INSERT INTO `Validity` (`id`, `start`, `end`, `lastupdate`) VALUES
	(1, '2018-01-05', '2018-01-05', '2018-01-05 22:35:02');
/*!40000 ALTER TABLE `Validity` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
